package com.example.dspractice

fun main(){
    println("max water trapped for [3, 2, 1,0, 5] is ${getMaximumQuantityOfWaterTrapped(arrayOf(3, 2, 1,0, 5))}")
    println("max water trapped for [5,0,1,2,6,1] is ${getMaximumQuantityOfWaterTrapped(arrayOf(5,0,1,2,6,1))}")
    println("max water trapped for [1,2,3,4,5] is ${getMaximumQuantityOfWaterTrapped(arrayOf(1,2,3,4,5))}")
    println("max water trapped for [5,4,3,2,1] is ${getMaximumQuantityOfWaterTrapped(arrayOf(5,4,3,2,1))}")
}


fun getMaximumQuantityOfWaterTrapped(array: Array<Int>):Int{
    var maxWater =0
    var tempCalculatedValue = 0
    var leftBoundry =array[0]
    for (i in  1 until array.size){
        if(array[i]<=leftBoundry){
            tempCalculatedValue += (leftBoundry - array[i])
        }else{
            maxWater +=  tempCalculatedValue
            tempCalculatedValue =0
            leftBoundry =array[i]
        }
    }
    return maxWater
}
