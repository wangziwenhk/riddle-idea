package dev.riddle.language

import com.intellij.openapi.util.IconLoader
import com.intellij.util.IconUtil

class RiddleIcons {
    companion object {
        private val BASE_ICON = IconLoader.getIcon("/icons/icon.svg", RiddleIcons::class.java)
        val FILE = BASE_ICON
    }
}