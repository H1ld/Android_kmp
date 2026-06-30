package com.amonteiro.a06_ynov_kmp

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.amonteiro.a06_ynov_kmp.di.apiModule
import com.amonteiro.a06_ynov_kmp.di.viewModelModule
import com.amonteiro.a06_ynov_kmp.presentation.ui.screens.SearchScreen
import com.amonteiro.a06_ynov_kmp.presentation.ui.theme.AppTheme
import org.koin.compose.KoinApplication

@Composable
@Preview
fun App() {
    KoinApplication(application = {
        modules(apiModule, viewModelModule)
    }) {

        AppTheme {
            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                println("coucou")

                SearchScreen(
                    modifier = Modifier.padding(innerPadding)
                )
            }
        }
    }
}