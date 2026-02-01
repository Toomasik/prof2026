package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.presentation.SignUp.SignUp
import com.example.myapplication.presentation.choose_language.ChooseLanguageScreen
import com.example.myapplication.presentation.login.LoginScreen
import com.example.myapplication.presentation.main.MainScreen
import com.example.myapplication.presentation.on_boarding.OnBoarding
import com.example.myapplication.presentation.profile.ProfileScreen
import com.example.myapplication.presentation.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            MyApplicationTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "onBoard") {
                    composable("onBoard") {
                        OnBoarding(navController)
                    }
                    composable("selectLanguage") {
                        ChooseLanguageScreen(navController)
                    }
                    composable("Login") {
                        LoginScreen(navController)
                    }
                    composable("SignUp") {
                        SignUp(navController)
                    }
                    composable("Main") {
                        MainScreen(navController)
                    }
                    composable("Profile") {
                        ProfileScreen(navController)
                    }
                }


            }
        }
    }
}