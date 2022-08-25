package com.techyourchance.unittestingfundamentals.exercise1

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class NegativeNumberValidatorTest {

    private lateinit var negativeNumberValidator: NegativeNumberValidator

    @Before
    fun setUp() {
        negativeNumberValidator = NegativeNumberValidator()
    }

    @Test
    fun test_1() {
        val result: Boolean = negativeNumberValidator.isNegative(-1)
        MatcherAssert.assertThat(result, CoreMatchers.equalTo(true))
    }

    @Test
    fun test0() {
        val result: Boolean = negativeNumberValidator.isNegative(0)
        MatcherAssert.assertThat(result, CoreMatchers.`is`(false))
    }

    @Test
    fun test1() {
        val result: Boolean = negativeNumberValidator.isNegative(1)
        MatcherAssert.assertThat(result, CoreMatchers.`is`(false))
    }
}