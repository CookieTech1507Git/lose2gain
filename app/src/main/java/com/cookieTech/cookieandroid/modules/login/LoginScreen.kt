package com.cookieTech.cookieandroid.modules.login

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Composable
fun LoginScreen(
    navController: NavController
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Login",
            color = Color.Blue,
            fontSize = MaterialTheme.typography.h3.fontSize,
            fontWeight = FontWeight.Bold,
            /*modifier = Modifier.clickable {
                navController.navigate(route = Screen.SignUp.route)
            }*/

        )
    }
}

@Composable
@Preview(showBackground = true)
fun PreviewLoginScreen() {
    LoginScreen(navController = rememberNavController())
}