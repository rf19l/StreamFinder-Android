package com.rf.streamfinder

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.produceState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.rf.streamfinder.show_result_list.data.StreamingAvailabilityClient
import com.rf.streamfinder.show_result_list.data.model.Media
import com.rf.streamfinder.show_result_list.ui.MediaListEntryCard
import com.rf.streamfinder.ui.theme.StreamFinderTheme

class MainActivity : ComponentActivity() {

    // TODO: move to view model with di
    private val testClient = StreamingAvailabilityClient.newInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val testRequest = produceState<List<Media>>(
                initialValue = emptyList(),
                producer = {
                    value = testClient.searchForShows("yellowstone")
                }
            )
            StreamFinderTheme {
                MediaListEntryCard(media = Media())
                // A surface container using the 'background' color from the theme
                /*Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
                LazyColumn{
                    items(testRequest.value){
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp)
                        ){
                            Text(text = it.title.toString(), fontSize = 20.sp)

                        }
                    }
                }
                
                 */
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    StreamFinderTheme {
        Greeting("Android")
    }
}