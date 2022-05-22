package ru.netology

class Photo (
    val id:Int,
    val name:String
){
    override fun toString():String{
        return "(id $id, $name)"
    }
}