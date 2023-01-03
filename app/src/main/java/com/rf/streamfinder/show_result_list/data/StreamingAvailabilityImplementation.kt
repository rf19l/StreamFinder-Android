package com.rf.streamfinder.show_result_list.data

import android.util.Log
import com.rf.streamfinder.show_result_list.data.model.Media
import io.ktor.client.HttpClient
import io.ktor.client.features.ClientRequestException
import io.ktor.client.features.RedirectResponseException
import io.ktor.client.features.ServerResponseException
import io.ktor.client.features.get
import io.ktor.client.request.*

/**
 * TODO wrap list in class to better handle errors
 */
class StreamingAvailabilityImplementation(private val client: HttpClient) : StreamingAvailabilityClient {
    private val baseUrl: String = "http://127.0.0.1:8080/search?title="
    override suspend fun searchForShows(query: String): List<Media> {
        return try{
            client.get{
                url(baseUrl+query)
            }
        } catch(e:RedirectResponseException){
            println(e.toString())
            emptyList()
        }
        catch(e:ClientRequestException){
            println(e.toString())
            emptyList()
        }
        catch(e:ServerResponseException){
            println(e.toString())
            emptyList()
        }
        catch(e:Exception){
            println(e.toString())
            emptyList()
        }
    }

}