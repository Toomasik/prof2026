package com.example.myapplication.presentation.choose_language

import android.R
import android.widget.Button
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight.Companion.W500
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.presentation.reusable.Space
import com.example.myapplication.presentation.ui.theme.Dark
import com.example.myapplication.presentation.ui.theme.DeepBlue
import com.example.myapplication.presentation.ui.theme.LightOrange
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.IconButton
import androidx.navigation.NavController
import com.example.myapplication.presentation.ui.theme.Blue
import com.example.myapplication.presentation.ui.theme.LightGray
import com.example.myapplication.presentation.ui.theme.Orange

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChooseLanguageScreen(navController: NavController) {
    val currentLanguage = remember { mutableStateOf(0) }
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "Language select",
                        color = Color.White,
                        fontWeight = W500,
                        fontSize = 17.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                },
                colors = TopAppBarColors(
                    containerColor = DeepBlue,
                    scrolledContainerColor = Color.Unspecified,
                    navigationIconContentColor = Color.Unspecified,
                    titleContentColor = Color.Unspecified,
                    actionIconContentColor = Color.Unspecified
                ),

                )
        }
    ) { innerPadding ->
        innerPadding
        Column(modifier = Modifier.fillMaxSize().padding(horizontal = 20.dp, vertical = 15.dp)) {
            Space(height = 120.dp)
            Text(
                "What is your Mother language?",
                color = Dark, fontWeight = W500, fontSize = 22.sp
            )
            Space(height = 12.dp)

            val languages = listOf(
                "Russian",
                "English",
                "Chinese",
                "Belarus",
                "Kazakh",
            )

            Column(verticalArrangement = Arrangement.spacedBy(12.dp)){
                languages.forEachIndexed { index, string ->
                    ButtonLanguage(
                        string,
                        if (currentLanguage.value == index) Orange else LightOrange,
                        state = currentLanguage,
                        index
                    )
                }
            }
            Spacer(modifier = Modifier.weight(1f))
            Button(
                {navController.navigate("Login")},
                colors = ButtonDefaults.buttonColors(containerColor = Blue),
                shape = RoundedCornerShape(50),
                modifier = Modifier
                    .fillMaxWidth(),
            ) {
                Text("Choose", color = Color.White, fontSize = 20.sp, fontWeight = W500)
            }

        }
    }

}

@Composable
fun ButtonLanguage(
    language: String,
    color: Color = LightOrange,
    state: MutableState<Int>,
    buttonIndex: Int
) {
    Button(
        onClick = { state.value = buttonIndex },
        colors = ButtonDefaults.buttonColors(containerColor = color),
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(20.dp)
    ) {
        Text(language, color = Dark, fontWeight = W500, fontSize = 22.sp)
    }
}