package com.rf.streamfinder

import androidx.room.Database
import androidx.room.RoomDatabase
import com.rf.streamfinder.show_result_list.data.local.MediaEntity
import com.rf.streamfinder.show_result_list.data.local.SearchListDao
import com.rf.streamfinder.show_result_list.data.local.SearchListEntity

@Database(entities = [MediaEntity::class, SearchListEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun searchListDao(): SearchListDao
}