package wtf.devil.demo.track.presentation.trackList

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class TrackListViewModel : ViewModel() {
    private val _state = MutableStateFlow(TrackListState())
    val state = _state.asStateFlow()

    fun onAction(action: TrackListAction) {
        when (action) {
            is TrackListAction.OnSearchQueryChange -> {
                _state.update {
                    it.copy(searchQuery = action.query)
                }
            }
            is TrackListAction.OnTabSelected -> {
                _state.update {
                    it.copy(selectedTabIndex = action.index)
                }
            }
            is TrackListAction.OnTrackClick -> {

            }
        }
    }
}