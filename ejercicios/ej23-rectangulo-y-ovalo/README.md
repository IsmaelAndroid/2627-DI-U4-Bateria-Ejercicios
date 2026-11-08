# Ej23 · Rectángulo y óvalo 🤖

**Apartados 9 y 14 · DrawScope y caso práctico 2** · ⏱️ 20 min

> 🎯 Las figuras se colocan con **coordenadas** (`topLeft = Offset(x, y)`) y **tamaño** (`size = Size(ancho, alto)`), como en el Ej11.

## Pasos

En `ui/Pantallas.kt` busca **`EJ23`**:

**PASO 1.** En `FigurasScreen()`, crea un `Canvas(Modifier.fillMaxWidth().height(200.dp))`.

**PASO 2.** Dibuja un óvalo verde en (150, 70) de 50 × 70: `drawOval(color = Color(0xFF2E7D32), topLeft = Offset(150f, 70f), size = Size(50f, 70f))`.

**PASO 3.** Dibuja un rectángulo amarillo del mismo tamaño 200 píxeles a la derecha con `drawRect`.
