package com.rf.streamfinder.show_result_list.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
        Column {
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
                media.purchaseList?.forEach {
                    Text(text = it.platformName.toString())
                }
            }
        }
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