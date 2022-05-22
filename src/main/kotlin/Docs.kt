package ru.netology

class Docs (
    val id:Int,
    val docName:String,
    val docText:String
){
    override fun toString():String{
        return "(Name: $docName, Text: $docText)"
    }
}