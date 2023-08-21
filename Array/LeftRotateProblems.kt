fun main() {
    println(
        "leftRotateArrayByOne:${
            leftRotateArrayByOne(
                arrayOf(
                    1,
                    2,
                    3,
                    4,
                    5,
                    6,
                    7,
                    8
                )
            ).contentToString()
        }"
    )

    println(
        "leftRotateArrayByOne:${
            leftRotateArrayByOne(
                arrayOf(
                    1,
                    0,
                    3,
                    4,
                    5,
                    6,
                    7,
                    0
                )
            ).contentToString()
        }"
    )

    println(
        "leftRotateArrayByGivenPosition:${
            leftRotateArrayByGivenPosition(
                arrayOf(1, 2, 3, 4, 5, 6, 7, 8),
                2
            ).contentToString()
        }"
    )

    println(
        "leftRotateArrayByGivenPosition:${
            leftRotateArrayByGivenPosition(
                arrayOf(1, 0, 3, 4, 5, 6, 7, 0),
                7
            ).contentToString()
        }"
    )
}




fun leftRotateArrayByOne(arrays: Array<Int>): Array<Int> {
    val firstNumber = arrays[0]
    for (i in 0 until arrays.size - 1) {
        arrays[i] = arrays[i + 1]
    }
    arrays[arrays.size - 1] = firstNumber
    return arrays
}


fun leftRotateArrayByGivenPosition(arrays: Array<Int>, position: Int): Array<Int> {
    reverseAnArray(arrays, 0, position - 1)
    reverseAnArray(arrays, position, arrays.size - 1)
    reverseAnArray(arrays, 0, arrays.size - 1)
    return arrays
}


fun reverseAnArray(array: Array<Int>, startPointer: Int, endPointer: Int): Array<Int> {
    var startPointer = startPointer
    var endPointer = endPointer
    while (startPointer < endPointer) {
        array[startPointer] = array[startPointer] + array[endPointer]
        array[endPointer] = array[startPointer] - array[endPointer]
        array[startPointer] = array[startPointer] - array[endPointer]
        startPointer++
        endPointer--
    }
    return array
}
