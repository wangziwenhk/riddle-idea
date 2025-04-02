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
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory
import org.antlr.intellij.adaptor.parser.ANTLRParserAdaptor
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode
import org.antlr.v4.runtime.Parser
import org.antlr.v4.runtime.tree.ParseTree

class RiddleParserDefinition : ParserDefinition {
    companion object {
        init {
            PSIElementTypeFactory.defineLanguageIElementTypes(
                RiddleLanguage.INSTANCE,
                RiddleLexer.tokenNames,
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

        val KEYWORDS = TokenSet.create(
            PSIElementTypeFactory.getTokenIElementTypes(RiddleLanguage.INSTANCE)[RiddleLexer.Var],
            PSIElementTypeFactory.getTokenIElementTypes(RiddleLanguage.INSTANCE)[RiddleLexer.Val],
            PSIElementTypeFactory.getTokenIElementTypes(RiddleLanguage.INSTANCE)[RiddleLexer.For],
            PSIElementTypeFactory.getTokenIElementTypes(RiddleLanguage.INSTANCE)[RiddleLexer.While],
            PSIElementTypeFactory.getTokenIElementTypes(RiddleLanguage.INSTANCE)[RiddleLexer.If],
            PSIElementTypeFactory.getTokenIElementTypes(RiddleLanguage.INSTANCE)[RiddleLexer.Else],
            PSIElementTypeFactory.getTokenIElementTypes(RiddleLanguage.INSTANCE)[RiddleLexer.Func],
            PSIElementTypeFactory.getTokenIElementTypes(RiddleLanguage.INSTANCE)[RiddleLexer.Return],
            PSIElementTypeFactory.getTokenIElementTypes(RiddleLanguage.INSTANCE)[RiddleLexer.Class],
            PSIElementTypeFactory.getTokenIElementTypes(RiddleLanguage.INSTANCE)[RiddleLexer.Package],
            PSIElementTypeFactory.getTokenIElementTypes(RiddleLanguage.INSTANCE)[RiddleLexer.Import]
        )
    }

    override fun createLexer(project: Project): Lexer {
        val lexer = RiddleLexer(null)
        return ANTLRLexerAdaptor(RiddleLanguage.INSTANCE, lexer)
    }

    override fun createParser(project: Project): PsiParser {
        val parser = RiddleParser(null)
        return object : ANTLRParserAdaptor(RiddleLanguage.INSTANCE, parser) {
            override fun parse(parser: Parser, root: IElementType): ParseTree {
                // 指定解析的起点规则
                return if (root is IFileElementType) {
                    (parser as RiddleParser).program()
                } else {
                    (parser as RiddleParser).statement()
                }
            }
        }
    }

    override fun getFileNodeType(): IFileElementType = FILE
    override fun getCommentTokens(): TokenSet = COMMENTS
    override fun getStringLiteralElements(): TokenSet = STRING_LITERALS
    override fun createElement(node: ASTNode): PsiElement = ANTLRPsiNode(node)
    override fun createFile(viewProvider: FileViewProvider): PsiFile = RiddleFile(viewProvider)
}
