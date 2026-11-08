package com.di.tema4.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.di.tema4.ui.componentes.Pendiente

// Cada pestaña de la app. Los ejercicios te piden SUSTITUIR el Pendiente(...) por la pantalla de verdad.
// Los componentes que crees (Saludo, Etiqueta, BadgeEstado...) escríbelos aquí o en ui/componentes/.

// EJ17 · El enum del BadgeEstado (ya está hecho)
enum class Estado(val etiqueta: String, val acento: Color) {
    OK("Completado", Color(0xFF1B5E20)),
    AVISO("Revisa", Color(0xFFB26A00)),
    ERROR("Fallido", Color(0xFFB00020)),
}

// EJ13 · Tu primer componente: Saludo
@Composable
fun SaludoScreen() = Pendiente(13, "Saludo")

// EJ14 · Etiqueta con valores por defecto
@Composable
fun EtiquetaScreen() = Pendiente(14, "Etiqueta")

// EJ15 · El parámetro modifier
@Composable
fun ModifierScreen() = Pendiente(15, "El parámetro modifier")

// EJ16 · Dos vistas previas (crea aquí las dos @Preview)
@Composable
fun PreviewsScreen() = Pendiente(16, "Dos vistas previas")

// EJ17 · BadgeEstado
@Composable
fun BadgesScreen() = Pendiente(17, "BadgeEstado")

// EJ18 · Un botón contador sin estado
@Composable
fun ContadorScreen() = Pendiente(18, "Botón contador")

// EJ19 · Un interruptor reutilizable
@Composable
fun InterruptorScreen() = Pendiente(19, "Interruptor")

// EJ20 · Una tarjeta con hueco para contenido
@Composable
fun TarjetaScreen() = Pendiente(20, "Tarjeta con contenido")

// EJ21 · Reutilizar el componente
@Composable
fun ListaScreen() = Pendiente(21, "Lista de tarjetas")

// EJ22 · Un círculo con Canvas
@Composable
fun CirculoScreen() = Pendiente(22, "Círculo")

// EJ23 · Rectángulo y óvalo
@Composable
fun FigurasScreen() = Pendiente(23, "Rectángulo y óvalo")

// EJ24 · Un triángulo con Path
@Composable
fun TrianguloScreen() = Pendiente(24, "Triángulo")

// EJ25 · Iconos de Material
@Composable
fun IconosScreen() = Pendiente(25, "Iconos")

// EJ26 · Una imagen del paquete
@Composable
fun ImagenScreen() = Pendiente(26, "Imagen")

// EJ27 · SelectorMes
@Composable
fun MesScreen() = Pendiente(27, "SelectorMes")

// EJ28 · Todos los estados con @PreviewParameter
@Composable
fun EstadosScreen() = Pendiente(28, "Todos los estados")

// EJ29 · Un avatar con valor calculado
@Composable
fun AvatarScreen() = Pendiente(29, "Avatar")

// EJ30 · Una pantalla hecha de tus componentes
@Composable
fun ResumenScreen() = Pendiente(30, "Pantalla de componentes")
