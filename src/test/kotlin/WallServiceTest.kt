package ru.netology

import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun addIdNotNull() {
        val post1 = Post(id = 1, text = "Первый пост")
        val wall = WallService()
        val testPost = wall.add(post1)

        assertEquals(true, testPost.id !== 0)
    }

    @Test
    fun updateIdExist() {
        val post1 = Post(id = 1, text = "Первый пост")
        val post2 = Post(id = 2, text = "Второй пост")
        val post3 = Post(id = 1, text = "Третий пост") //id совпадает
        val post4 = Post(id = 3, text = "Четвертый пост")

        val wall = WallService()
        wall.add(post1)
        val result = wall.update(post3)

        assertEquals(true, result)
    }

    @Test
    fun updateIdNotExist() {
        val post1 = Post(id = 1, text = "Первый пост")
        val post2 = Post(id = 2, text = "Второй пост")
        val post3 = Post(id = 1, text = "Третий пост") //id совпадает
        val post4 = Post(id = 3, text = "Четвертый пост")

        val wall = WallService()
        wall.add(post1)
        val result = wall.update(post3)

        assertEquals(true, result)
    }


    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        val service = WallService()
        service.createComment(Comment(1, 5, "Test"))
    }


    @Test
    fun commentAdded() {

            val service = WallService()
            val createPost = Post(1 ,ownerId = 100, date = 20, text = "Добавляем пост")
            val createComment = Comment(1, 1, "Test")

            service.add(createPost)
            service.createComment(createComment)

            val resultComment = service.showComment()
            assertEquals(createComment.postId, resultComment.postId)


    }


}
