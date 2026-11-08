# Ej21 · Reutilizar el componente 🤖

**Apartado 2 · Desarrollo de software en componentes** · ⏱️ 15 min

> 🎯 La ventaja de un componente es **reutilizarlo**: con una lista de datos y un bucle, la misma `Tarjeta` pinta muchas fichas distintas.

## Pasos

En `ui/Pantallas.kt` busca **`EJ21`**:

**PASO 1.** En `ListaScreen()`, crea la lista `listOf("Lengua" to "Lunes", "Inglés" to "Martes", "DI" to "Miércoles")`.

**PASO 2.** Recórrela y pinta una `Tarjeta(asignatura) { Text("Examen el $dia") }` por elemento, separadas 8 dp.
