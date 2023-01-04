package com.rf.streamfinder.show_result_list.data.local

import androidx.room.Embedded
import androidx.room.Relation

data class MediaListingEntityWithListings(
    @Embedded val mediaListingEntity: MediaListingEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "id"
    )
    val mediaListings:List<MediaEntity>
)
