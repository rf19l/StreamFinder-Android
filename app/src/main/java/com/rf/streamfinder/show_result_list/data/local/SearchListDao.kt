package com.rf.streamfinder.show_result_list.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Update

@Dao
interface SearchListDao {
    @Transaction
    @Query("SELECT * FROM MediaEntity INNER JOIN SearchListMediaCrossRef ON MediaEntity.mediaId = SearchListMediaCrossRef.mediaId WHERE SearchListMediaCrossRef.searchListId = :id")

    fun getMediaForSearchList(id: Int): List<SearchListWithMedia>
        @Insert
        suspend fun insertSearchList(searchList: SearchListEntity)

        @Update
        suspend fun updateSearchList(searchList: SearchListEntity)

        @Delete
        suspend fun deleteSearchList(searchList: SearchListEntity)

        @Query("SELECT * FROM SearchListEntity")
        suspend fun getAllSearchLists(): List<SearchListEntity>

        @Query("SELECT * FROM SearchListEntity WHERE title LIKE :searchString")
        suspend fun searchForSearchListsByTitle(searchString: String): List<SearchListEntity>

        @Transaction
        @Query("SELECT * FROM MediaEntity INNER JOIN SearchListMediaCrossRef ON MediaEntity.mediaId = SearchListMediaCrossRef.mediaId WHERE SearchListMediaCrossRef.searchListId = :searchId AND platformType = :platformType")
        fun getMediaForSearchList(searchId: Int, platformType: String): List<MediaEntity>


        @Query("DELETE FROM SearchListMediaCrossRef WHERE searchListId = :searchListId")
        fun removeAllMediaFromSearchList(searchListId: Int)

        @Query("DELETE FROM SearchListMediaCrossRef WHERE SearchListMediaCrossRef.searchListId = :searchListId AND SearchListMediaCrossRef.mediaId = :mediaId")
        fun removeMediaFromSearchList(searchListId: Int, mediaId: Int)

}