package com.example.myapplication.presentation.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import com.example.myapplication.presentation.ui.theme.DeepBlue
import com.example.myapplication.presentation.ui.theme.GrayText
import com.example.myapplication.presentation.ui.theme.Green
import com.example.myapplication.presentation.ui.theme.VeryLightGray

@Composable
fun ProfileScreen(navController: NavController) {
    Scaffold(
        topBar = { TopBar() }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(horizontal = 20.dp)
        ) {
            Spacer(Modifier.weight(1f))
            Button(
                {},
                colors = ButtonDefaults.buttonColors(containerColor = Blue),
                shape = RoundedCornerShape(12.dp),
                contentPadding = PaddingValues(vertical = 16.dp),
                modifier = Modifier
                    .fillMaxWidth(),
            ) {
                Text("Switch to Dark", color = Color.White, fontSize = 20.sp, fontWeight = W500)
            }
            Space(height = 10.dp)
            Button(
                {},
                colors = ButtonDefaults.buttonColors(containerColor = Blue),
                shape = RoundedCornerShape(12.dp),
                contentPadding = PaddingValues(vertical = 16.dp),
                modifier = Modifier
                    .fillMaxWidth(),
            ) {
                Text(
                    "Change mother language",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = W500
                )
            }
            Space(height = 10.dp)
            Button(
                {},
                colors = ButtonDefaults.buttonColors(containerColor = Blue),
                shape = RoundedCornerShape(12.dp),
                contentPadding = PaddingValues(vertical = 16.dp),
                modifier = Modifier
                    .fillMaxWidth(),
            ) {
                Text("Change your image", color = Color.White, fontSize = 20.sp, fontWeight = W500)
            }
            Space(height = 10.dp)
            Button(
                {},
                colors = ButtonDefaults.buttonColors(containerColor = VeryLightGray),
                shape = RoundedCornerShape(12.dp),
                contentPadding = PaddingValues(vertical = 16.dp),
                modifier = Modifier
                    .fillMaxWidth(),
            ) {
                Text("Logout", color = Color.White, fontSize = 20.sp, fontWeight = W500)
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
                .background(Green, CircleShape)
                .padding(15.dp)
                .size(100.dp)
                .clip(CircleShape)
        )
        Space(height = 5.dp)
        Text(text = "Your profile, Emil", color = Color.White, fontSize = 22.sp, fontWeight = W500)
    }
}