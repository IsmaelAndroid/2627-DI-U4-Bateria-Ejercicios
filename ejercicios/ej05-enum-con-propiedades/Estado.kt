// Ej05 · Un enum con propiedades

// PASO 1: añade el estado ERROR con la etiqueta "Fallido" y el color "rojo".
enum class Estado(val etiqueta: String, val color: String) {
    OK("Completado", "verde"),
    AVISO("Revisa", "ámbar"),
}

fun main() {
    // PASO 2: recorre Estado.entries y muestra  "OK: Completado en verde"
    Estado.entries.forEach { println(it.name) }
}
