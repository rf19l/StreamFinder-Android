package com.rf.streamfinder.show_result_list.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.rf.streamfinder.show_result_list.data.model.StreamingPlatform

@Entity
data class SearchListEntity(
    val title: String? = null,
    val releaseYear: Int? = null,
    val imdbRating: Double? = null,
    @PrimaryKey val id: Int? = null
)
