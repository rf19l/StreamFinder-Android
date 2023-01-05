package com.rf.streamfinder.show_result_list.data.local

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface SearchListMediaCrossRefDao {
    @Dao
    interface SearchListMediaCrossRefDao {
        @Insert
        fun insert(searchListMediaCrossRef: SearchListMediaCrossRef)
    }
}