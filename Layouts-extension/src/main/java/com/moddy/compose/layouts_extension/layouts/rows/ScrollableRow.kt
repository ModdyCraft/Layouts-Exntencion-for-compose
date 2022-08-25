package com.moddy.compose.layouts_extension.layouts.rows

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
inline fun ScrollableRow(
    modifier: Modifier = Modifier,
    enableScrolling: Boolean = true,
    horizontalArrangement: Arrangement.Horizontal = Arrangement.Start,
    verticalAlignment: Alignment.Vertical = Alignment.Top,
    content: @Composable RowScope.() -> Unit
) {
    val stateScroll = rememberScrollState()
    Row(
        modifier = modifier
            .horizontalScroll(
                state = stateScroll,
                enabled = enableScrolling
            ),
        horizontalArrangement = horizontalArrangement,
        verticalAlignment = verticalAlignment,
    ) {
        content(this)
    }
}