package wtf.devil.demo.track.presentation.trackList

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import org.koin.compose.viewmodel.koinViewModel
import wtf.devil.demo.track.domain.Track
import wtf.devil.demo.track.presentation.trackList.components.TrackSearchBar

@Composable
fun TrackListScreenRoot(
    viewModel: TrackListViewModel = koinViewModel(),
    onTrackClick: (Track) -> Unit,
) {
    val state by viewModel.state.collectAsStateWithLifecycle()

    TrackListScreen(
        state = state,
        onAction = { action ->
            when(action) {
                is TrackListAction.OnTrackClick -> onTrackClick(action.track)
                else -> Unit
            }
            viewModel.onAction(action)
        }
    )
}

@Composable
private fun TrackListScreen(
    state: TrackListState,
    onAction: (TrackListAction) -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        val keyboardController = LocalSoftwareKeyboardController.current

        TrackSearchBar(
            searchQuery = state.searchQuery,
            onSearchQueryChange = {
                onAction(TrackListAction.OnSearchQueryChange(it))
            },
            onImeSearch = {
                keyboardController?.hide()
            },
            modifier = Modifier
                .widthIn(max = 300.dp)
                .fillMaxWidth()
                .padding(16.dp)
        )
    }
}