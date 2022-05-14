package ziegler.torben.albumsapi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dagger.hilt.android.AndroidEntryPoint
import ziegler.torben.albumsapi.ui.home.HomeScreen
import ziegler.torben.albumsapi.ui.theme.AlbumsAPITheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AlbumsAPITheme {
                HomeScreen()
            }
        }
    }
}



