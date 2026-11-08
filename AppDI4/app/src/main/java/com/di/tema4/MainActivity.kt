package com.di.tema4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.di.tema4.ui.AppDI4

// CAPA 1 · LA ACTIVIDAD (el "edificio"): no dibuja nada, solo aloja la interfaz.
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {      // ← el PUENTE entre la actividad y Compose
            AppDI4()      // ← CAPA 2 · el composable raíz (la "decoración")
        }
    }
}
