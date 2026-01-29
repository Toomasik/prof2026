package com.example.myapplication.presentation.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
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
import com.example.myapplication.R
import com.example.myapplication.presentation.reusable.Space
import com.example.myapplication.presentation.ui.theme.Blue
import com.example.myapplication.presentation.ui.theme.Dark
import com.example.myapplication.presentation.ui.theme.DeepBlue
import com.example.myapplication.presentation.ui.theme.Gray
import com.example.myapplication.presentation.ui.theme.GrayText
import com.example.myapplication.presentation.ui.theme.LightGray

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    Scaffold(
        topBar = {
            TopBar()
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
                items(4) {
                    Game()
                }

            }
        }

    }
}

@Composable
fun TopBar() {
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
fun Game() {
    Column(
        Modifier
            .background(Blue, RoundedCornerShape(20.dp))
            .padding(vertical = 10.dp, horizontal = 12.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painterResource(R.drawable.game), null, modifier = Modifier.size(90.dp, 80.dp))
        Space(height = 7.dp)
        Text("Guess the animal", color = Color.White, fontSize = 13.sp)
    }
}