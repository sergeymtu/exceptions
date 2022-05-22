package ru.netology


class WallService {
    private var posts: Array<Post> = emptyArray<Post>()
    private var comments = emptyArray<Comment>()


    fun add(post: Post): Post {
        for (i in posts) {
            if (i.id == post.id) return i
        }
        posts += post
        return posts.last()
    }


    fun update(post: Post): Boolean {

        for ((index, p) in posts.withIndex()) {
            if (post.id == posts[index].id) {
                val newPost = p.copy(id = post.id, ownerId = p.ownerId, date = p.date, text = post.text)
                posts[index] = newPost
                return true
            }
        }
        return false
    }

    fun createComment(comment: Comment) {
        for (post in posts){
            if (post.id == comment.postId) {
                comments += comment
                return
            }
        }

        throw PostNotFoundException("Post Not Found")
    }

    fun showComment(number:Int = 0): Comment{
        return comments[number]
    }

    fun printPosts() {
        for (post in posts) {
            println(" " + post.id + " - " + post.text)
            for (att in post.attachments) {
                var d = att.type
                //when(d){


                if (att.type == "Video") {
                    att as AttachmentVideo
                    println("Вложение: " + att.type + " - " + att.video)

                } else if (att.type == "Audio") {
                    att as AttachmentAudio
                    println("Вложение: " + att.type + " - " + att.audio)

                } else if (att.type == "Docs") {
                    att as AttachmentDocs
                    println("Вложение: " + att.type + " - " + att.docs)

                } else if (att.type == "Photo") {
                    att as AttachmentPhoto
                    println("Вложение: " + att.type + " - " + att.photo)

                }


            }
        }

    }


}