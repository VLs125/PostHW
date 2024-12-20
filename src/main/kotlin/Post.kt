package org.netology_exceptions

data class Post(
    var id: Int = 0,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Long = System.currentTimeMillis(),
    var text: String,
    var replyOwnerId: Int = 0,
    var replyPostId: Int = 0,
    var friendsOnly: Boolean = false,
    var comments: ArrayList<Comments> = arrayListOf(),
    var copyright: String = "without copyrights",
    var likes: Likes?,
    var reposts: Reposts?,
    var vies: Vies,
    var postType: PostType = PostType.post,
    var attachments: Array<Byte>?,
    val geo: Geo,
    val signerId: Int = 0,
    var copyHistory: Array<Post> = emptyArray(),
    var canPin: Boolean = true,
    var canDelete: Boolean = true,
    var canEdit: Boolean = true,
    var isPinned: Boolean = false,
    var markedAsAds: Boolean = false,
    var isFavorite: Boolean = false,
    val postPonnedId: Int = 0


) {
    var modifyComments
        set(value) {
            comments.addAll(value)
        }
        get() = comments

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Post

        if (id != other.id) return false
        if (ownerId != other.ownerId) return false
        if (fromId != other.fromId) return false
        if (createdBy != other.createdBy) return false
        if (date != other.date) return false
        if (text != other.text) return false
        if (replyOwnerId != other.replyOwnerId) return false
        if (replyPostId != other.replyPostId) return false
        if (friendsOnly != other.friendsOnly) return false
        if (comments != other.comments) return false
        if (copyright != other.copyright) return false
        if (likes != other.likes) return false
        if (reposts != other.reposts) return false
        if (vies != other.vies) return false
        if (postType != other.postType) return false
        if (!attachments.contentEquals(other.attachments)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + ownerId
        result = 31 * result + fromId
        result = 31 * result + createdBy
        result = 31 * result + date.hashCode()
        result = 31 * result + text.hashCode()
        result = 31 * result + replyOwnerId
        result = 31 * result + replyPostId
        result = 31 * result + friendsOnly.hashCode()
        result = 31 * result + comments.hashCode()
        result = 31 * result + copyright.hashCode()
        result = 31 * result + likes.hashCode()
        result = 31 * result + reposts.hashCode()
        result = 31 * result + vies.hashCode()
        result = 31 * result + postType.hashCode()
        result = 31 * result + attachments.contentHashCode()
        return result
    }
}

data class Comments(
    var count: Int = 0,
    var canPost: Boolean = true,
    var gropCanPosts: Boolean = true,
    var canClose: Boolean = true,
    var canOpen: Boolean = true
)

data class Likes(
    var count: Int = 0,
    var userLikes: Boolean = true,
    var canLike: Boolean = true,
    var canPublish: Boolean = true
)


data class Reposts(var count: Int = 0, var userReposter: Boolean = false)
data class Vies(var count: Int = 0)
data class Geo(val type: String = "Город", val coordinates: String = "00.00.00", val place: String = "город")

enum class PostType {
    post, copy, reply, postpone, suggest
}
