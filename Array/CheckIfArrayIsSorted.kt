fun main() {
    println("isArraySorted:${isArraySorted(arrayOf(1, 3, 5, 6, 7, 9))}")

    println("isArraySorted:${isArraySorted(arrayOf(1, 3, 5, 6, 10, 9))}")

    println("isArraySorted:${isArraySorted(arrayOf(10, 10))}")

    println("isArraySorted:${isArraySorted(arrayOf(100))}")
}

fun isArraySorted(array: Array<Int>): Boolean {
    var isArraySorted = true
    for (i in 0 until array.size - 1) {
        if (array[i] > array[i + 1]) {
            isArraySorted = false
            break
        }
    }
    return isArraySorted
}
