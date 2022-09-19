package com.example.junittesting

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class StringValidatorTest{

    private lateinit var stringValidator: StringValidator

    @Before
    fun setup(){
        stringValidator = StringValidator()
    }

    @Test
    fun stringIsSameOrNot_returnTrue(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        var result = stringValidator.isStringEqual(context,R.string.app_name,"Junit")
        assertThat(result).isFalse()
    }
}