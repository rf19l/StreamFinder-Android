package com.rf.streamfinder.show_result_list.data.mapper

import com.rf.streamfinder.show_result_list.data.local.MediaListingEntity
import com.rf.streamfinder.show_result_list.domain.model.MediaListing

fun MediaListingEntity.toMediaListing(): MediaListing {
    return MediaListing(
        title = title,
        releaseYear = releaseYear,
        imdbRating = imdbRating,
        streamingList = streamingList,
        purchaseList = purchaseList
    )
}

fun MediaListing.toMediaListingEntity(): MediaListingEntity {
    return MediaListingEntity(
        title = title,
        releaseYear = releaseYear,
        imdbRating = imdbRating,
        streamingList = streamingList,
        purchaseList = purchaseList
    )
}