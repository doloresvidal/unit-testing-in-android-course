package com.techyourchance.unittestingfundamentals.exercise3

import com.techyourchance.unittestingfundamentals.example3.Interval
import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class IntervalsAdjacencyDetectorTest {

    private lateinit var intervalsAdjacencyDetector: IntervalsAdjacencyDetector

    @Before
    fun setUp() {
        intervalsAdjacencyDetector = IntervalsAdjacencyDetector()
    }

    //interval1 is before interval2
    @Test
    fun intervalAdjacency_interval1BeforeInterval2_falseReturned() {
        val interval1 = Interval(0,2)
        val interval2 = Interval(3,5)
        val returned = intervalsAdjacencyDetector.isAdjacent(interval1, interval2)
        MatcherAssert.assertThat(returned, CoreMatchers.equalTo(false))
    }

    //interval1 adjacent interval2 start
    @Test
    fun intervalAdjacency_interval1AdjacentInterval2Start_trueReturned() {
        val interval1 = Interval(0,2)
        val interval2 = Interval(2,4)
        val returned = intervalsAdjacencyDetector.isAdjacent(interval1, interval2)
        MatcherAssert.assertThat(returned, CoreMatchers.equalTo(true))
    }

    //interval1 overlaps interval2 start
    @Test
    fun intervalAdjacency_interval1OverlapsInterval2Start_falseReturned() {
        val interval1 = Interval(0,2)
        val interval2 = Interval(1,3)
        val returned = intervalsAdjacencyDetector.isAdjacent(interval1, interval2)
        MatcherAssert.assertThat(returned, CoreMatchers.equalTo(false))
    }

    //interval1 overlaps internal2 end
    @Test
    fun intervalAdjacency_interval1OverlapsInterval2End_falseReturned() {
        val interval1 = Interval(2,4)
        val interval2 = Interval(1,3)
        val returned = intervalsAdjacencyDetector.isAdjacent(interval1, interval2)
        MatcherAssert.assertThat(returned, CoreMatchers.equalTo(false))
    }

    //interval1 adjacent interval 2 end
    @Test
    fun intervalAdjacency_interval1AdjacentInterval2End_trueReturned() {
        val interval1 = Interval(4,8)
        val interval2 = Interval(2,4)
        val returned = intervalsAdjacencyDetector.isAdjacent(interval1, interval2)
        MatcherAssert.assertThat(returned, CoreMatchers.equalTo(true))
    }

    //interval2 is after interval2
    @Test
    fun intervalAdjacency_interval1AfterInterval2_falseReturned() {
        val interval1 = Interval(0,2)
        val interval2 = Interval(-4,-2)
        val returned = intervalsAdjacencyDetector.isAdjacent(interval1, interval2)
        MatcherAssert.assertThat(returned, CoreMatchers.equalTo(false))
    }

    //interval2 is equal to interval2
    @Test
    fun intervalAdjacency_interval1isEqualToInterval2_falseReturned() {
        val interval1 = Interval(0,2)
        val interval2 = Interval(0,2)
        val returned = intervalsAdjacencyDetector.isAdjacent(interval1, interval2)
        MatcherAssert.assertThat(returned, CoreMatchers.equalTo(false))
    }
}