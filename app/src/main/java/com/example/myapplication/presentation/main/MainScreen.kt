package com.example.myapplication.presentation.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.W500
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.R
import com.example.myapplication.presentation.reusable.Space
import com.example.myapplication.presentation.ui.theme.Blue
import com.example.myapplication.presentation.ui.theme.Dark
import com.example.myapplication.presentation.ui.theme.DeepBlue
import com.example.myapplication.presentation.ui.theme.Gray
import com.example.myapplication.presentation.ui.theme.GrayText
import com.example.myapplication.presentation.ui.theme.Green
import com.example.myapplication.presentation.ui.theme.Orange
import com.example.myapplication.presentation.ui.theme.Red

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(navController: NavController) {
    val list_of_colors = listOf(Blue, Red, Orange, Green)
    val list_of_games = listOf("Animal", "Word_task", "Main", "Main")
    val list_of_icons = listOf(
        R.drawable.execise_animal,
        R.drawable.correct_the_word,
        R.drawable.audition,
        R.drawable.game
    )
    Scaffold(
        topBar = {
            TopBar(navController)
        }) { innerPadding ->
        Column(
            Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(horizontal = 20.dp)
        ) {
            Space(height = 10.dp)
            Text("Top Users", color = Dark, fontSize = 20.sp, fontWeight = W500)
            Space(height = 5.dp)
            User()
            Space(height = 10.dp)
            User()
            Space(height = 10.dp)
            User()
            Space(height = 10.dp)
            Text("Available excersises", color = Dark, fontSize = 20.sp, fontWeight = W500)
            Space(height = 10.dp)
            LazyVerticalGrid(
                GridCells.Adaptive(150.dp),
                verticalArrangement = Arrangement.spacedBy(17.dp),
                horizontalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                items(4) { index ->
                    Game(
                        list_of_games[index],
                        list_of_colors[index],
                        list_of_icons[index],
                        navController
                    )
                }

            }
        }

    }
}

@Composable
fun TopBar(navController: NavController) {
    Column(
        Modifier
            .fillMaxWidth()
            .background(DeepBlue)
            .padding(horizontal = 24.dp)
            .padding(top = 70.dp, bottom = 10.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.ic_launcher_background),
            contentDescription = null,
            modifier = Modifier
                .size(54.dp)
                .clip(CircleShape)
                .clickable { navController.navigate("Profile") }
        )
        Space(height = 5.dp)
        Text(text = "Hello, Emil", color = Color.White, fontSize = 22.sp, fontWeight = W500)
        Space(height = 5.dp)
        Text(
            "Are you ready for learning today?",
            fontSize = 17.sp,
            fontWeight = W500,
            color = GrayText
        )
    }
}

@Composable
fun User() {
    Row(
        Modifier
            .fillMaxWidth()
            .background(Gray, RoundedCornerShape(20.dp))
            .padding(horizontal = 15.dp, vertical = 17.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(painterResource(R.drawable.user), null, modifier = Modifier.size(36.dp))
        Space(width = 24.dp)
        Text(
            "Bla bla bla lalala hehehehe hahaha",
            color = Dark,
            fontSize = 17.sp,
            fontWeight = W500,
            modifier = Modifier.width(160.dp)
        )
        Spacer(Modifier.weight(1f))
        Text(
            "10 points",
            color = Dark,
            fontSize = 17.sp,
            fontWeight = W500,
        )

    }
}

@Composable
fun Game(game_name: String, bg_color: Color, icon_id: Int, navController: NavController) {
    Column(
        Modifier
            .background(bg_color, RoundedCornerShape(20.dp))
            .padding(vertical = 10.dp, horizontal = 12.dp)
            .clickable {
                navController.navigate(game_name)
            },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painterResource(icon_id),
            null,
            modifier = Modifier.size(90.dp, 80.dp)
        )
        Space(height = 7.dp)
        Text("Guess the animal", color = Color.White, fontSize = 13.sp)
    }
}