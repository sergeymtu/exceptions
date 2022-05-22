package ru.netology

class Audio (
    val id:Int,
    val groupName:String = "",
    val groupId:Int = 0,
    val albumName:String
)
{
    override fun toString():String{
        return "(id $id, Группа: $groupName Альбом: $albumName)"
    }
}