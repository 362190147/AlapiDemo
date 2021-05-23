package top.yumesekai.alapidemo

import kotlinx.coroutines.runBlocking
import org.junit.Test

import org.junit.Assert.*
import top.yumesekai.alapi.AlapiManager

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
    fun apiTest(){
        runBlocking {
            AlapiManager.init("MXIusDFLSd7F4evvlTTY")
            AlapiManager.instance.api.apply {

                var  data = getDogDiary()
                assertEquals(200, data.code)
                data.data?.let { println(it.content)}

                var hitokoto = getHitokoto()
                assertEquals(200, hitokoto.code)
                println(hitokoto.toString())
                hitokoto.data?.let { println(it) }

                data = getQinghua()
                assertEquals(200, data.code)
                data.data?.let { println(it.content) }

                getSoul().let {
                    assertEquals(200, it.code)
                    println(it)
                }
            }



        }
    }
}