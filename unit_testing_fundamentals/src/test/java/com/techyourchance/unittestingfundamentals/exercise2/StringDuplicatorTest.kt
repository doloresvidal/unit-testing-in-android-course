package com.techyourchance.unittestingfundamentals.exercise2

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.Before
import org.junit.Test

class StringDuplicatorTest {

    private lateinit var stringDuplicator: StringDuplicator

    @Before
    fun setUp() {
        stringDuplicator = StringDuplicator()
    }

    @Test
    fun stringDuplicator_emptyString_emptyStringReturned() {
        val result = stringDuplicator.duplicate("")
        MatcherAssert.assertThat(result, CoreMatchers.equalTo(""))
    }

    @Test
    fun stringDuplicator_oneCharacter_duplicatedStringReturned() {
        val result = stringDuplicator.duplicate("a")
        MatcherAssert.assertThat(result, CoreMatchers.equalTo("aa"))
    }

    @Test
    fun stringDuplicator_string_duplicatedStringReturned() {
        val result = stringDuplicator.duplicate("hola")
        MatcherAssert.assertThat(result, CoreMatchers.equalTo("holahola"))
    }
}