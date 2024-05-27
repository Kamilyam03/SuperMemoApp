package com.example.supermemoapp

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.supermemoapp.ui.theme.UI.AddScreen
import com.example.supermemoapp.ui.theme.UI.HomeScreen

enum class SuperMemoScreen() {
    Home,
    Add
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SuperMemoApp(navController: NavHostController = rememberNavController()){
    Box(modifier = Modifier
        ){

        Scaffold(bottomBar = {
            BottomNavBar(navController)

        }) {innerPadding ->

            NavHost(
                navController = navController,
                startDestination = SuperMemoScreen.Home.name,
                modifier = Modifier.padding(innerPadding)
            ) {
                composable(route = SuperMemoScreen.Home.name) {
                    HomeScreen()
                }
                composable(route = SuperMemoScreen.Add.name){
                    AddScreen()
                }
            }
        }
    }
}

@Composable
fun BottomNavBar(navController: NavHostController = rememberNavController()){
    Row(modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center) {
        Button(onClick = { navController.navigate(SuperMemoScreen.Home.name) }) {
            Text(text = "Home", color = Color.Black)
        }
        Button(onClick = { navController.navigate(SuperMemoScreen.Add.name) }) {
            Text(text = "Add", color = Color.Black)
        }
    }
}

