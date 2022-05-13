package ziegler.torben.albumsapi.ui.home

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import ziegler.torben.albumsapi.data.Album
import ziegler.torben.albumsapi.data.AlbumsApi
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val api: AlbumsApi
) : ViewModel() {

    private val _state = mutableStateOf(AlbumState())
    val state: State<AlbumState> = _state

    init {
        getRandomAlbum()
    }

    fun getRandomAlbum() {
        viewModelScope.launch {
            try {
                _state.value = state.value.copy(isLoading = true)
                _state.value = state.value.copy(
                    album = api.getRandomAlbum(),
                    isLoading = false
                )
            } catch (e: Exception) {
                Log.e("MainViewModel", "getRandomAlbum: ${e.localizedMessage}")
                _state.value = state.value.copy(isLoading = false)
            }
        }
    }

    data class AlbumState(
        val album: Album? = null,
        val isLoading: Boolean = false
    )

}