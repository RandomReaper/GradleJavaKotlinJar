package org.pignat.demo

import org.pignat.utils.VersionKt

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Hello, World! " + VersionKt().version())
        }
    }
}