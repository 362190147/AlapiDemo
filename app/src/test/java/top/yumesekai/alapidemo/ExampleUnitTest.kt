package top.yumesekai.alapidemo

import kotlinx.coroutines.runBlocking
import org.junit.Test

import org.junit.Assert.*
import top.yumesekai.alapi.AlApi

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun dogTest(){
        runBlocking {
            var  data=AlApi.instance.api.getDogDiary("MXIusDFLSd7F4evvlTTY")
            print(data.toString())
             data=AlApi.instance.api.getDogDiary("MXIusDFLSd7F4evvlTTY")
            print(data.toString())
        }
    }
}