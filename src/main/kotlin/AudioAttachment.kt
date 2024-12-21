package org.netology_exceptions

class AudioAttachment(val audio: Audio) : AttachmentInterface {
    override val type: String = "audio"
}

class Audio(val id: Int, val ownerId: Int, val songName: String, val duration: Int)


class VideoAttachment(val video: Video) : AttachmentInterface {
    override val type: String = "video"
}

class Video(val id: Int, val ownerId: Int, val title: String, val duration: Int)


class PhotoAttachment(val photo: Photo) : AttachmentInterface {
    override val type: String = "photo"

}

class Photo(val id: Int, val ownerId: Int, val photo130: String, val photo604: String)

class GraffitiAttachment(val graffiti: Graffiti) : AttachmentInterface {
    override val type: String = "graffiti"

}

class Graffiti(val id: Int, val ownerId: Int, val photo130: String, val photo604: String)

class AppAttachment(val app: App) : AttachmentInterface {
    override val type: String = "app"
}

class App(val id: Int, val ownerId: Int, val photo130: String, val photo604: String)
