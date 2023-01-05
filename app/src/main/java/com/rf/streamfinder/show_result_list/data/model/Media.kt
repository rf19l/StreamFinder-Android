package com.rf.streamfinder.show_result_list.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Media(
    var title: String? = null,
    var releaseYear: Int? = null,
    var imdbRating: Double? = null,
    var streamingList: List<StreamingPlatform>? = listOf(),
    var purchaseList: List<StreamingPlatform>? = listOf(),
    var image: String? = null,
//    @BsonId
//    var id: String = ObjectId().toString(),
)
