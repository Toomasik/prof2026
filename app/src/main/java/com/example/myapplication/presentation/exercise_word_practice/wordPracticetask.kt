package com.example.myapplication.presentation.exercise_word_practice

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight.Companion.W500
import androidx.compose.ui.text.font.FontWeight.Companion.W600
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.presentation.reusable.Space
import com.example.myapplication.presentation.ui.theme.Blue
import com.example.myapplication.presentation.ui.theme.LightGray
import kotlin.random.Random


@Composable
fun WordsTask(navController: NavController) {
    Scaffold(
        topBar = { TopBar(navController) }
    ) { innerPadding ->
        Column(
            Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(horizontal = 24.dp)
        ) {
            Space(height = 34.dp)
            Text(
                "gardener",
                fontSize = 28.sp,
                fontWeight = W600,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Space(height = 2.dp)
            Text(
                "['gɑ:dnə']",
                fontSize = 17.sp,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Space(height = 34.dp)
            Button(
                {},
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                modifier = Modifier
                    .fillMaxWidth()
                    .background(LightGray, RoundedCornerShape(12.dp)),
                contentPadding = PaddingValues(vertical = 16.dp),
            ) {
                Text("Муха", color = Color.White, fontSize = 20.sp, fontWeight = W500)
            }
            Space(height = 10.dp)
            Button(
                {},
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                modifier = Modifier
                    .fillMaxWidth()
                    .background(LightGray, RoundedCornerShape(12.dp)),
                contentPadding = PaddingValues(vertical = 16.dp),
            ) {
                Text("Садовник", color = Color.White, fontSize = 20.sp, fontWeight = W500)
            }
            Space(height = 10.dp)
            Button(
                {},
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                modifier = Modifier
                    .fillMaxWidth()
                    .background(LightGray, RoundedCornerShape(12.dp)),
                contentPadding = PaddingValues(vertical = 16.dp),
            ) {
                Text("Гладиолус", color = Color.White, fontSize = 20.sp, fontWeight = W500)
            }
            Space(height = 10.dp)
            Button(
                {},
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                modifier = Modifier
                    .fillMaxWidth()
                    .background(LightGray, RoundedCornerShape(12.dp)),
                contentPadding = PaddingValues(vertical = 16.dp),
            ) {
                Text("Собака", color = Color.White, fontSize = 20.sp, fontWeight = W500)
            }
            Spacer(Modifier.weight(1f))
            Button(
                {},
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Blue, RoundedCornerShape(12.dp)),
            ) {
                Text("Check", color = Color.White, fontSize = 20.sp, fontWeight = W500)
            }
        }

    }
}