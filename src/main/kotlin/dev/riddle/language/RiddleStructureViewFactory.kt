package dev.riddle.language

import com.intellij.ide.structureView.*
import com.intellij.ide.structureView.impl.common.PsiTreeElementBase
import com.intellij.lang.PsiStructureViewFactory
import com.intellij.openapi.editor.Editor
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.util.PsiTreeUtil
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode

class RiddleStructureViewFactory : PsiStructureViewFactory {
    override fun getStructureViewBuilder(psiFile: PsiFile): StructureViewBuilder {
        return object : TreeBasedStructureViewBuilder() {
            override fun createStructureViewModel(editor: Editor?): StructureViewModel {
                return RiddleStructureViewModel(psiFile)
            }
        }
    }

    private class RiddleStructureViewModel(psiFile: PsiFile) :
        StructureViewModelBase(psiFile, RiddleStructureViewElement(psiFile)),
        StructureViewModel.ElementInfoProvider {

        override fun isAlwaysShowsPlus(element: StructureViewTreeElement): Boolean = false
        override fun isAlwaysLeaf(element: StructureViewTreeElement): Boolean =
            element is RiddleStructureViewElement && element.isLeaf
    }

    private class RiddleStructureViewElement(element: PsiElement) : PsiTreeElementBase<PsiElement>(element) {
        val isLeaf: Boolean
            get() {
                val node = element ?: return true
                if (node is PsiFile) return false

                // 检查是否有函数或类
                val text = node.text
                return !text.contains("fun ") && !text.contains("class ")
            }

        override fun getChildrenBase(): Collection<StructureViewTreeElement> {
            val result = ArrayList<StructureViewTreeElement>()
            val element = element ?: return result

            if (element is PsiFile) {
                // 查找所有类和函数定义
                findClasses(element, result)
                findTopLevelFunctions(element, result)
            }
            else if (isClassDefinition(element)) {
                // 类内的方法
                findMethodsInClass(element, result)
            }

            return result
        }

        private fun findClasses(file: PsiElement, result: MutableList<StructureViewTreeElement>) {
            val allNodes = PsiTreeUtil.findChildrenOfType(file, ANTLRPsiNode::class.java)
            for (node in allNodes) {
                if (isClassDefinition(node)) {
                    result.add(RiddleStructureViewElement(node))
                }
            }
        }

        private fun findTopLevelFunctions(file: PsiElement, result: MutableList<StructureViewTreeElement>) {
            val allNodes = PsiTreeUtil.findChildrenOfType(file, ANTLRPsiNode::class.java)
            for (node in allNodes) {
                if (isFunctionDefinition(node) && !isInsideClass(node)) {
                    result.add(RiddleStructureViewElement(node))
                }
            }
        }

        private fun findMethodsInClass(classNode: PsiElement, result: MutableList<StructureViewTreeElement>) {
            val allNodes = PsiTreeUtil.findChildrenOfType(classNode, ANTLRPsiNode::class.java)
            for (node in allNodes) {
                if (isFunctionDefinition(node)) {
                    result.add(RiddleStructureViewElement(node))
                }
            }
        }

        private fun isClassDefinition(element: PsiElement): Boolean {
            val text = element.text
            return text.trim().startsWith("class ")
        }

        private fun isFunctionDefinition(element: PsiElement): Boolean {
            val text = element.text
            return text.contains("fun ") && (text.contains("(") && text.contains(")"))
        }

        private fun isInsideClass(element: PsiElement): Boolean {
            var parent = element.parent
            while (parent != null) {
                if (isClassDefinition(parent)) return true
                parent = parent.parent
            }
            return false
        }

        override fun getPresentableText(): String {
            val element = element ?: return ""

            if (element is PsiFile) {
                return element.name
            }

            val text = element.text.trim()

            // 提取类名
            if (isClassDefinition(element)) {
                val classNameRegex = "class\\s+(\\w+)".toRegex()
                val matchResult = classNameRegex.find(text)
                return matchResult?.groupValues?.get(1) ?: "Unknown class"
            }

            // 提取函数名和参数
            if (isFunctionDefinition(element)) {
                val funcNameRegex = "fun\\s+(\\w+)\\s*\\(".toRegex()
                val matchResult = funcNameRegex.find(text)
                val funcName = matchResult?.groupValues?.get(1) ?: "Unknown function"

                // 尝试提取参数
                val paramsRegex = "\\(([^)]*)\\)".toRegex()
                val paramsMatch = paramsRegex.find(text)
                val params = paramsMatch?.groupValues?.get(1) ?: ""

                return "$funcName($params)"
            }

            return text
        }
    }
}
