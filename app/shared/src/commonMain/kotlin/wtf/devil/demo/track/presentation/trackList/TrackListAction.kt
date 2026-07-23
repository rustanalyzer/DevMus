package wtf.devil.demo.track.presentation.trackList

import wtf.devil.demo.track.domain.Track

sealed interface TrackListAction {
    data class OnSearchQueryChange(val query: String) : TrackListAction
    data class OnTrackClick(val track: Track) : TrackListAction
    data class OnTabSelected(val index: Int) : TrackListAction
}