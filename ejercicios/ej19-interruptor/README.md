# Ej19 · Un interruptor reutilizable 🤖

**Apartado 6.3 · Un componente con evento** · ⏱️ 20 min

> 🎯 Lleva a Compose el Ej08: un interruptor con texto que recibe `activo` y avisa con `onCambio`. Al no tener estado propio, sirve para cualquier ajuste.

## Pasos

En `ui/Pantallas.kt` busca **`EJ19`**:

**PASO 1.** Crea `@Composable fun Interruptor(texto: String, activo: Boolean, onCambio: (Boolean) -> Unit, modifier: Modifier = Modifier)`: una `Row` de todo el ancho con el texto a la izquierda y un `Switch(checked = activo, onCheckedChange = onCambio)` a la derecha.

**PASO 2.** En `InterruptorScreen()`, usa el mismo componente para tres ajustes: «Wi-Fi», «Bluetooth» y «Modo avión», cada uno con su estado.
