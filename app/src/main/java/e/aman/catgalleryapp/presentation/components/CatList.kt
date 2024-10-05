package e.aman.catgalleryapp.presentation.components

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import e.aman.catgalleryapp.core.utils.Constants
import e.aman.catgalleryapp.domain.model.Cat

/**
 * author: Aman Srivastava
 * Created on: 04/10/2024
 * List Items for Cat API.
 * Different UI for landscape and portrait mode.
 * */
@Composable
fun CatList(catList: List<Cat>, modifier: Modifier = Modifier, orientation: Int) {
    // Handled orientation changes to change UI.
    if (orientation == Configuration.ORIENTATION_PORTRAIT) {
        LazyColumn(
            modifier = Modifier,
        ) {
            itemsIndexed(catList) { _, it ->
                CatItemPortrait(
                    item = it,
                    modifier = modifier
                )
            }
        }
    }
    else {
        LazyRow(
            modifier = Modifier,
        ) {
            itemsIndexed(catList) { _, it ->
                CatItemLandscape(
                    item = it,
                    modifier = modifier
                )
            }
        }
    }
}

@Composable
fun CatItemLandscape(item: Cat, modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier
            .padding(10.dp)
            .width(300.dp)
            .clip(RoundedCornerShape(4.dp)),
    ) {
        Column(
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy((-70).dp)
        ) {
            CatImageLandscape(item)
            CatDescriptionLandscape(item, modifier)
        }
    }
}

@Composable
fun CatImageLandscape(item: Cat) {
    Image(
        painter = rememberAsyncImagePainter(model = item.url),
        contentDescription = null,
        modifier = Modifier
            .width(300.dp)
            .fillMaxHeight()
            .clip(shape = RoundedCornerShape(15.dp, 15.dp, 0.dp, 0.dp)),
        contentScale = ContentScale.FillBounds
    )
}

@Composable
fun CatDescriptionLandscape(item: Cat, modifier: Modifier) {
    Surface(
        modifier = Modifier,
        color = Color.Black.copy(alpha = 0.4f),
    ) {
        Column(
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            Text(
                text = Constants.DisplayText,
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth(),
                color = Color.White
            )
            Text(
                text = "Id : ${item.id.toString()}",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth(),
                color = Color.White
            )
        }
    }
}

@Composable
fun CatItemPortrait(item: Cat, modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier
            .padding(10.dp)
            .height(220.dp)
            .clip(RoundedCornerShape(4.dp)),
    ) {
        Column(
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy((-70).dp)
        ) {
            CatImage(item)
            CatDescription(item, modifier)
        }
    }
}

@Composable
fun CatImage(item: Cat) {
    Image(
        painter = rememberAsyncImagePainter(model = item.url),
        contentDescription = null,
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .clip(shape = RoundedCornerShape(15.dp, 15.dp, 0.dp, 0.dp)),
        contentScale = ContentScale.FillBounds
    )
}

@Composable
fun CatDescription(item: Cat, modifier: Modifier) {
    Surface(
        modifier = Modifier
            .fillMaxWidth(),
        color = Color.Black.copy(alpha = 0.4f),
    ) {
        Column(
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            Text(
                text = Constants.DisplayText,
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth(),
                color = Color.White
            )
            Text(
                text = "Id : ${item.id.toString()}",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth(),
                color = Color.White
            )
        }
    }
}
