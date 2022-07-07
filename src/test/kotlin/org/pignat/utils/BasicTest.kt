package org.pignat.photobot

import org.junit.jupiter.api.Test
import org.pignat.utils.VersionKt
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class BasicTest {
    @Test
    fun testVersion() {
        val v = VersionKt();
        assertNotEquals(v.version(), "");
    }

    @Test
    fun testResources() {
        val f = this::class.java.classLoader.getResource("res/test.txt").readText(Charsets.UTF_8).trim()
        assertEquals(f, "hello world")
    }
}