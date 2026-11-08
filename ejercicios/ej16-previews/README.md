# Ej16 · Dos vistas previas 🤖

**Apartado 7 · Herramientas para diseñar y probar** · ⏱️ 20 min

> 🎯 Con `@Preview` ves el componente **sin lanzar el emulador**, y con sus parámetros lo ves en distintas situaciones, por ejemplo en modo claro y oscuro.

## Pasos

En `ui/Pantallas.kt` busca **`EJ16`**:

**PASO 1.** Crea una función con `@Preview(name = "Claro", showBackground = true)` que muestre tu `Etiqueta` dentro de `TemaDI(oscuro = false) { ... }`.

**PASO 2.** Crea otra con `@Preview(name = "Oscuro", showBackground = true, backgroundColor = 0xFF000000)` que use `TemaDI(oscuro = true)`.

**PASO 3.** Abre la vista **Split** y comprueba que ves las dos a la vez. En `PreviewsScreen()` muestra la etiqueta normal.
