// Ej06 · Un componente sin estado

enum class Estado(val etiqueta: String, val color: String) {
    OK("Completado", "verde"),
    AVISO("Revisa", "ámbar"),
    ERROR("Fallido", "rojo"),
}

// PASO 1: el texto por defecto es la etiqueta del estado (texto: String = estado.etiqueta)
//         y el punto se pinta por defecto (conPunto: Boolean = true).
// PASO 2: devuelve "● " (solo si conPunto) + texto + " (color)".
fun badge(estado: Estado, texto: String, conPunto: Boolean): String = texto

fun main() {
    // PASO 3: cuando tengas los valores por defecto, deja las llamadas así:
    //   badge(Estado.OK), badge(Estado.ERROR, texto = "Caducado"), badge(Estado.AVISO, conPunto = false)
    println(badge(Estado.OK, "Completado", true))
    println(badge(Estado.ERROR, "Caducado", true))
    println(badge(Estado.AVISO, "Revisa", false))
}
