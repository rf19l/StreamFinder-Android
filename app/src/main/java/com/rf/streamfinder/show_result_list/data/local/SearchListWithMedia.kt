package com.rf.streamfinder.show_result_list.data.local

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Junction
import androidx.room.Relation
data class SearchListWithMedia(
    @Embedded val searchListEntity: SearchListEntity,
    @Relation(
        parentColumn = "searchListId",
        entityColumn = "mediaId",
        associateBy =
        Junction(SearchListMediaCrossRef::class)
    )
    val mediaList: List<MediaEntity>
)
