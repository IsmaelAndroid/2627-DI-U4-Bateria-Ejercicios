# Ej28 · Todos los estados con @PreviewParameter 🤖

**Apartado 7 · Herramientas para diseñar y probar** · ⏱️ 20 min

> 🎯 `@PreviewParameter` genera **una vista previa por cada valor** de una lista, sin escribir una `@Preview` para cada uno.

## Pasos

En `ui/Pantallas.kt` busca **`EJ28`**:

**PASO 1.** Crea el proveedor:

```kotlin
class ProveedorEstado : PreviewParameterProvider<Estado> {
    override val values = Estado.entries.asSequence()
}
```

**PASO 2.** Crea la vista previa:

```kotlin
@Preview(showBackground = true)
@Composable
fun BadgePreview(@PreviewParameter(ProveedorEstado::class) estado: Estado) {
    BadgeEstado(estado)
}
```

**PASO 3.** En `EstadosScreen()`, pinta un `BadgeEstado` por cada `Estado.entries`.
