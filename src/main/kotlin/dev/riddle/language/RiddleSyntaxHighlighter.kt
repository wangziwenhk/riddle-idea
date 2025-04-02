// src/main/kotlin/com/your/plugin/language/RiddleSyntaxHighlighter.kt
package dev.riddle.language

import antlr.RiddleLexer
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory
import org.antlr.intellij.adaptor.lexer.TokenIElementType

class RiddleSyntaxHighlighter : SyntaxHighlighterBase() {
    companion object {
        val KEYWORDS = createTextAttributesKey("RIDDLE_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)
        val COMMENTS = createTextAttributesKey("RIDDLE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
        val STRINGS = createTextAttributesKey("RIDDLE_STRING", DefaultLanguageHighlighterColors.STRING)
        val NUMBERS = createTextAttributesKey("RIDDLE_NUMBER", DefaultLanguageHighlighterColors.NUMBER)
        val OPERATORS = createTextAttributesKey("RIDDLE_OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN)
        val PARENTHESES = createTextAttributesKey("RIDDLE_PARENTHESES", DefaultLanguageHighlighterColors.PARENTHESES)
        val BRACES = createTextAttributesKey("RIDDLE_BRACES", DefaultLanguageHighlighterColors.BRACES)
        val BRACKETS = createTextAttributesKey("RIDDLE_BRACKETS", DefaultLanguageHighlighterColors.BRACKETS)
        val IDENTIFIER = createTextAttributesKey("RIDDLE_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER)
        val BAD_CHARACTER = createTextAttributesKey("RIDDLE_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER)

        private val EMPTY_KEYS = emptyArray<TextAttributesKey>()
        private val KEYWORDS_KEYS = arrayOf(KEYWORDS)
        private val COMMENTS_KEYS = arrayOf(COMMENTS)
        private val STRINGS_KEYS = arrayOf(STRINGS)
        private val NUMBERS_KEYS = arrayOf(NUMBERS)
        private val OPERATORS_KEYS = arrayOf(OPERATORS)
        private val PARENTHESES_KEYS = arrayOf(PARENTHESES)
        private val BRACES_KEYS = arrayOf(BRACES)
        private val BRACKETS_KEYS = arrayOf(BRACKETS)
        private val IDENTIFIER_KEYS = arrayOf(IDENTIFIER)
        private val BAD_CHAR_KEYS = arrayOf(BAD_CHARACTER)

        // 预加载词法单元类型
        private val tokenTypes = PSIElementTypeFactory.getTokenIElementTypes(RiddleLanguage.INSTANCE)
    }

    override fun getHighlightingLexer(): Lexer {
        val lexer = RiddleLexer(null)
        return ANTLRLexerAdaptor(RiddleLanguage.INSTANCE, lexer)
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        if (tokenType !is TokenIElementType) {
            return EMPTY_KEYS
        }

        // 获取ANTLR词法单元的索引
        val antlrTokenIndex = tokenType.antlrTokenType

        return when {
            // 关键字
            antlrTokenIndex in listOf(
                RiddleLexer.Var, RiddleLexer.Val, RiddleLexer.For, RiddleLexer.While, RiddleLexer.Continue,
                RiddleLexer.Break, RiddleLexer.If, RiddleLexer.Else, RiddleLexer.Func, RiddleLexer.Return,
                RiddleLexer.Import, RiddleLexer.Package, RiddleLexer.Class, RiddleLexer.True, RiddleLexer.False,
                RiddleLexer.Null, RiddleLexer.Try, RiddleLexer.Catch, RiddleLexer.Override, RiddleLexer.Static,
                RiddleLexer.Const, RiddleLexer.Public, RiddleLexer.Protected, RiddleLexer.Private,
                RiddleLexer.Virtual, RiddleLexer.Operator, RiddleLexer.Template, RiddleLexer.TypeName
            ) -> KEYWORDS_KEYS

            // 字符串和字符
            antlrTokenIndex in listOf(RiddleLexer.STRING, RiddleLexer.CHAR) -> STRINGS_KEYS

            // 注释
            antlrTokenIndex in listOf(RiddleLexer.LINE_COMMENT, RiddleLexer.BLOCK_COMMENT) -> COMMENTS_KEYS

            // 数字
            antlrTokenIndex in listOf(
                RiddleLexer.Decimal, RiddleLexer.Hexadecimal, RiddleLexer.Octal,
                RiddleLexer.Binary, RiddleLexer.Float
            ) -> NUMBERS_KEYS

            // 括号
            antlrTokenIndex in listOf(RiddleLexer.LeftBracket, RiddleLexer.RightBracket) -> PARENTHESES_KEYS
            antlrTokenIndex in listOf(RiddleLexer.LeftCurly, RiddleLexer.RightCurly) -> BRACES_KEYS
            antlrTokenIndex in listOf(RiddleLexer.LeftSquare, RiddleLexer.RightSquare) -> BRACKETS_KEYS

            // 运算符
            antlrTokenIndex in listOf(
                RiddleLexer.Add, RiddleLexer.Sub, RiddleLexer.Star, RiddleLexer.Div, RiddleLexer.Mod,
                RiddleLexer.Equal, RiddleLexer.Assign, RiddleLexer.Greater, RiddleLexer.Less,
                RiddleLexer.Not, RiddleLexer.And, RiddleLexer.Or, RiddleLexer.Xor,
                RiddleLexer.LeftLeft, RiddleLexer.RightRight, RiddleLexer.RightRightRight
            ) -> OPERATORS_KEYS

            // 标识符
            antlrTokenIndex == RiddleLexer.Identifier -> IDENTIFIER_KEYS

            // 错误字符
            tokenType === TokenType.BAD_CHARACTER -> BAD_CHAR_KEYS

            // 默认
            else -> EMPTY_KEYS
        }
    }
}
