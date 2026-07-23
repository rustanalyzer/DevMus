package wtf.devil.demo.track.presentation.trackList.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import demo.app.shared.generated.resources.Res
import demo.app.shared.generated.resources.search_hint
import org.jetbrains.compose.resources.stringResource
import wtf.devil.demo.core.presentation.AppColors
import wtf.devil.demo.icons.AppIcons
import wtf.devil.demo.icons.Search

@Composable
fun TrackSearchBar(
    searchQuery: String,
    onSearchQueryChange: (String) -> Unit,
    onImeSearch: () -> Unit,
    modifier: Modifier = Modifier,
) {
    OutlinedTextField(
        value = searchQuery,
        onValueChange = onSearchQueryChange,
        shape = RoundedCornerShape(100),
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = AppColors.NeutralGray.c,
            unfocusedBorderColor = AppColors.LightGray.c,
        ),
        placeholder = {
            Text(stringResource(Res.string.search_hint))
        },
        leadingIcon = {
            Icon(
                imageVector = AppIcons.Search,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f)
            )
        }
    )
}