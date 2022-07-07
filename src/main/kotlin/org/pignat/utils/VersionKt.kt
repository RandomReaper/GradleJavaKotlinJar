package org.pignat.utils

/**
 * A class for testing the java -> kotlin interoperability.
 */
class VersionKt {
    fun version(): String {
        return Version.string()
    }
}