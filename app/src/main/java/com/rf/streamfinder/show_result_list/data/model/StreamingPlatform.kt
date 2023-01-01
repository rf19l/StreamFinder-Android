package com.rf.streamfinder.show_result_list.data.model
import kotlinx.serialization.Serializable


@Serializable
data class StreamingPlatform(
    var platformName: String? = null,
    var seasonCount: Int? = null,
    var image: String? = null,
    var platformType: String? = null,
//    @BsonId var id: String = ObjectId().toString(),
)


