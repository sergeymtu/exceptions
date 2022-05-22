package ru.netology

data class AttachmentDocs(var dcs: Docs):Attachment {
    override val type: String = "Docs"
    //override val value: Docs = docs
    val docs: Docs = dcs
}