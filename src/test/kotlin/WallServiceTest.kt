import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

import org.netology_exceptions.*

class WallServiceTest {

    @Test
    fun add() {
        val post = Post(
            ownerId = 1,
            fromId = 1,
            createdBy = 2,
            text = "тестовый пост",
            likes = Likes(),
            geo = Geo(),
            reposts = Reposts(),
            vies = Vies()
        )
        val wall = WallService()

        val addedPost = wall.add(post)
        assert(addedPost.id == 1)
        assert(addedPost.ownerId == 1)
        assert(addedPost.text == "тестовый пост")
    }

    @Test
    fun positiveUpdateTest() {
        val wall = WallService()
        val post1 = Post(
            ownerId = 1,
            fromId = 1,
            createdBy = 2,
            text = "тестовый пост1",
            likes = null,
            geo = Geo(),
            reposts = null,
            vies = Vies()
        )
        val post2 = Post(
            ownerId = 2,
            fromId = 2,
            createdBy = 3,
            text = "тестовый пост2",
            likes = Likes(),
            geo = Geo(),
            reposts = Reposts(),
            vies = Vies()
        )
        val post3 = Post(
            ownerId = 3,
            fromId = 3,
            createdBy = 4,
            text = "тестовый пост3",
            likes = Likes(),
            geo = Geo(),
            reposts = Reposts(),
            vies = Vies()
        )
        val postUpdate = Post(
            id = 1,
            ownerId = 6,
            fromId = 6,
            createdBy = 7,
            text = "НОВЫЙ ТЕКСТ",
            likes = Likes(),
            geo = Geo(),
            reposts = Reposts(),
            vies = Vies()
        )

        wall.add(post1)
        wall.add(post2)
        wall.add(post3)
        assertTrue(wall.update(postUpdate))

    }
    @Test
    fun negativeUpdateTest() {
        val wall = WallService()
        val post2 = Post(
            ownerId = 2,
            fromId = 2,
            createdBy = 3,
            text = "тестовый пост2",
            likes = Likes(),
            geo = Geo(),
            reposts = Reposts(),
            vies = Vies()
        )
        val post3 = Post(
            ownerId = 3,
            fromId = 3,
            createdBy = 4,
            text = "тестовый пост3",
            likes = Likes(),
            geo = Geo(),
            reposts = Reposts(),
            vies = Vies()
        )
        val postUpdate = Post(
            id = 6,
            ownerId = 6,
            fromId = 6,
            createdBy = 7,
            text = "НОВЫЙ ТЕКСТ",
            likes = Likes(),
            geo = Geo(),
            reposts = Reposts(),
            vies = Vies()
        )

        wall.add(post2)
        wall.add(post3)
        assertFalse(wall.update(postUpdate))

    }
}