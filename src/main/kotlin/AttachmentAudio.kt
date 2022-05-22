package ru.netology

data class AttachmentAudio(var aud: Audio):Attachment {
    override val type: String = "Audio"
    //override val value: Audio = audio
    val audio: Audio = aud
}