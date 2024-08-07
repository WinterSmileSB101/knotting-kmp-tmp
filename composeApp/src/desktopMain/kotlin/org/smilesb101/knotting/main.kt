package org.smilesb101.knotting

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "knotting-KMP",
    ) {
        App()
    }
}