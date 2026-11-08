# Ej13 · Tu primer componente: Saludo 🤖

**Apartado 3 · Concepto de componente** · ⏱️ 15 min

> 🎯 En Compose, un componente **es una función `@Composable`** que recibe datos por parámetros.

## Pasos

En `ui/Pantallas.kt` busca **`EJ13`**:

**PASO 1.** Crea `@Composable fun Saludo(nombre: String)` que muestre `Text("Hola, $nombre")` con estilo `headlineSmall`.

**PASO 2.** En `SaludoScreen()`, usa el componente dos veces dentro de una `Column`: `Saludo("Ana")` y `Saludo("Luis")`.
