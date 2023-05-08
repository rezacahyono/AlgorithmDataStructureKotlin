package fizzbuzz

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FizzBuzzTest {

    @Test
    fun fizzBuzzNormalNumberAlone() {
        val fizzBuzzApp = FizzBuzzApp()
        assertEquals(fizzBuzzApp.convert(1), "1")
        assertEquals(fizzBuzzApp.convert(2), "2")
    }

    @Test
    fun fizzBuzzMultipleOfThree() {
        val fizzBuzzApp = FizzBuzzApp()
        assertEquals(fizzBuzzApp.convert(3), "fizz")
    }

    @Test
    fun fizzBuzzMultipleOfFive() {
        val fizzBuzzApp = FizzBuzzApp()
        assertEquals(fizzBuzzApp.convert(5), "buzz")
    }

    @Test
    fun fizzBuzzMultipleOfThreeAndFive() {
        val fizzBuzzApp = FizzBuzzApp()
        assertEquals(fizzBuzzApp.convert(15), "fizzbuzz")
    }

    @Test
    fun fizzBuzzApp() {
        val fizzBuzzApp = FizzBuzzApp()
        for (i in 1..100){
            println(fizzBuzzApp.convert(i))
        }
    }
}