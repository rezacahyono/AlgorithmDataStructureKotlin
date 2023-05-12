package stack

import org.junit.jupiter.api.Test

class StackTest {

    @Test
    fun pushToStack() {
        val stack = StackImpl<Int>()
        stack.push(1)
        stack.push(2)
        stack.push(3)
        stack.push(4)

        println(stack)
    }

    @Test
    fun popInStack() {
        val stack = StackImpl<Int>()
        stack.push(1)
        stack.push(2)
        stack.push(3)
        stack.push(4)

        println("Before pop: \n$stack")

        stack.pop()

        println("After pop: \n$stack")
    }

    @Test
    fun peekInStack() {
        val list = listOf('A', 'B', 'C', 'D', 'E')
        val stack = StackImpl.create(list)

        print(stack)
        println("Peeking: ${stack.peek()}")
    }

    @Test
    fun createIteratorStack() {
        val list = listOf('A', 'B', 'C', 'D', 'E')
        val stack = StackImpl.create(list)

        print(stack)

        println("Popping: ${stack.pop()}")
    }

    @Test
    fun createArrayLiteralStack() {
        val stack = stackOf(1.2,3.2,5.4,2.4,1.2)
        print(stack)
    }


}