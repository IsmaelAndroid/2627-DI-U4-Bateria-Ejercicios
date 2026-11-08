package com.di.tema4.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

// El tema de la app: todas las pantallas toman sus colores y tipografía de aquí.
// En Android 12+ usa el COLOR DINÁMICO (la paleta sale del fondo de pantalla del usuario).
@Composable
fun TemaDI(
    oscuro: Boolean = isSystemInDarkTheme(),
    dinamico: Boolean = true,
    content: @Composable () -> Unit,
) {
    val esquema = when {
        dinamico && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val contexto = LocalContext.current
            if (oscuro) dynamicDarkColorScheme(contexto) else dynamicLightColorScheme(contexto)
        }
        oscuro -> darkColorScheme()
        else -> lightColorScheme()
    }
    MaterialTheme(colorScheme = esquema, content = content)
}
