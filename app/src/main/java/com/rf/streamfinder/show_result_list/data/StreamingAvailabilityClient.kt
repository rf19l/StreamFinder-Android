package com.rf.streamfinder.show_result_list.data

import com.rf.streamfinder.show_result_list.data.model.Media
import io.ktor.client.HttpClient
import io.ktor.client.engine.android.Android
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.KotlinxSerializer
import kotlinx.serialization.json.Json

interface StreamingAvailabilityClient {
    //TODO update to use DI library as future enhancement
    suspend fun searchForShows(query: String): List<Media>

    /*
    TODO convert to Retrofit for android implementation, use ktor for multiplatform
     */
    companion object {
        fun newInstance(): StreamingAvailabilityClientImpl {
            return StreamingAvailabilityClientImpl(
                client = HttpClient(Android){
                    install(JsonFeature){
                        serializer = KotlinxSerializer(Json{
                            isLenient = true
                            ignoreUnknownKeys = true
                        })
                    }
                }
            )
        }
    }
}