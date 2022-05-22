package ru.netology

data class AttachmentPhoto(var pht: Photo):Attachment {
    override val type: String = "Photo"
    //override val value: Photo = photo
    val photo: Photo = pht
}