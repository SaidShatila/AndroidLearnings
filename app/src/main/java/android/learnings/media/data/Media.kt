package android.learnings.media.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


data class MediaListResponse(val mediaResponses:List<MediaResponse>)

fun MediaListResponse.toMediaList() :List<Media> = mediaResponses.mapNotNull { it.toMedia() }

@Serializable
data class MediaResponse(
    @SerialName("type")
    val type: String,
    @SerialName("albumName")
    val albumName: String?,// albumName = "Zinco"
    @SerialName("songName")
    val songName: String?,// songName = "gringo"
    @SerialName("artistName")
    val artistName: String,
    @SerialName("numberOfSongs")
    val numberOfSongs: Int?,
    @SerialName("rating")
    val rating: Float?
){
   private val _songs:MutableList<MediaResponse> = mutableListOf<MediaResponse>()
    val songs:List<MediaResponse>
    get() =_songs

}
val result2:String?=""
var result:String? = ""

private fun MediaResponse.toMedia(): Media? {
   val media =  MediaResponse("type1","albi ma3ak","roohe wayyak","fadel shaker",8,3F)
     media.copy(type="type2")
//    media.songs.add(media)
val safeResult:String? = result

    if(safeResult!=null){
        safeResult.uppercase()
    }
    result?.let { safeResult->

    }
    if(result2!=null){
        result2.lowercase()
    }

    for(i in 0 until 10){
//        result2+="."
        result+="."
    }
    println(result)

    if (type == "album") {
        return Media.Album(
            name = albumName
                ?: throw IllegalArgumentException("Name cannot be null if the media is ALBUM"),
            artistName = artistName,
            numberOfSongs = numberOfSongs
                ?: throw IllegalArgumentException("Number of songs cannot be null if the media is ALBUM"),
            rating = rating ?: 0f
        )
    } else if (type == "song") {
       return Media.Song(
            name = songName
                ?: throw IllegalArgumentException("Name cannot be null if the media is SONG"),
            artistName = artistName,
            rating = rating ?: 0f
        )
    }
    return null
}

sealed class Media {
    data class Album(
        val name: String,
        val artistName: String,
        val numberOfSongs: Int,
        val rating: Float
    ) : Media()

    data class Song(val name: String, val artistName: String, val rating: Float) : Media()
}