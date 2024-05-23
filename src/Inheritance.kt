package net.lwqzx.interiance
open class Animal(val age: Int) {
    open val name = "动物"
    open fun sound() {
        println("动物的声音$age")
    }
}

class Dog : Animal(5) {
    override val name = "dog"

    override fun sound() {
        super.sound()
        println("汪汪汪。。")
    }
}

fun main() {
    val dog = Dog()
    println(dog.age)
    println(dog.name)
    dog.sound()
}