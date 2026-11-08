# Ej24 · Un triángulo con Path 🤖

**Apartados 9 y 14 · DrawScope y caso práctico 2** · ⏱️ 20 min

> 🎯 Las formas libres se construyen con un `Path`: se mueve el lápiz (`moveTo`), se trazan líneas (`lineTo`) y se cierra (`close`).

## Pasos

En `ui/Pantallas.kt` busca **`EJ24`**:

**PASO 1.** En `TrianguloScreen()`, crea un `Canvas(Modifier.size(220.dp))`.

**PASO 2.** Construye el triángulo:

```kotlin
val triangulo = Path().apply {
    moveTo(size.width / 2, 0f)
    lineTo(size.width, size.height)
    lineTo(0f, size.height)
    close()
}
```

**PASO 3.** Píntalo naranja con `drawPath(triangulo, color = Color(0xFFEF6C00))`.
