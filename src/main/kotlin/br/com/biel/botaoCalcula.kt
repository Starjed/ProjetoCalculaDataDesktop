package br.com.biel
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.darkColors
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.text.SimpleDateFormat


@Composable             // APARECER A DATA APÓS O CLIQUE DO USUÁRIO NO BOTÃO
fun botaoCalcula(text: String) {

    var calculo by remember { mutableStateOf(false) }

    MaterialTheme {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {
            Button(onClick = {
                calculo = !calculo

            })
            {
                if (calculo) "HIDE" else "SHOW"
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Alignment.CenterHorizontally
        Arrangement.Center

        AnimatedVisibility(calculo) {
            boxAparece(text)
        }

    }

}

//                    BOX APARECERÁ APÓS O CLIQUE DO USUARIO
@Composable
fun boxAparece(text: String) {
    var formatter = SimpleDateFormat("dd/MM/yyyy")


    val converter = Conversor().converte("paosdk")

    MaterialTheme {

        darkColors(Color.Black)

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {

        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.offset(y = 430.dp).offset(x = 130.dp)
                .background(Color.LightGray)
                .height(50.dp)
                .clip(CircleShape)
                .width(500.dp)
                .shadow(20.dp)
                .fillMaxSize()


        ) {
            Text(
                "a diferença entre as datas é $converter + $text",
                fontFamily = FontFamily.SansSerif,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

        }
    }

}