# Ej09 · Variantes con data class y copy 🟣

**Apartado 4 · Propiedades y atributos** · ⏱️ 15 min

> 🎯 Con una `data class` inmutable, una variante se crea con `copy`, cambiando solo lo que interesa. El original no se toca.

## Pasos

Completa [`Estilo.kt`](Estilo.kt) y ejecútalo:

```bash
./ejecutar.sh ejercicios/ej09-copy/Estilo.kt
```

## ✅ Comprueba

```text
EstiloBoton(texto=Guardar, color=azul, habilitado=true)
EstiloBoton(texto=Borrar, color=rojo, habilitado=true)
EstiloBoton(texto=Guardar, color=azul, habilitado=false)
normal == apagado: false
```
