package com.rf.streamfinder.show_result_list.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.rf.streamfinder.show_result_list.data.model.StreamingPlatform

@Entity
data class MediaListingEntity(
    val title: String? = null,
    val releaseYear: Int? = null,
    val imdbRating: Double? = null,
    val streamingList: List<StreamingPlatform>? = listOf(),
    val purchaseList: List<StreamingPlatform>? = listOf(),
    @PrimaryKey val id: Int? = null

)
