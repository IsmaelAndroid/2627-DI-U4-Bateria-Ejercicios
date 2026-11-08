# Ej25 · Iconos de Material 🤖

**Apartado 10 · Imágenes en el componente** · ⏱️ 15 min

> 🎯 Material trae iconos vectoriales listos para usar (`Icons.Default.Star`…). Son `ImageVector`, así que escalan sin pixelarse.

## Pasos

En `ui/Pantallas.kt` busca **`EJ25`**:

**PASO 1.** En `IconosScreen()`, una `Row` con tres iconos: `Icon(Icons.Default.Home, contentDescription = "Inicio")`, `Icons.Default.Favorite` y `Icons.Default.Star`.

**PASO 2.** Pinta la estrella a 64 dp y en el color primario: `Modifier.size(64.dp)` y `tint = MaterialTheme.colorScheme.primary`.

**PASO 3.** Pon a cada icono su `contentDescription`: es lo que lee el lector de pantalla.
