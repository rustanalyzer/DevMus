package wtf.devil.demo

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import wtf.devil.demo.track.presentation.trackList.components.TrackSearchBar

@Preview
@Composable
private fun PreviewTrackSearchBar() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        TrackSearchBar(
            searchQuery = "Kotlin",
            onSearchQueryChange = {},
            onImeSearch = {},
            modifier = Modifier
                .fillMaxWidth()
        )
    };
}