package org.netology_exceptions

interface WallInterface {
    fun add(post: Post): Post
    fun update(post: Post): Boolean
}