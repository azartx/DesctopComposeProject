import androidx.compose.desktop.Window
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp

fun main() = Window(
    title = "Русский язык Тесты",
    size = IntSize(500, 500)
) {
    var text by remember { mutableStateOf(1) }

    MaterialTheme {


        Card(
            Modifier
                .fillMaxWidth()
                .padding(15.dp)
        ) {
            Column {
                Row(Modifier.align(Alignment.CenterHorizontally).padding(bottom = 20.dp)) {
                    Text(text = "Тесты по русскому языку")
                }

                Row(Modifier.align(Alignment.CenterHorizontally)) {
                    Button(onClick = {
                        ++text
                }) {
                        Text(text = "Some button $text")
                    }

                }
            }
        }


    }
}