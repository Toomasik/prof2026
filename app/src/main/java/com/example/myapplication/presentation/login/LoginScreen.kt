package com.example.myapplication.presentation.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.W500
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
import androidx.navigation.NavController
import com.example.myapplication.presentation.reusable.InputComponent
import com.example.myapplication.presentation.reusable.Space
import com.example.myapplication.presentation.ui.theme.Blue
import com.example.myapplication.presentation.ui.theme.Dark
import com.example.myapplication.presentation.ui.theme.DeepBlue
import com.example.myapplication.presentation.ui.theme.GrayDark
import com.example.myapplication.presentation.ui.theme.Red

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "Login",
                        color = Color.White,
                        fontSize = 17.sp,
                        fontWeight = W500,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                },
                navigationIcon = {
                    IconButton({ navController.popBackStack() }) {
                        Icon(
                            Icons.AutoMirrored.Filled.KeyboardArrowLeft,
                            contentDescription = "Back",
                            tint = Color.White,
                        )
                    }
                },
                modifier = Modifier
                    .background(DeepBlue),
                colors = TopAppBarDefaults.topAppBarColors(containerColor = DeepBlue)
            )
        }
    ) { innerPadding ->
        Column(
            Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(horizontal = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Space(height = 24.dp)
            Image(
                painterResource(R.drawable.login_decoration),
                null,
                modifier = Modifier.height(80.dp),
                contentScale = ContentScale.FillHeight
            )
            Text(
                text = "For free, join now and start learning",
                color = Dark,
                fontSize = 22.sp,
                fontWeight = W500,
                textAlign = TextAlign.Center,
                modifier = Modifier.width(263.dp)
            )
            Space(height = 32.dp)
            InputComponent("Email addres", "Email", false)
            Space(height = 24.dp)
            InputComponent("Password", "Password", true)
            Space(height = 12.dp)
            Text(
                text = "Forgot Password ",
                color = Red,
                fontSize = 15.sp,
                fontWeight = W500,
                modifier = Modifier.fillMaxWidth()
            )
            Space(height = 32.dp)
            Button(
                {},
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Blue, RoundedCornerShape(12.dp)),
            ) {
                Text("Login", color = Color.White, fontSize = 20.sp, fontWeight = W500)
            }
            Space(height = 32.dp)
            Row() {
                Text("Not you member? ", color = GrayDark, fontSize = 17.sp, fontWeight = W500)
                TextButton({navController.navigate("SignUp")}, contentPadding = PaddingValues(0.dp)) {
                    Text("Signup", color = Blue, fontSize = 17.sp, fontWeight = W500)
                }
            }
        }
    }
}