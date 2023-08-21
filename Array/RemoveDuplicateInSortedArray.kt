fun main() {
    val arrayOfDuplicate = arrayOf(2, 3, 3, 5, 5, 8, 9)

    print("Remove duplicate in [2, 3, 3, 5, 5, 8, 9]-> [")
    for (i in 0..removeDuplicatesInSorted(arrayOfDuplicate)) {
        print("${arrayOfDuplicate[i]} ")
    }
    println("]")
    val arrayOfDuplicate1 = arrayOf(2, 3, 3, 5, 5, 8, 9, 10, 10, 11)
    print("Remove duplicate in [2, 3, 3, 5, 5, 8, 9, 10, 10, 11]-> [")
    for (i in 0..removeDuplicatesInSorted(arrayOfDuplicate1)) {
        print("${arrayOfDuplicate1[i]} ")
    }
    println("]")
}


fun removeDuplicatesInSorted(array: Array<Int>): Int {
    var lastDistinctElementIndex = 1
    for (i in 1 until array.size) {
        if (array[i] != array[lastDistinctElementIndex - 1]) {
            array[lastDistinctElementIndex] = array[i]
            lastDistinctElementIndex++
        }
    }
    return lastDistinctElementIndex - 1
}
