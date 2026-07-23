package wtf.devil.demo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import wtf.devil.demo.core.presentation.AppColors
import wtf.devil.demo.track.presentation.trackList.components.TrackSearchBar

@Preview
@Composable
private fun PreviewTrackSearchBar() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(AppColors.DarkGray.c)
    ) {
        TrackSearchBar(
            searchQuery = "Kotlin",
            onSearchQueryChange = {},
            onImeSearch = {},
            modifier = Modifier
                .fillMaxWidth()
        )
    }
}