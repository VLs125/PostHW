package org.netology_exceptions

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
}
