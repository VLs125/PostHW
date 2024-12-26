package org.netology_exceptions

import org.netology_exceptions.exceptions.PostNotFoundException
import javax.xml.stream.events.Comment

class WallService : WallInterface {
    private var postArray: Array<Post> = emptyArray()
    private var uniqueId = 1

    override fun add(post: Post): Post {
        val addedPostId = uniqueId
        val postCopy = post.copy()
        postCopy.id = addedPostId
        postArray += postCopy
        uniqueId++
        return postCopy

    }

    override fun update(post: Post): Boolean {
        var isUpdated = false
        postArray.forEachIndexed { i, el ->
            if (el.id == post.id) {
                postArray[i] = post
                isUpdated = true
            }
        }
        return isUpdated
    }

    override fun createComment(postId: Int, comment: org.netology_exceptions.Comment): org.netology_exceptions.Comment {
        var findedPostIndex = postArray.indexOfFirst { it.id == postId }
        if (findedPostIndex == -1) {
            throw PostNotFoundException("Пост с id ${postId} не найден")
        } else {
            var post = postArray[findedPostIndex]
            post.comments.add(comment)
            return post.comments.last()
        }
    }
}
