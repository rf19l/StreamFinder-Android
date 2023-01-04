package com.rf.streamfinder.show_result_list.data

import com.rf.streamfinder.show_result_list.data.model.Media
import io.ktor.client.HttpClient
import io.ktor.client.engine.android.Android
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.KotlinxSerializer
import io.ktor.client.features.logging.Logging

interface StreamingAvailabilityClient {
    //TODO update to use DI library as future enhancement
    suspend fun searchForShows(query: String): List<Media>

    companion object {
        fun newInstance(): StreamingAvailabilityImplementation {
            return StreamingAvailabilityImplementation(
                client = HttpClient(Android){
                    install(JsonFeature){
                        serializer = KotlinxSerializer()
                    }
                }
            )
        }
    }
}