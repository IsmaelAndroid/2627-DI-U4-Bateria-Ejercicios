# Ej29 · Un avatar con valor calculado 🤖

**Apartado 4 · Propiedades y atributos** · ⏱️ 20 min

> 🎯 Un valor por defecto puede **calcularse a partir de otro parámetro**: las iniciales del avatar salen del nombre (como en el Ej10), pero quien lo usa las puede cambiar.

## Pasos

En `ui/Pantallas.kt` busca **`EJ29`**:

**PASO 1.** Copia la función `iniciales(nombre)` del Ej10 y llámala `calcularIniciales` (el parámetro del avatar ya se llama `iniciales`).

**PASO 2.** Crea `@Composable fun Avatar(nombre: String, iniciales: String = calcularIniciales(nombre), color: Color = Color(0xFF3B82F6), modifier: Modifier = Modifier)`: un círculo de 56 dp del color con las iniciales en blanco.

**PASO 3.** En `AvatarScreen()`, muestra `Avatar("Ana Ruiz")`, `Avatar("Luis Pérez", color = Color(0xFF10B981))` y `Avatar("Profesor", iniciales = "👨‍🏫")`.
