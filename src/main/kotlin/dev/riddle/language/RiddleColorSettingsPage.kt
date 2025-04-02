package dev.riddle.language

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import javax.swing.Icon

class RiddleColorSettingsPage : ColorSettingsPage {
    private val DESCRIPTORS = arrayOf(
        AttributesDescriptor("关键字", RiddleSyntaxHighlighter.KEYWORDS),
        AttributesDescriptor("字符串", RiddleSyntaxHighlighter.STRINGS),
        AttributesDescriptor("注释", RiddleSyntaxHighlighter.COMMENTS),
        AttributesDescriptor("数字", RiddleSyntaxHighlighter.NUMBERS),
        AttributesDescriptor("运算符", RiddleSyntaxHighlighter.OPERATORS),
        AttributesDescriptor("圆括号", RiddleSyntaxHighlighter.PARENTHESES),
        AttributesDescriptor("花括号", RiddleSyntaxHighlighter.BRACES),
        AttributesDescriptor("方括号", RiddleSyntaxHighlighter.BRACKETS),
        AttributesDescriptor("标识符", RiddleSyntaxHighlighter.IDENTIFIER),
        AttributesDescriptor("无效字符", RiddleSyntaxHighlighter.BAD_CHARACTER)
    )

    override fun getIcon(): Icon = RiddleIcons.FILE
    override fun getHighlighter(): SyntaxHighlighter = RiddleSyntaxHighlighter()
    override fun getDemoText(): String = """
        // 这是一个Riddle语言示例文件
        package com.example.riddle

        import std.io

        /*
         * 这是一个类定义
         */
        class MyClass {
            var x: int = 10;
            val PI: float = 3.14;
            
            fun add(a: int, b: int) -> int {
                return a + b;
            }
            
            fun main() {
                var result = add(5, 7);
                if (result > 10) {
                    println("结果大于10");
                } else {
                    println("结果小于等于10");
                }
                
                for (var i = 0; i < 10; i++) {
                    if (i % 2 == 0) {
                        continue;
                    }
                    println(i);
                }
                
                var hex = 0xFF;
                var bin = 0b101;
                var oct = 07;
            }
        }
    """.trimIndent()

    override fun getAdditionalHighlightingTagToDescriptorMap(): Map<String, TextAttributesKey>? = null
    override fun getAttributeDescriptors(): Array<AttributesDescriptor> = DESCRIPTORS
    override fun getColorDescriptors(): Array<ColorDescriptor> = ColorDescriptor.EMPTY_ARRAY
    override fun getDisplayName(): String = "Riddle"
}
