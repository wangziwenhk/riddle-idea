package dev.riddle.language

import com.intellij.psi.tree.IElementType
import org.jetbrains.annotations.NonNls

class TokenIElementType(private val tokenType: Int, @NonNls debugName: String, language: RiddleLanguage) :
    IElementType(debugName, language) {

    fun getANTLRTokenType(): Int = tokenType
}