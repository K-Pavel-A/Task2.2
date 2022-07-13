interface Attachment {
    val type: String?
}

class AttachmentPhoto(val photo: Photo): Attachment {
    override val type: String? = "Photo"

    var attachmentPhotos = emptyArray<Photo>()

    fun addPhotos(photo:Photo): Photo {
        attachmentPhotos += photo
        return attachmentPhotos.last()
    }
}
open class Photo(
    val id: Int = 1,
    val albumId: Int = 1,
    val ownerId: Int = 1,
    val userId: Int = 1,
    val text: String ="",
    val date: Int = 1,
    val width: Int = 1,
    val height: Int = 1
)

class AttachmentVideo(val video: Video): Attachment, Video(){
    override val type: String? = "Video"
    var attachmentVideos = emptyArray<Video>()

    fun addPhotos(video: Video): Video {
        attachmentVideos += video
        return attachmentVideos.last()
    }
}
open class Video(
    val id: Int = 1,
    val ownerId: Int = 1,
    val title: String = "",
    val description: String = "",
    val duration: Int = 1,
    val views: Int = 0,
    val comments: Int = 0 ,
    val date: Int = 1,
    val width: Int = 1,
    val height: Int = 1,
    val userId: Int = 1
)

class AttachmentAudio(audio: Audio): Attachment, Audio(){
    override val type: String? = "Audio"

    var attachmentAudio = emptyArray<Audio>()

    fun addPhotos(audio: Audio): Audio {
        attachmentAudio += audio
        return attachmentAudio.last()
    }
}
open class Audio(
    val id: Int = 1,
    val ownerId: Int = 1,
    val title: String = "",
    val artist: String = "",
    val duration: Int = 1,
    val views: Int = 0,
    val url: String = "",
    val lyricsId: Int? = 0,
    val albumId: Int = 1,
    val genreId: Int = 1,
    val date: Int = 1,
    val noSearch: Boolean = false,
    val isHq: Boolean = false
)

class AttachmentDoc(doc: Doc): Attachment, Doc(){
    override val type: String? = "Doc"

    var attachmentDocs = emptyArray<Doc>()

    fun addPhotos(doc: Doc): Doc {
        attachmentDocs += doc
        return attachmentDocs.last()
    }
}
open class Doc(
    val id: Int = 1,
    val ownerId: Int = 1,
    val title: String = "",
    val size: Int = 1,
    val ext: String = "",
    val typeDoc: Int = 0,
    val url: String = "",
    val date: Int = 1
)

class AttachmentNote(note:Note): Attachment{
    override val type: String? = "Note"

    var attachmentNotes = emptyArray<Note>()

    fun addPhotos(note: Note): Note {
        attachmentNotes += note
        return attachmentNotes.last()
    }
}
open class Note(
    val id: Int = 1,
    val ownerId: Int = 1,
    val title: String = "",
    val date: Int = 1,
    val text: String = "",
    val readComments: Int = 0,
    val viewUrl: String = "",
    val comments: Int = 1,
    val canComment : Int = 0
)