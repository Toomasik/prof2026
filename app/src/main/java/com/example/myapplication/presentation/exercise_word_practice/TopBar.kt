package com.example.myapplication.presentation.exercise_word_practice

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight.Companion.W500
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myapplication.presentation.ui.theme.DeepBlue

@Composable
fun TopBar(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(DeepBlue)
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