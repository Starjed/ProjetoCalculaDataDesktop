
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import br.com.biel.App
import br.com.biel.boxAparece

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
    App()
        }
}



