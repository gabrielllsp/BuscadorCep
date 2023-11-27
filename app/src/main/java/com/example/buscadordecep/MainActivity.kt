package com.example.buscadordecep

import BuscadorDeCepTheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.buscadordecep.view.BuscarCep
import com.example.buscadordecep.viewmodel.BuscarCepViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BuscadorDeCepTheme {

                val navController: NavHostController = rememberNavController()
                val viewModel: BuscarCepViewModel = hiltViewModel()

                NavHost(
                    navController = navController,
                    startDestination = "buscarCep"
                ){
                    composable("buscarCep"){
                        BuscarCep(navController, viewModel)
                    }
                }

            }
        }
    }
}

