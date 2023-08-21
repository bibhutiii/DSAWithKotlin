fun main() {
    println(
        "reverseAnArray of [1, 3, 5, 6, 7, 9]:${
            reverseAnArray(arrayOf(1, 3, 5, 6, 7, 9)).contentToString()
        }"
    )

    println(
        "reverseAnArray of [1, 3, 5, 6, 0, 10, 9]:${
            reverseAnArray(
                arrayOf(
                    1,
                    3,
                    5,
                    6,
                    0,
                    10,
                    9
                )
            ).contentToString()
        }"
    )
}


fun reverseAnArray(array: Array<Int>): Array<Int> {
    var startPointer = 0
    var endPointer = array.size - 1
    while (startPointer < endPointer) {
        array[startPointer] = array[startPointer] + array[endPointer]
        array[endPointer] = array[startPointer] - array[endPointer]
        array[startPointer] = array[startPointer] - array[endPointer]
        startPointer++
        endPointer--
    }
    return array
}
