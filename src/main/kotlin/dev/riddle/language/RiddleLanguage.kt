package dev.riddle.language

import com.intellij.lang.Language

class RiddleLanguage:Language("Riddle") {
    companion object {
        val INSTANCE = RiddleLanguage()
    }

}