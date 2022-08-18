
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import br.com.biel.App

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
    App()
        }
}



