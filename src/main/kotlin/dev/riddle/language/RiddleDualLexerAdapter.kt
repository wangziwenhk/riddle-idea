package dev.riddle.language

import antlr.RiddleLexer
import com.intellij.lexer.Lexer
import com.intellij.lexer.LexerBase
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.Token as ANTLRToken

class RiddleDualLexerAdapter : LexerBase() {
    private var editorLexer: ANTLRLexerAdaptor? = null
    private var text: CharSequence = ""
    private var startOffset = 0
    private var endOffset = 0
    private var initialState = 0
    private var currentTokenType: IElementType? = null
    private var currentTokenStart = 0
    private var currentTokenEnd = 0

    private val tokensIElementTypes = PSIElementTypeFactory.getTokenIElementTypes(RiddleLanguage.INSTANCE)
    private val whiteSpaceTokens = TokenSet.create(
        tokensIElementTypes[RiddleLexer.WHITESPACE],
        tokensIElementTypes[RiddleLexer.LINE_COMMENT],
        tokensIElementTypes[RiddleLexer.BLOCK_COMMENT]
    )

    override fun start(buffer: CharSequence, startOffset: Int, endOffset: Int, initialState: Int) {
        this.text = buffer
        this.startOffset = startOffset
        this.endOffset = endOffset
        this.initialState = initialState

        // 创建一个新的编辑器词法分析器实例
        val antlrLexer = RiddleLexer(CharStreams.fromString(buffer.subSequence(startOffset, endOffset).toString()))
        this.editorLexer = ANTLRLexerAdaptor(RiddleLanguage.INSTANCE, antlrLexer)
        this.editorLexer?.start(buffer, startOffset, endOffset, initialState)

        advance()
    }

    override fun getState(): Int {
        return editorLexer?.state ?: initialState
    }

    override fun getTokenType(): IElementType? {
        return currentTokenType
    }

    override fun getTokenStart(): Int {
        return currentTokenStart
    }

    override fun getTokenEnd(): Int {
        return currentTokenEnd
    }

    override fun advance() {
        editorLexer?.let { lexer ->
            lexer.advance()
            if (lexer.tokenType == null) {
                currentTokenType = null
                return
            }

            currentTokenType = lexer.tokenType
            currentTokenStart = lexer.tokenStart
            currentTokenEnd = lexer.tokenEnd
        } ?: run {
            currentTokenType = null
        }
    }

    override fun getBufferSequence(): CharSequence {
        return text
    }

    override fun getBufferEnd(): Int {
        return endOffset
    }
}
