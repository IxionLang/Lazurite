package com.kingmang.lazurite.runner

import com.kingmang.lazurite.utils.Handler.run
import com.kingmang.lazurite.utils.Handler.testRun

object TestRunner {
    @JvmStatic
    fun main(args: Array<String>) {
        testRun("test/test.lzr", 5, false)
    }
}

