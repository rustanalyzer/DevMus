package wtf.devil.demo.track.presentation.trackList

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import org.koin.compose.viewmodel.koinViewModel
import wtf.devil.demo.track.domain.Track

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

}