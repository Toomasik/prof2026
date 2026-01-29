package com.example.myapplication.presentation.reusable

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
import com.example.myapplication.presentation.ui.theme.DarkGray
import com.example.myapplication.presentation.ui.theme.GrayDark
import com.example.myapplication.presentation.ui.theme.LightGray
import com.example.myapplication.presentation.ui.theme.VeryLightGray

@Composable
fun InputComponent(
    title: String,
    placeholder: String,
    isPassword: Boolean,
    value: String,
    onValueChanged: (String) -> Unit
) {
    var isHided by remember { mutableStateOf(true) }
    Text(title, fontSize = 15.sp, color = DarkGray, modifier = Modifier.fillMaxWidth())
    Space(height = 8.dp)
    OutlinedTextField(
        value,
        onValueChanged,
        placeholder = {
            Text(placeholder, fontSize = 15.sp, color = GrayDark)
        },
        visualTransformation = if (isPassword && isHided) {
            PasswordVisualTransformation()
        } else {
            VisualTransformation.None
        },
        keyboardOptions = if (isPassword) KeyboardOptions(keyboardType = KeyboardType.Password) else KeyboardOptions.Default,
        colors = OutlinedTextFieldDefaults.colors(
            focusedContainerColor = VeryLightGray,
            unfocusedContainerColor = VeryLightGray,
            focusedBorderColor = Color.Transparent,
            unfocusedBorderColor = Color.Transparent,
        ),
        trailingIcon = {
            if (isPassword) {
                IconButton(
                    {
                        isHided = !isHided
                    }
                ) {
                    Icon(painterResource(R.drawable.eye), contentDescription = null)
                }

            }
        },
        modifier = Modifier.fillMaxWidth()
    )
}
