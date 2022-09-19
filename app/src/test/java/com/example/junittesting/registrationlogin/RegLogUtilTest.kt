package com.example.junittesting.registrationlogin

import com.google.common.truth.Truth.assertThat
import org.junit.Test
import kotlin.math.log

class RegLogUtilTest{
    @Test
    fun `empty username test`(){
        val result = RegLogUtil.validateRegistration(
            "",
            "123","123"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `password confirm password validity test`(){
        var result = RegLogUtil.validateRegistration(
            "abcdedd",
            "123",
            "1234"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `username already existence check`(){
        var result = RegLogUtil.validateRegistration(
            "abcd",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }
}
