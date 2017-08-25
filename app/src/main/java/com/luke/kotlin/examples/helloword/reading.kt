package com.luke.kotlin.examples.helloword

import java.util.*

/**
 * Created by luke on 2017/8/25.
 */
class reading{
    fun main(args: Array<String>){
        if(args.size == 0){
            print("args is null")
            return
        }
        println("Hello,${args[0]}")
    }
}