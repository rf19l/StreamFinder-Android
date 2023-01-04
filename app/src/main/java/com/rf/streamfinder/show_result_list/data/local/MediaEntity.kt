package com.rf.streamfinder.show_result_list.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class MediaEntity(
    @PrimaryKey val id: Int? = null,
    val platformName: String? = null,
    val seasonCount: Int? = null,
    val image: String? = null,
    val platformType: String? = null,
)
