package ziegler.torben.albumsapi.ui.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.annotation.ExperimentalCoilApi
import coil.compose.AsyncImage
import coil.request.ImageRequest
import ziegler.torben.albumsapi.R
import ziegler.torben.albumsapi.ui.card.TrackListCard
import ziegler.torben.albumsapi.utils.Constants.BASE_URL

@OptIn(ExperimentalCoilApi::class)
@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp)
    ) {
        val viewModel: HomeViewModel = hiltViewModel()
        val album = viewModel.state.value.album
        val isLoading = viewModel.state.value.isLoading

        album?.let {
            var imageUrl = album.imageUrl
            if (album.imageUrl.startsWith("/static")) {
                imageUrl = "${BASE_URL}${album.imageUrl}"
            }
            ImageCard(
                imageUrl = imageUrl,
                contentDescription = album.name
            )
            Spacer(modifier = Modifier.height(8.dp))
            TrackListCard(album = album)
            Spacer(modifier = Modifier.height(8.dp))
        }
        Button(
            onClick = viewModel::getRandomAlbum,
            modifier = Modifier.align(Alignment.End)
        ) {
            Text(text = stringResource(id = R.string.next_album))
        }
        if (isLoading) {
            CircularProgressIndicator()
        }
    }
}


@Composable
fun ImageCard(
    imageUrl: String,
    contentDescription: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(10.dp),
        elevation = 5.dp
    ) {
        Box(modifier = Modifier.height(350.dp)) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(imageUrl)
                    .crossfade(true)
                    .build(),
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}