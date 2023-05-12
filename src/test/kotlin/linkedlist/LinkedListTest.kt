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
        for (i in 1..3) {
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

    @Test
    fun iterateLinkedList() {
        val list = LinkedListApp<Int>()
        list.push(3).push(2).push(1)
        println(list)
        for (item in list){
            println("Double: ${item * 2}")
        }
    }

    @Test
    fun removingElements() {
        val list: MutableCollection<Int> = LinkedListApp()
        list.add(3)
        list.add(2)
        list.add(1)
        println(list)

        list.remove(1)
        println(list)
    }

    @Test
    fun removeAllElements() {
        val list: MutableCollection<Int> = LinkedListApp()
        list.add(3)
        list.add(2)
        list.add(1)
        list.add(4)
        list.add(5)
        println(list)

        list.removeAll(listOf(3,2,1))
        println(list)
    }

    @Test
    fun retainingElements() {
        val list: MutableCollection<Int> = LinkedListApp()
        list.add(3)
        list.add(2)
        list.add(1)
        list.add(4)
        list.add(5)
        println(list)

        list.retainAll(listOf(3,2,1))
        println(list)
    }

    @Test
    fun printReverseLinkedList() {
        val list = LinkedListApp<Int>()
        list.add(3)
        list.add(2)
        list.add(1)
        list.add(4)
        list.add(5)

        println(list.toString())
        list.printInReverse()
    }

    @Test
    fun getMiddleLinkedList() {
        val list = LinkedListApp<Int>()
        list.add(3)
        list.add(2)
        list.add(1)
        list.add(4)
        list.add(5)

        assertEquals(list.getMiddle()?.value, 1 )
    }

    @Test
    fun reversedLinkedList() {
        val list = LinkedListApp<Int>()
        list.add(3)
        list.add(2)
        list.add(1)
        list.add(4)
        list.add(5)

        println("Original: $list")
        println("Reversed: ${list.reversed()}")
    }

    @Test
    fun mergeLinkedList() {
        val list = LinkedListApp<Int>()
        list.add(1)
        list.add(2)
        list.add(3)
        list.add(4)
        list.add(5)

        val otherList = LinkedListApp<Int>()
        otherList.add(-1)
        otherList.add(0)
        otherList.add(2)
        otherList.add(2)
        otherList.add(7)

        println("List: $list")
        println("Other List: $otherList")

        val mergeList = list.mergeSorted(otherList)
        println("Merge List: $mergeList")
    }
}