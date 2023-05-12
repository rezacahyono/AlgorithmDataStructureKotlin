package stack

interface Stack<Element> {
    val count: Int
        get
    val isEmpty: Boolean
        get() = count == 0

    fun push(element: Element)
    fun pop(): Element?
    fun peek(): Element?
}

class StackImpl<T : Any>() : Stack<T> {
    private val storage = arrayListOf<T>()

    override val count:Int
        get()= storage.size


    override fun toString() = buildString {
        appendLine("----top----")
        storage.asReversed().forEach {
            appendLine("$it")
        }
        appendLine("-----------")
    }

    override fun push(element: T) {
        storage.add(element)
    }

    override fun pop(): T? {
        if (isEmpty) {
            return null
        }
        return storage.removeAt(count - 1)
    }

    override fun peek(): T? {
        return storage.lastOrNull()
    }

    companion object {
        fun <Element: Any> create(items: Iterable<Element>): Stack<Element>{
            val stack = StackImpl<Element>()
            for (item in items){
                stack.push(item)
            }
            return stack
        }

    }

}

fun <Element: Any> stackOf(vararg elements: Element): Stack<Element>{
    return StackImpl.create(elements.asList())
}
