package palindrome

class PalindromeApp {

    fun check(value: String): Boolean {
        val word = value.uppercase().filterNot { it.isWhitespace() }
        val length = word.length
        var result = false
        for (i in 0 until length) {
            if (word[i] == word[(length - i) - 1]) {
                result = true
            }else {
                return false
            }
        }
        return result
    }
}