package com.example.junittesting

import android.content.Context

class StringValidator {
    fun isStringEqual(context:Context, resId:Int, string: String):Boolean{
        return context.getString(resId)==string
    }
}