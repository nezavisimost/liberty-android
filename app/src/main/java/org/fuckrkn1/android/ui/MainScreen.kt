package org.fuckrkn1.android.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.fuckrkn1.android.R
import org.fuckrkn1.android.ui.style.TextStyles

@Composable
fun MainScreen(
    uiEventListener: (MainUiEvent) -> Unit
) {
    BackgroundNoise()
    MainDecoration()
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 20.dp, horizontal = 30.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        TextButton(onClick = { uiEventListener(MainUiEvent.ABOUT_CLICK) }) {
            Text(
                text = stringResource(id = R.string.about),
                style = TextStyles.textSemiBold(14.sp)
            )
        }
        TextButton(onClick = { uiEventListener(MainUiEvent.SUPPORT_US_CLICK) }) {
            Text(
                text = stringResource(id = R.string.support_us),
                style = TextStyles.textSemiBold(14.sp)
            )
        }
    }
}

@Composable
@Preview
private fun MainScreenPreview() {
    MainScreen(uiEventListener = {})
}

enum class MainUiEvent {
    ABOUT_CLICK,
    SUPPORT_US_CLICK,
}