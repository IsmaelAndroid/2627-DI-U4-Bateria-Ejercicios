# Ej22 · Un círculo con Canvas 🤖

**Apartado 9 · Dibujar sobre la interfaz: DrawScope** · ⏱️ 15 min

> 🎯 `Canvas` da un lienzo (`DrawScope`) donde se dibuja a mano indicando color, posición y tamaño.

## Pasos

En `ui/Pantallas.kt` busca **`EJ22`**:

**PASO 1.** En `CirculoScreen()`, crea un `Canvas(Modifier.size(200.dp))`.

**PASO 2.** Dentro, dibuja un círculo azul en el centro: `drawCircle(color = Color(0xFF3B82F6), radius = size.minDimension / 2)`.

**PASO 3.** Dibuja encima otro círculo blanco más pequeño (radio la mitad).
