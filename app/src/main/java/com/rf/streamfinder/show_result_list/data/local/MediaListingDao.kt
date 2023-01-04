package com.rf.streamfinder.show_result_list.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction

@Dao
interface MediaListingDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMediaListing(mediaListingEntity: MediaListingEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMedia(mediaEntity: MediaEntity)

    @Query("SELECT * FROM MediaEntity WHERE id = :id")
    suspend fun getListingForMedia(id:Int?):MediaListingEntity


}