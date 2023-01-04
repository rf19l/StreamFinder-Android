package com.rf.streamfinder.show_result_list.data.mapper

import com.rf.streamfinder.show_result_list.data.local.SearchListEntity
import com.rf.streamfinder.show_result_list.domain.model.MediaListing

fun SearchListEntity.toMediaListing(): MediaListing {
    return MediaListing(
        title = title,
        releaseYear = releaseYear,
        imdbRating = imdbRating,
    )
}

fun MediaListing.toMediaListingEntity(): SearchListEntity {
    return SearchListEntity(
        title = title,
        releaseYear = releaseYear,
        imdbRating = imdbRating,
    )
}