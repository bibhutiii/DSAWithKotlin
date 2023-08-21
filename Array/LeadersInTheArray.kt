fun main() {
    printTheLeadersInArray(arrayOf(3,4,6,8,10,3,4))
    printTheLeadersInArray(arrayOf(1,2,3,4,5,6,7,8))
    printTheLeadersInArray(arrayOf(8,7,6,5,4,3,2,1))
}


fun printTheLeadersInArray(array: Array<Int>){
    var currentLeader = array[array.size-1]
    print("$currentLeader\t")
    for (i in array.size-2 downTo 1){
        if(array[i]>currentLeader){
            currentLeader=array[i]
            print("$currentLeader\t")
        }
    }
    println("")
}
