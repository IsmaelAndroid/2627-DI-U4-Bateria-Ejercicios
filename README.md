# 🎨 Batería de ejercicios · Tema 4 · Desarrollo de Interfaces

**Desarrollo de Interfaces · 2º DAM** · IES Rafael Alberti · Curso 2026-27

> 🎯 **Para qué sirve:** son **30 ejercicios sencillos para aprender y repasar** el tema 4, *Creación de componentes propios*. **No cuentan para nota.** Son tu entrenamiento para las prácticas y el examen.
>
> 📚 **Teoría:** [revilofe · DI · U4.1 Creación de componentes visuales](https://revilofe.github.io/section6/u04/teoria/DI-U4.1.-CreacionDeComponentes/).

Hay **tres tipos** de ejercicios:

| Tipo | Qué es | Dónde se hace |
|---|---|---|
| 🟣 **Kotlin** | Un programa de consola (`fun main()`) en un único `.kt`, con los pasos comentados (`// PASO 1`…) | Codespaces, Android Studio o [play.kotlinlang.org](https://play.kotlinlang.org) |
| 🤖 **Android** | Una pestaña de la app **[AppDI4](AppDI4)**: busca los comentarios `// EJ13`… en `ui/Pantallas.kt` | **Android Studio** |
| 📝 **Análisis** | Preguntas para contestar con tus palabras | El fichero `RESPUESTAS.md` del ejercicio |

Cada ejercicio tiene su carpeta en `ejercicios/` con un **`README.md`** paso a paso y la salida o el resultado que debes obtener. Son ejercicios **cortos**: cada uno trabaja una sola idea.

> 🖼️ **AppDI4** tiene una **pestaña por ejercicio de Android**. Al principio cada pestaña solo dice «Ejercicio NN: pendiente»: tú la vas construyendo. Los componentes que crees en un ejercicio los reutilizas en los siguientes.

---

## 🚀 Cómo empezar

### Paso 1 · Haz tu copia (solo la primera vez)

1. Entra en GitHub con **tu cuenta**.
2. Arriba a la derecha pulsa **`Use this template` → `Create a new repository`**.
3. Deja **tu usuario** como *Owner*, llámalo `DI-U4-Bateria-Ejercicios` y pulsa **`Create repository`**.

Trabaja **siempre en tu copia**.

### Paso 2 · Ábrela

- **🤖 Android:** en Android Studio, **File → New → Project from Version Control** con la URL de tu copia; después **File → Open → `AppDI4`**. Espera al *Gradle sync*.
- **🟣 Kotlin**, elige una opción:
  - **Codespaces**: en tu copia, **`<> Code` → `Codespaces` → `Create codespace on main`** (trae Java y `kotlinc`) y ejecuta:
    ```bash
    ./ejecutar.sh ejercicios/ej03-valores-por-defecto/Etiqueta.kt
    ```
  - **Android Studio**: **File → New → Scratch File → Kotlin**, pega el código y pulsa ▶️.
  - **Navegador**: [play.kotlinlang.org](https://play.kotlinlang.org).

---

## 📌 La regla de los commits

- **Un commit al terminar cada ejercicio**: `Ej17: BadgeEstado`.
- **`git push` al final de cada clase** (en Android Studio: `Ctrl + K` y `Ctrl + Mayús + K`).

---

## 🗺️ Índice de ejercicios

| Nº | Ejercicio | Tipo | Apartado |
|---|---|---|---|
| **Ideas** | **Qué es un componente** | | |
| 01 | [¿Componente o copiar y pegar?](ejercicios/ej01-componente-o-copiar) | 📝 Análisis | 1 |
| 02 | [Las ventajas de los componentes](ejercicios/ej02-ventajas) | 📝 Análisis | 2 |
| **Kotlin** | **Las piezas de un componente** | | |
| 03 | [Propiedades con valor por defecto](ejercicios/ej03-valores-por-defecto) | 🟣 Kotlin | 4 |
| 04 | [Argumentos con nombre](ejercicios/ej04-argumentos-con-nombre) | 🟣 Kotlin | 4 |
| 05 | [Un enum con propiedades](ejercicios/ej05-enum-con-propiedades) | 🟣 Kotlin | 6.1 |
| 06 | [Un componente sin estado](ejercicios/ej06-sin-estado) | 🟣 Kotlin | 6.2 |
| 07 | [Un componente que avisa con un evento](ejercicios/ej07-evento) | 🟣 Kotlin | 6.3 |
| 08 | [El estado vive arriba](ejercicios/ej08-estado-arriba) | 🟣 Kotlin | 6.3 |
| 09 | [Variantes con data class y copy](ejercicios/ej09-copy) | 🟣 Kotlin | 4 |
| 10 | [Probar y documentar](ejercicios/ej10-probar-y-documentar) | 🟣 Kotlin | 12-13 |
| 11 | [Dibujar con coordenadas](ejercicios/ej11-dibujar-con-coordenadas) | 🟣 Kotlin | 9 |
| 12 | [Empaquetar: api, implementation y .aar](ejercicios/ej12-empaquetar) | 📝 Análisis | 8 |
| **Compose** | **Tus primeros componentes** | | |
| 13 | [Tu primer componente: Saludo](ejercicios/ej13-saludo) | 🤖 Android | 3 |
| 14 | [Etiqueta con valores por defecto](ejercicios/ej14-etiqueta) | 🤖 Android | 4 |
| 15 | [El parámetro modifier](ejercicios/ej15-modifier) | 🤖 Android | 4 |
| 16 | [Dos vistas previas](ejercicios/ej16-previews) | 🤖 Android | 7 |
| 17 | [BadgeEstado](ejercicios/ej17-badge-estado) | 🤖 Android | 6 |
| 18 | [Un botón contador sin estado](ejercicios/ej18-boton-contador) | 🤖 Android | 6.3 |
| 19 | [Un interruptor reutilizable](ejercicios/ej19-interruptor) | 🤖 Android | 6.3 |
| 20 | [Una tarjeta con hueco para contenido](ejercicios/ej20-tarjeta-con-contenido) | 🤖 Android | 3 |
| 21 | [Reutilizar el componente](ejercicios/ej21-reutilizar) | 🤖 Android | 2 |
| **Dibujo e imágenes** | | | |
| 22 | [Un círculo con Canvas](ejercicios/ej22-circulo) | 🤖 Android | 9 |
| 23 | [Rectángulo y óvalo](ejercicios/ej23-rectangulo-y-ovalo) | 🤖 Android | 9 y 14 |
| 24 | [Un triángulo con Path](ejercicios/ej24-triangulo) | 🤖 Android | 9 y 14 |
| 25 | [Iconos de Material](ejercicios/ej25-iconos) | 🤖 Android | 10 |
| 26 | [Una imagen del paquete](ejercicios/ej26-imagen) | 🤖 Android | 10 |
| **Componentes completos** | | | |
| 27 | [SelectorMes](ejercicios/ej27-selector-mes) | 🤖 Android | 6.3 y 11 |
| 28 | [Todos los estados con @PreviewParameter](ejercicios/ej28-preview-parameter) | 🤖 Android | 7 |
| 29 | [Un avatar con valor calculado](ejercicios/ej29-avatar) | 🤖 Android | 4 |
| 30 | [Una pantalla hecha de tus componentes](ejercicios/ej30-pantalla-de-componentes) | 🤖 Android | 11 |

---

## 🆘 Si te atascas

1. Vuelve a leer el paso: la pista suele estar en el comentario.
2. Si algo sale en **rojo** en Android Studio, pon el cursor encima y pulsa **`Alt + Intro`** (suele faltar un `import`).
3. Lee el error entero en la pestaña **Build**.
4. Pregunta a tu compañero o compañera y, después, al profesor.
