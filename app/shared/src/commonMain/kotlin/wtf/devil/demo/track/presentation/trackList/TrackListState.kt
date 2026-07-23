package wtf.devil.demo.track.presentation.trackList

import wtf.devil.demo.core.presentation.UiText
import wtf.devil.demo.track.domain.Track

data class TrackListState(
    val searchQuery: String = "Kotlin",
    val searchResults: List<Track> = emptyList(),
    val favoriteTracks: List<Track> = emptyList(),
    val isLoading: Boolean = false,
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null
)