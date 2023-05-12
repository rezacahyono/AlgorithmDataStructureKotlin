package palindrome

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class PalindromeTest {

    @Test
    fun wordIsPalindromeReturnTrue() {
        val palindrome = Palindrome()
        val word = "Madam in Eden Im Adam"
        assertTrue(palindrome.check(word))
    }

    @Test
    fun wordIsNotPalindromeReturnFalse() {
        val palindrome = Palindrome()
        val word = "Aot"
        assertFalse(palindrome.check(word))
    }


}