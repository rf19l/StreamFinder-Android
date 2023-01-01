package com.rf.streamfinder.show_result_list.data

import kotlinx.coroutines.flow.Flow

interface StreamingAvailabilityClient {
    //TODO replace type of flow once data class made
    fun getStreamingLocation(): Flow<*>
    private suspend fun todo(){}
}