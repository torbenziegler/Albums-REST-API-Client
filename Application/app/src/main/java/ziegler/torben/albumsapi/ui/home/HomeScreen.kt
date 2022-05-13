package ziegler.torben.albumsapi.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter

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
            Image(
                painter = rememberImagePainter(
                    data = album.imageUrl,
                    builder = { crossfade(true) }
                ),
                contentDescription = album.name,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = album.name,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = album.releaseYear.toString())
            Spacer(modifier = Modifier.height(8.dp))
        }
        Button(
            onClick = viewModel::getRandomAlbum,
            modifier = Modifier.align(Alignment.End)
        ) {
            Text(text = "Next album")
        }
        Spacer(modifier = Modifier.height(8.dp))
        if (isLoading) {
            CircularProgressIndicator()
        }
    }
}