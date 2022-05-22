package ru.netology

data class AttachmentVideo(var vd: Video):Attachment {
    override val type: String = "Video"
    //override val value: Video = video
    val video: Video = vd
}