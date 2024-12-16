package org.netology_exceptions

class WallService : WallInterface {
    private var postArray: Array<Post> = emptyArray()
    private var indexes = 1
    override fun add(post: Post): Post {
        val addedPostIndex = indexes
        post.id = addedPostIndex
        postArray += post
        indexes++
        return postArray[addedPostIndex - 1]

    }

    override fun update(post: Post): Boolean {
        try {
            postArray[post.id - 1] = post
            return true
        } catch (ex: IndexOutOfBoundsException) {
            return false
        }
    }
}