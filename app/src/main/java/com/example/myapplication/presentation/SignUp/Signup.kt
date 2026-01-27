package com.example.myapplication.presentation.SignUp

import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxColors
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight.Companion.W500
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.presentation.reusable.InputComponent
import com.example.myapplication.presentation.reusable.Space
import com.example.myapplication.presentation.ui.theme.Blue
import com.example.myapplication.presentation.ui.theme.Dark
import com.example.myapplication.presentation.ui.theme.DeepBlue
import com.example.myapplication.presentation.ui.theme.GrayDark

@Composable
fun SignUp(navController: NavController) {
    val signUpNavHost = rememberNavController()
    NavHost(signUpNavHost, startDestination = "part1") {
        composable("part1") {
            SignUppart1(navController, signUpNavHost)
        }
        composable("part2") {
            SignUppart2(navController, signUpNavHost)
        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUppart1(mainNavController: NavController, signUpNavController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "Signup",
                        color = Color.White,
                        fontSize = 17.sp,
                        fontWeight = W500,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                },
                navigationIcon = {
                    IconButton({ mainNavController.popBackStack() }) {
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
            Text(
                text = "Create an Account",
                color = Dark,
                fontSize = 22.sp,
                fontWeight = W500,
                textAlign = TextAlign.Center,
                modifier = Modifier.width(263.dp)
            )
            Space(height = 32.dp)
            InputComponent("First Name", "Your First Name", false)
            Space(height = 24.dp)
            InputComponent("Last Name", "Your Last Name", false)
            Space(height = 24.dp)
            InputComponent("Email", "Email Address", false)
            Space(height = 32.dp)
            Button(
                { signUpNavController.navigate("part2") },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Blue, RoundedCornerShape(12.dp)),
            ) {
                Text("Continue", color = Color.White, fontSize = 20.sp, fontWeight = W500)
            }
            Space(height = 32.dp)
            Row() {
                Text("Already you member? ", color = GrayDark, fontSize = 17.sp, fontWeight = W500)
                TextButton(
                    { mainNavController.navigate("Login") },
                    contentPadding = PaddingValues(0.dp)
                ) {
                    Text("Login", color = Blue, fontSize = 17.sp, fontWeight = W500)
                }
            }
        }
    }

}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)
@Composable
fun SignUppart2(mainNavController: NavController, signUpNavController: NavController) {
    var isChecked by remember { mutableStateOf(false) }
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "Signup",
                        color = Color.White,
                        fontSize = 17.sp,
                        fontWeight = W500,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                },
                navigationIcon = {
                    IconButton({ signUpNavController.popBackStack() }) {
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
            Text(
                text = "Choose a Password",
                color = Dark,
                fontSize = 22.sp,
                fontWeight = W500,
                textAlign = TextAlign.Center,
                modifier = Modifier.width(263.dp)
            )
            Space(height = 32.dp)
            InputComponent("Password", "Password", true)
            Space(height = 24.dp)
            InputComponent("Confirm Password", "Confirm Password", true)
            Space(height = 24.dp)
            FlowRow(Modifier.fillMaxWidth()) {
                Checkbox(
                    isChecked,
                    { isChecked = !isChecked },
                    colors = CheckboxDefaults.colors(checkedColor = Blue, uncheckedColor = Blue)
                )
                Text("I ", color = GrayDark, fontSize = 17.sp)
                Text(
                    "have made myself acquainted with the Rules",
                    color = DeepBlue,
                    fontSize = 17.sp
                )
                Text("_and accept all its provisions,", color = GrayDark, fontSize = 17.sp)
            }
            Space(height = 75.dp)
            Button(
                { signUpNavController.navigate("part1") },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Blue, RoundedCornerShape(12.dp)),
            ) {
                Text("SignUp", color = Color.White, fontSize = 20.sp, fontWeight = W500)
            }
            Space(height = 32.dp)
            Row() {
                Text("Already you member? ", color = GrayDark, fontSize = 17.sp, fontWeight = W500)
                TextButton(
                    { mainNavController.navigate("Login") },
                    contentPadding = PaddingValues(0.dp)
                ) {
                    Text("Login", color = Blue, fontSize = 17.sp, fontWeight = W500)
                }
            }
        }
    }

}

