package dev.riddle.language

import antlr.RiddleLexer
import antlr.RiddleParser
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory
import org.antlr.intellij.adaptor.parser.ANTLRParserAdaptor
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.Parser
import org.antlr.v4.runtime.tree.ParseTree

class RiddleParserDefinition : ParserDefinition {
    companion object {
        init {
            PSIElementTypeFactory.defineLanguageIElementTypes(
                RiddleLanguage.INSTANCE,
                RiddleParser.tokenNames,
                RiddleParser.ruleNames
            )
        }

        val FILE = IFileElementType(RiddleLanguage.INSTANCE)

        val COMMENTS = TokenSet.create(
            PSIElementTypeFactory.getTokenIElementTypes(RiddleLanguage.INSTANCE)[RiddleLexer.LINE_COMMENT],
            PSIElementTypeFactory.getTokenIElementTypes(RiddleLanguage.INSTANCE)[RiddleLexer.BLOCK_COMMENT]
        )

        val STRING_LITERALS = TokenSet.create(
            PSIElementTypeFactory.getTokenIElementTypes(RiddleLanguage.INSTANCE)[RiddleLexer.STRING]
        )
    }

    override fun createLexer(project: Project): Lexer {
        // 使用双层词法适配器
        return RiddleDualLexerAdapter()
    }

    override fun createParser(project: Project): PsiParser {
        return object : ANTLRParserAdaptor(RiddleLanguage.INSTANCE, RiddleParser(null)) {
            override fun parse(parser: Parser, root: IElementType): ParseTree {
                // 为解析器创建专用的词法分析器，使用skip处理空白
                val code = parser.inputStream.text
                val lexer = RiddleLexer(CharStreams.fromString(code))
                val tokenStream = CommonTokenStream(lexer)
                (parser as RiddleParser).tokenStream = tokenStream

                if (root is IFileElementType) {
                    return parser.program()
                }
                // 处理其他元素类型...
                throw UnsupportedOperationException("不支持的根元素类型: $root")
            }
        }
    }

    override fun getFileNodeType(): IFileElementType = FILE
    override fun getCommentTokens(): TokenSet = COMMENTS
    override fun getStringLiteralElements(): TokenSet = STRING_LITERALS
    override fun createElement(node: ASTNode): PsiElement = ANTLRPsiNode(node)
    override fun createFile(viewProvider: FileViewProvider): PsiFile = RiddleFile(viewProvider)
}
