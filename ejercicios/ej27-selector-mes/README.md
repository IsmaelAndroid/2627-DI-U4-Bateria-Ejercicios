# Ej27 · SelectorMes 🤖

**Apartados 6.3 y 11 · Un componente con evento y caso práctico 1** · ⏱️ 30 min

> 🎯 Lleva a Compose el Ej07: un botón que abre un menú con los 12 meses. El componente **solo guarda si el menú está abierto**; el mes elegido lo recibe y lo avisa con `onSeleccion`.

## Pasos

En `ui/Pantallas.kt` busca **`EJ27`**:

**PASO 1.** Crea `@Composable fun SelectorMes(mes: Int?, onSeleccion: (Int) -> Unit, modifier: Modifier = Modifier)`:
- un estado interno `abierto`;
- un `OutlinedButton` con el nombre del mes elegido o «Elige un mes» que abra el menú;
- un `DropdownMenu(expanded = abierto, onDismissRequest = { abierto = false })` con un `DropdownMenuItem` por mes que llame a `onSeleccion(numero)` y cierre el menú.

**PASO 2.** En `MesScreen()`, guarda el mes en un estado y muestra debajo «Abono recargado para Marzo» o «Elige el mes del abono».
