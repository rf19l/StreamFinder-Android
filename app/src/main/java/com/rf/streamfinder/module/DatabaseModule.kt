package com.rf.streamfinder.module

import android.content.Context
import androidx.room.Room
import com.rf.streamfinder.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext

@Module
@InstallIn(StreamFinderApplication::class)
object DatabaseModule {
    @Provides
    fun provideDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java,"com.rf.streamfinder.AppDatabase")
            .build()
    }
}