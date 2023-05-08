package linkedlist

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LinkedListTest {
    @Test
    fun createNode() {
        val node1 = Node(1)
        val node2 = Node(2)
        val node3 = Node(3)

        node1.next = node2
        node2.next = node3

        assertEquals(node1.toString(), "1 -> 2 -> 3")
    }

    @Test
    fun pushLinkedList() {
        val list = LinkedListApp<Int>()
        list.push(3).push(2).push(1)
        assertEquals(list.toString(), "1 -> 2 -> 3")
    }

    @Test
    fun appendLinkedList() {
        val list = LinkedListApp<Int>()
        list.append(1)
        list.append(2)
        list.append(3)
        assertEquals(list.toString(), "1 -> 2 -> 3")
    }

    @Test
    fun insertLinkedList() {
        val list = LinkedListApp<Int>()
        list.push(3).push(2).push(1)
        assertEquals(list.toString(), "1 -> 2 -> 3", message = "Before inserting")

        var middleNode = list.nodeAt(1)!!
        for (i in 1..3){
            middleNode = list.insert(-1 * i, middleNode)
        }
        assertEquals(list.toString(), "1 -> 2 -> -1 -> -2 -> -3 -> 3")
    }

    @Test
    fun popLinkedList() {
        val list = LinkedListApp<Int>()
        list.push(3).push(2).push(1)
        assertEquals(list.toString(), "1 -> 2 -> 3", message = "Before popping list")
        val poppedValue = list.pop()
        assertEquals(list.toString(), "2 -> 3", message = "after popping list")
        assertEquals(poppedValue.toString(), "1")
    }

    @Test
    fun removeLastLinkedList() {
        val list = LinkedListApp<Int>()
        list.push(3).push(2).push(1)
        assertEquals(list.toString(), "1 -> 2 -> 3", message = "Before removeLast list")
        val removeLastValue = list.removeLast()
        assertEquals(list.toString(), "1 -> 2", message = "After removeLast list")
        println(list.toString())

        assertEquals(removeLastValue.toString(), "3")
    }

    @Test
    fun removeAfterLinkedList() {
        val list = LinkedListApp<Int>()
        list.push(3).push(2).push(1)
        assertEquals(list.toString(), "1 -> 2 -> 3", message = "Before removeAfter list")
        val node = list.nodeAt(0)!!
        val removeAfterValue = list.removeAfter(node)
        assertEquals(list.toString(), "1 -> 3", message = "After removeAfter list")
        assertEquals(removeAfterValue.toString(), "2")
    }
}