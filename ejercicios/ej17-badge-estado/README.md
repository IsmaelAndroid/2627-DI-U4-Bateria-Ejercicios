# Ej17 · BadgeEstado 🤖

**Apartado 6 · Creación de un nuevo componente** · ⏱️ 30 min

> 🎯 El componente del tema: una píldora con un punto de color y un texto. Su color y su texto salen de un `enum` (como en el Ej05).

## Pasos

En `ui/Pantallas.kt` busca **`EJ17`**:

**PASO 1.** El `enum class Estado(val etiqueta: String, val acento: Color)` ya está creado.

**PASO 2.** Crea `@Composable fun BadgeEstado(estado: Estado, texto: String = estado.etiqueta, conPunto: Boolean = true, modifier: Modifier = Modifier)`: una `Row` con fondo `estado.acento.copy(alpha = 0.15f)`, esquinas redondeadas al 50 % y, dentro, un punto de 10 dp (si `conPunto`) y el texto en el color del estado.

**PASO 3.** En `BadgesScreen()`, muestra `BadgeEstado(Estado.OK)`, `BadgeEstado(Estado.ERROR, texto = "Caducado")` y `BadgeEstado(Estado.AVISO, conPunto = false)`.
