package com.rf.streamfinder.show_result_list.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.rf.streamfinder.show_result_list.data.model.Media
import com.rf.streamfinder.show_result_list.data.model.StreamingPlatform

@Composable
fun MediaListEntry(
    media: Media, modifier: Modifier = Modifier
) {
    Row() {
        Column {
            Row(
                modifier = modifier,
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Column {
                    Row {
                        Text(text = media.title.toString())
                        Text(text = "(${media.releaseYear.toString()})")
                    }
                }
                Column {
                    Text(
                        text = media.imdbRating.toString()
                    )
                }


            }
        }
        Column(modifier = Modifier.background(Color.Cyan)) {
            Row(
                modifier = modifier,
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                media.streamingList?.forEach {
                    Text(text = it.platformName.toString())
                }
            }
            Row(
                modifier = modifier,
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "Streaming")
                media.purchaseList?.forEach {
                    Text(text = it.platformName.toString())
                }
            }
        }
    }

}

@Composable
fun MediaListEntryCard(media: Media) {
    OutlinedCard(
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
            .padding(8.dp)
    ) {
        // outer row
        Row(
            Modifier
                .fillMaxHeight()
                .wrapContentWidth()
        ) {
            //picture column
            Column(
                Modifier
                    .fillMaxHeight()
                    .weight(.3f)
            ) {
                AsyncImage("https://picsum.photos/200/500", null, Modifier.fillMaxSize())
            }
            //content column
            Column(Modifier.weight(.7f)) {
                //title info row
                Text(text = "Title")
                Spacer(Modifier.height(4.dp))
                Text("(2018)")
                //streaming outer container
                Row {
                    Text(text = "Streaming")
                    for (i in 1..3) {
                        //streaming row elements
                        Column {
                            AsyncImage(
                                model = "https://picsum.photos/200",
                                contentDescription = null
                            )
                            Text(text = "Season Count", softWrap = false)
                            Text(text = "resolution")
                        }
                    }
                }
                //Purchase outer container
                Row {
                    Text("Buy")
                    for (i in 1..3) {
                        //Purchase row elements
                        Column {
                            AsyncImage(
                                model = "https://picsum.photos/200",
                                contentDescription = null
                            )
                            Text(text = "Season Count")
                            Text(text = "resolution")
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun StreamingPlatformListItem() {
    Column(Modifier.wrapContentSize()) {
        AsyncImage(
            model = "https://picsum.photos/200",
            contentDescription = null,
            modifier = Modifier.fillMaxWidth()
        )
        Text("title")
        Text("Release Year")
        Text("Imdb rating")
    }
}

@Preview
@Composable
fun StreamingPlatformListItemPreview() {
    StreamingPlatformListItemPreview()
}

@Preview
@Composable
fun CardPreview() {
    Surface(modifier = Modifier.width(200.dp)) {
        MediaListEntryCard(Media())
    }
}


@Preview
@Composable
fun MediaListEntryPreview() {
    Surface(modifier = Modifier.width(200.dp)) {
        MediaListEntry(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp), media = Media(
                title = "test", releaseYear = 2023, imdbRating = 10.0, listOf(
                    StreamingPlatform(
                        platformName = "netflix",
                        seasonCount = 5,
                        image = null,
                        platformType = "Stream"
                    )
                )
            )
        )
    }
}