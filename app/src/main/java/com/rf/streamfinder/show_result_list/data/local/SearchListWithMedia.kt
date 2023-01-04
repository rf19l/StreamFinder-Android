package com.rf.streamfinder.show_result_list.data.local

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

data class SearchListWithMedia(
    @Embedded
    val searchListEntity: SearchListEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "searchListId",
        associateBy =
        Junction(
            value = SearchListMediaEntity::class,
            parentColumn = "searchListId",
            entityColumn = "mediaId"
        )
    )
    val mediaList: List<MediaEntity>
)
