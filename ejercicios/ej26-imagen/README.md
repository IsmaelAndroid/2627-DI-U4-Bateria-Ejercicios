# Ej26 · Una imagen del paquete 🤖

**Apartado 10 · Imágenes en el componente** · ⏱️ 15 min

> 🎯 Una imagen incluida en la app (`res/drawable`) se carga con `painterResource(R.drawable.nombre)` y viaja dentro del paquete.

## Pasos

En `ui/Pantallas.kt` busca **`EJ26`**:

**PASO 1.** En `ImagenScreen()`, muestra el icono de la app: `Image(painterResource(R.drawable.ic_launcher_foreground), contentDescription = "Icono de la app")`.

**PASO 2.** Dale 120 dp, un fondo de color con esquinas redondeadas y muéstralo también a 48 dp.
