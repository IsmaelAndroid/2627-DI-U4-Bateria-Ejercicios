# Ej15 · El parámetro modifier 🤖

**Apartado 4 · Propiedades y atributos** · ⏱️ 20 min

> 🎯 Todo componente debe aceptar `modifier: Modifier = Modifier`: así **quien lo usa** decide su tamaño, sus márgenes y su fondo, sin tocar el código del componente.

## Pasos

En `ui/Pantallas.kt` busca **`EJ15`**:

**PASO 1.** Añade a tu `Etiqueta` el parámetro `modifier: Modifier = Modifier` y pásaselo al `Text`.

**PASO 2.** En `ModifierScreen()`, usa la misma `Etiqueta` tres veces con modifiers distintos:
- con fondo amarillo y 8 dp de relleno;
- a todo el ancho con borde;
- con 32 dp de margen a la izquierda.
