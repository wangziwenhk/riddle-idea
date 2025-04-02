package dev.riddle.language

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class RiddleFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, RiddleLanguage.INSTANCE) {
    override fun getFileType(): FileType = RiddleFileType.INSTANCE
    override fun toString(): String = "Riddle File"
}
