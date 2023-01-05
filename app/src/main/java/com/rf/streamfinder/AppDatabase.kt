package com.rf.streamfinder

import androidx.room.Database
import androidx.room.RoomDatabase
import com.rf.streamfinder.show_result_list.data.local.MediaEntity
import com.rf.streamfinder.show_result_list.data.local.SearchListDao
import com.rf.streamfinder.show_result_list.data.local.SearchListEntity
import com.rf.streamfinder.show_result_list.data.local.SearchListMediaCrossRef
import com.rf.streamfinder.show_result_list.data.local.SearchListMediaCrossRefDao

@Database(
    entities = [MediaEntity::class, SearchListEntity::class, SearchListMediaCrossRef::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun searchListDao(): SearchListDao
    abstract fun searchListMediaCrossRefDao(): SearchListMediaCrossRefDao
}