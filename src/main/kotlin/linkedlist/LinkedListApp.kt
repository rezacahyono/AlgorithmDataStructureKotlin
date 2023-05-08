package linkedlist

import java.util.LinkedList

class LinkedListApp<T> {
    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    var size = 0

    fun isEmpty(): Boolean {
        return size == 0
    }

    override fun toString(): String {
        return if (isEmpty()) {
            "Empty List"
        } else {
            head.toString()
        }
    }

    /**
     * Push *Adds a value at front of the list
     */
    fun push(value: T): LinkedListApp<T> {
        head = Node(value = value, next = head)
        if (tail == null) {
            tail = head
        }
        size++
        return this
    }

    /**
     * Append *Adds a value at the end of the list
     */
    fun append(value: T): LinkedListApp<T> {
        if (isEmpty()) {
            push(value)
            return this
        }
        tail?.next = Node(value = value)
        tail = tail?.next
        size++
        return this
    }

    fun nodeAt(index: Int): Node<T>? {
        var currentNode = head
        var currentIndex = 0

        while (currentNode != null && currentIndex < index) {
            currentNode = currentNode.next
            currentIndex++
        }
        return currentNode
    }

    /**
     * Insert *Adds a value after a particular node of the list
     */
    fun insert(value: T, afterNode: Node<T>): Node<T> {
        if (tail == afterNode) {
            append(value)
            return tail!!
        }
        val newNode = Node(value = value, next = afterNode.next)
        afterNode.next = newNode
        size++
        return newNode
    }

    /**
     * Pop *Removes the value at the front of the list
     */
    fun pop(): T? {
        if (!isEmpty()) size--
        val result = head?.value
        head = head?.next
        if (isEmpty()) {
            tail = null
        }
        return result
    }

    /**
     * removeLast *Removes the value at the end of the list
     */
    fun removeLast(): T? {
        val head = head ?: return null
        if (head.next == null) return pop()
        size--
        var prev = head
        var current = head

        var next = current.next
        while (next!=null){
            prev = current
            current = next
            next = current.next
        }

        prev.next = null
        tail = prev
        return current.value
    }

    /**
     * removeAfter *Removes a value anywhere in the list
     */
    fun removeAfter(node: Node<T>): T? {
        val result = node.next?.value

        if (node.next == tail){
            tail = node
        }
        if (node.next != null){
            size--
        }
        node.next = node.next?.next
        return result
    }
}