# Ej18 · Un botón contador sin estado 🤖

**Apartado 6.3 · Un componente con evento** · ⏱️ 20 min

> 🎯 El componente **no guarda** la cuenta: la recibe (`cuenta`) y avisa del clic (`onClick`). La pantalla es la dueña del estado.

## Pasos

En `ui/Pantallas.kt` busca **`EJ18`**:

**PASO 1.** Crea `@Composable fun BotonContador(cuenta: Int, onClick: () -> Unit, modifier: Modifier = Modifier)`: un `Button` con el texto «Pulsado N veces».

**PASO 2.** En `ContadorScreen()`, crea el estado `var cuenta by rememberSaveable { mutableIntStateOf(0) }` y usa el componente: `BotonContador(cuenta, onClick = { cuenta++ })`.

**PASO 3.** Pon **dos** `BotonContador` que compartan el mismo estado. ¿Qué pasa al pulsar uno?
