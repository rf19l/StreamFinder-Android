package com.rf.streamfinder.show_result_list.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
@Entity(primaryKeys = ["searchListId", "mediaId"])
data class SearchListMediaCrossRef(
    val searchListId: Int,
    val mediaId: Int
)


