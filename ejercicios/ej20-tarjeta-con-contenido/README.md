# Ej20 · Una tarjeta con hueco para contenido 🤖

**Apartado 3 · Concepto de componente** · ⏱️ 20 min

> 🎯 Un componente puede tener un **hueco** donde quien lo usa mete lo que quiera: un parámetro `contenido: @Composable () -> Unit`. Así funcionan `Card`, `Button` o `Scaffold`.

## Pasos

En `ui/Pantallas.kt` busca **`EJ20`**:

**PASO 1.** Crea `@Composable fun Tarjeta(titulo: String, modifier: Modifier = Modifier, contenido: @Composable () -> Unit)`: una `Card` de todo el ancho con el título en negrita y, debajo, `contenido()`.

**PASO 2.** En `TarjetaScreen()`, usa la tarjeta con un texto dentro y otra con un botón dentro:

```kotlin
Tarjeta("Aviso") { Text("Mañana no hay clase") }
```
