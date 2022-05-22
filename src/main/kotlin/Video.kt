package ru.netology

class Video (
    val id:Int,
    val name:String
){
    override fun toString():String{
        return "(id $id, $name)"
    }
}