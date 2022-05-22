package ru.netology


fun main() {

    val post1 = Post(id = 1, text = "Первый пост")
    val post2 = Post(id = 2, text = "Второй пост")
    val post3 = Post(id = 1, text = "Третий пост") //id совпадает
    val post4 = Post(id = 3, text = "Четвертый пост")

    val wall = WallService()

    wall.add(post1)
    wall.add(post2)
    wall.add(post3)
    wall.add(post4)
//    wall.update(post3)


    var attachment:Attachment = AttachmentAudio(Audio(id=1, groupName="Металика", albumName="Черный Альбом"))
    post1.addAttachment(attachment)
    post1.addAttachment(AttachmentVideo(Video(id=1, name = "Один дома")))
    post1.addAttachment(AttachmentVideo(Video(2,"Терминатор")))
    post1.addAttachment(AttachmentDocs(Docs(1,"Новый","Властелин колец")))

    post2.addAttachment(AttachmentVideo(Video(3, "Матрица")))
    post2.addAttachment(AttachmentPhoto(Photo(1, name = "Фотография Кремля")))
    post2.addAttachment(AttachmentDocs(Docs(1,"Перевод текста", "Тут мы перевели текст")))
    post2.addAttachment(AttachmentDocs(Docs(2,"Новый документ", "текст документа здесь")))

    post3.addAttachment(AttachmentVideo(Video(1, "Король лев")))
    post3.addAttachment(AttachmentPhoto(Photo(1, "Фотография Санкт-Петербурга")))
    post3.addAttachment(AttachmentDocs(Docs(1,"Расписание", "Текст расписания")))
    post3.addAttachment(AttachmentDocs(Docs(2,"Документ", "текст документы здесь")))

    post4.addAttachment(AttachmentVideo(Video(2, "Один дома 2")))
    post4.addAttachment(AttachmentPhoto(Photo(2, "Фотография Кремля")))
    post4.addAttachment(AttachmentDocs(Docs(1,"Перевод текста",  "Тут мы перевели текст")))
    post4.addAttachment(AttachmentDocs(Docs(2,"Новый документ", "текст документы здесь")))

    wall.printPosts()

}

