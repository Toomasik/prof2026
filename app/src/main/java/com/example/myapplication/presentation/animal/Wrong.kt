package com.example.myapplication.presentation.animal

import androidx.compose.foundation.layout.width
import com.example.myapplication.presentation.ui.theme.Red

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.W500
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.R
import com.example.myapplication.presentation.reusable.InputComponent
import com.example.myapplication.presentation.reusable.Space
import com.example.myapplication.presentation.ui.theme.Blue
import com.example.myapplication.presentation.ui.theme.Dark
import com.example.myapplication.presentation.ui.theme.DeepBlue
import com.example.myapplication.presentation.ui.theme.Green

@Composable
fun WrongAnimalAnswerScreen(navController: NavController) {
    Scaffold(
        topBar = { TopBarWrongAnimalAnswer(navController = navController) }
    ) { innerPadding ->
        Column(
            Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(horizontal = 20.dp),

            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Space(height = 63.dp)
            Image(painterResource(R.drawable.wrong_answer), null, modifier = Modifier.size(160.dp))
            Space(height = 45.dp)
            Text(
                "Eh? Wrong answer :( That is: Racoon",
                fontWeight = W500,
                fontSize = 20.sp,
                color = Dark,
                modifier = Modifier.width(190.dp)
            )
            Space(height = 40.dp)
            Button(
                { navController.navigate("Animal") },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Blue, RoundedCornerShape(12.dp)),
            ) {
                Text("Next", color = Color.White, fontSize = 20.sp, fontWeight = W500)
            }
            Space(height = 10.dp)
            Button(
                { navController.navigate("Animal") },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Blue, RoundedCornerShape(12.dp)),
            ) {
                Text("Try again", color = Color.White, fontSize = 20.sp, fontWeight = W500)
            }

        }
    }
}

@Composable
fun TopBarWrongAnimalAnswer(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Red)
            .padding(horizontal = 20.dp)
            .padding(top = 50.dp)
            .height(50.dp),
    ) {
        IconButton({ navController.navigate("Main") }) {
            Icon(
                Icons.AutoMirrored.Default.KeyboardArrowLeft,
                null,
                modifier = Modifier.size(50.dp),
                tint = Color.White
            )
        }
        Text(
            "Guess the animal",
            color = Color.White,
            fontWeight = W500,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp)
        )
    }

}