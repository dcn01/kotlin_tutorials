/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.easy.kotlin.chapter

abstract class Shape {
    abstract var width: Double
    abstract var heigth: Double
    abstract var radius: Double
    abstract fun area(): Double

    open fun onClick() {
        println("I am Clicked!")
    }
}

class Rectangle(override var width: Double, override var heigth: Double, override var radius: Double) : Shape() {
    override fun area(): Double {
        return heigth * width
    }

    override fun onClick() {
        println("${this::class.simpleName} is Clicked!")
    }
}

class Circle(override var width: Double, override var heigth: Double, override var radius: Double) : Shape() {
    override fun area(): Double {
        return 3.14 * radius * radius
    }
}

class Triangle(override var width: Double, override var heigth: Double, override var radius: Double) : Shape() {
    override fun area(): Double {
        return width * heigth / 2
    }
}


fun main(args: Array<String>) {
    //val s = Shape() // 编译不通过！不能实例化抽象类
    val r = Rectangle(3.0, 4.0, 0.0)
    println(r.area())
    r.onClick()

    // println(r is Shape)

    val c = Circle(0.0, 0.0, 4.0)
    println(c.area())
    c.onClick()
}
