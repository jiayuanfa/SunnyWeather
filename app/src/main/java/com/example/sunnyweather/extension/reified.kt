package com.example.sunnyweather.extension

import android.content.Context
import android.content.Intent

/**
 * 使用inline关键字 和 reified关键字 简化startActivity的写法
 */
inline fun <reified T> startActivity(context: Context, block: Intent.() -> Unit) {
    val intent = Intent(context, T::class.java)
    intent.block()
    context.startActivity(intent)
}