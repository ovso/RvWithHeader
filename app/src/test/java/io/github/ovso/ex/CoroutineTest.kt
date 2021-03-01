package io.github.ovso.ex

import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class CoroutineTest {
    @Test
    fun coroutineTest() {
        runBlocking {
            (1..5).asFlow().collectIndexed { index, value ->
                println("index: $index, value: $value")
            }
        }
    }
}