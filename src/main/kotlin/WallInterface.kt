package org.netology_exceptions


interface WallInterface {
    fun add(post: Post): Post
    fun update(post: Post): Boolean
    fun createComment(postId: Int, comment: org.netology_exceptions.Comment ): org.netology_exceptions.Comment
}