fun main() {
    println(
        "moveAllZero:${
            moveAllZeroToTheEnd(
                arrayOf(
                    1,
                    3,
                    5,
                    0,
                    3,
                    0,
                    2,
                    0,
                    1
                )
            ).contentToString()
        }"
    )
    println("moveAllZero:${moveAllZeroToTheEnd(arrayOf(1, 0, 0, 0, 0, 0)).contentToString()}")
    println("moveAllZero:${moveAllZeroToTheEnd(arrayOf(0, 0, 0, 0, 0, 1)).contentToString()}")
    
}


fun moveAllZeroToTheEnd(array: Array<Int>): Array<Int> {
    var lastZeroItemIndex = 0
    var temp = 0
    for (i in array.indices) {
        if (array[i] != 0) {
            temp = array[i]
            array[i] = array[lastZeroItemIndex]
            array[lastZeroItemIndex] = temp
            lastZeroItemIndex++
        }
    }
    return array
}
