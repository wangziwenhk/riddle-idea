package dev.riddle.language

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class RiddleFileType : LanguageFileType(RiddleLanguage.INSTANCE) {
    companion object {
        val INSTANCE = RiddleFileType()
    }

    override fun getName(): String {
        return "Riddle file"
    }

    override fun getDescription(): String {
        return "Riddle language file"
    }

    override fun getDefaultExtension(): String {
        return "red"
    }

    override fun getIcon(): Icon {
        return RiddleIcons.FILE
    }
}