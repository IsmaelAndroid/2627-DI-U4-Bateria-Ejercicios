# Ej14 · Etiqueta con valores por defecto 🤖

**Apartado 4 · Propiedades y atributos** · ⏱️ 20 min

> 🎯 Lleva a Compose el Ej03: las propiedades del componente son parámetros con **valor por defecto**.

## Pasos

En `ui/Pantallas.kt` busca **`EJ14`**:

**PASO 1.** Crea `@Composable fun Etiqueta(texto: String, color: Color = Color.Unspecified, tamano: TextUnit = 16.sp)` que muestre un `Text` con ese color y tamaño.

**PASO 2.** En `EtiquetaScreen()`, muestra: `Etiqueta("Hola")`, `Etiqueta("Aviso", color = Color.Red)` y `Etiqueta("Título", tamano = 28.sp)`.
