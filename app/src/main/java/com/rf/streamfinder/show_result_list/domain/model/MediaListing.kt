package com.rf.streamfinder.show_result_list.domain.model

import androidx.room.PrimaryKey
import com.rf.streamfinder.show_result_list.data.model.StreamingPlatform

data class MediaListing(
    val title: String? = null,
    val releaseYear: Int? = null,
    val imdbRating: Double? = null,
    val streamingList: List<StreamingPlatform>? = listOf(),
    val purchaseList: List<StreamingPlatform>? = listOf(),
)
