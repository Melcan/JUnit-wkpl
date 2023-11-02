package com.example.junit

import org.junit.Test
import kotlin.test.assertEquals

class wkplTest {
    @Test
    fun test() {
        val Wkpl = wkpl()
        val result = Wkpl.add(5, 5)
        assertEquals(10, result, "Hasilnya 10")
    }
}