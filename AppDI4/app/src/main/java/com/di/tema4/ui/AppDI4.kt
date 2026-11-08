package com.di.tema4.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Surface
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.di.tema4.R
import com.di.tema4.ui.theme.TemaDI

// El composable raíz: una pestaña por ejercicio de Android (Ej13-Ej30).
@Composable
fun AppDI4() {
    val pestanas = listOf(
        "Saludo", "Etiqueta", "Modifier", "Previews", "Badges", "Contador", "Interruptor", "Tarjeta", "Lista",
        "Círculo", "Figuras", "Triángulo", "Iconos", "Imagen", "Mes", "Estados", "Avatar", "Resumen",
    )
    var seleccionada by rememberSaveable { mutableIntStateOf(0) }

    TemaDI {
        Surface(Modifier.fillMaxSize()) {
            Column(Modifier.safeDrawingPadding()) {
                Text(
                    stringResource(R.string.titulo_app),
                    Modifier.padding(16.dp),
                    style = MaterialTheme.typography.titleLarge,
                )
                ScrollableTabRow(selectedTabIndex = seleccionada) {
                    pestanas.forEachIndexed { i, titulo ->
                        Tab(selected = i == seleccionada, onClick = { seleccionada = i }, text = { Text(titulo) })
                    }
                }
                when (pestanas[seleccionada]) {
                    "Saludo" -> SaludoScreen()
                    "Etiqueta" -> EtiquetaScreen()
                    "Modifier" -> ModifierScreen()
                    "Previews" -> PreviewsScreen()
                    "Badges" -> BadgesScreen()
                    "Contador" -> ContadorScreen()
                    "Interruptor" -> InterruptorScreen()
                    "Tarjeta" -> TarjetaScreen()
                    "Lista" -> ListaScreen()
                    "Círculo" -> CirculoScreen()
                    "Figuras" -> FigurasScreen()
                    "Triángulo" -> TrianguloScreen()
                    "Iconos" -> IconosScreen()
                    "Imagen" -> ImagenScreen()
                    "Mes" -> MesScreen()
                    "Estados" -> EstadosScreen()
                    "Avatar" -> AvatarScreen()
                    "Resumen" -> ResumenScreen()
                }
            }
        }
    }
}
