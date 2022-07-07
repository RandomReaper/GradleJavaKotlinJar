package org.pignat.utils

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class BasicTest {
    @Test
    fun testVersion() {
        Version.isRelease()
        assertNotEquals(VersionKt().version(), "")
    }

    @Test
    fun testResources() {
        val f = this::class.java.classLoader.getResource("res/test.txt")?.readText(Charsets.UTF_8)?.trim()
        val x = this::class.java.classLoader.getResource("res/that_file_should_not_exist.txt")?.readText(Charsets.UTF_8)?.trim()
        assertEquals(f, "hello world")
        assertEquals(x, null)
    }
}