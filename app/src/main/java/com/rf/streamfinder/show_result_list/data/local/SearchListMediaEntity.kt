package com.rf.streamfinder.show_result_list.data.local

import androidx.room.Entity
import androidx.room.ForeignKey

@Entity(
    primaryKeys = ["searchListId", "mediaId"], foreignKeys = [
        ForeignKey(
            entity = SearchListEntity::class,
            parentColumns = ["id"],
            childColumns = ["searchListId"]
        ), ForeignKey(
            entity = MediaEntity::class,
            parentColumns = ["id"],
            childColumns = ["mediaId"]
        )
    ]
)
data class SearchListMediaEntity(
    val searchListId: Int? = null,
    val mediaId: Int? = null,
    )
