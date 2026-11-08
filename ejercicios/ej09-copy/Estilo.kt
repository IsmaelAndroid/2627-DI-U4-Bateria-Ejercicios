// Ej09 · Variantes con data class y copy

data class EstiloBoton(val texto: String, val color: String = "azul", val habilitado: Boolean = true)

fun main() {
    val normal = EstiloBoton("Guardar")
    // PASO 1: crea "peligro" a partir de normal con copy, cambiando el texto a "Borrar" y el color a "rojo".

    // PASO 2: crea "apagado" a partir de normal con copy, cambiando solo habilitado a false.

    // PASO 3: muestra los tres y la comparación:  println("normal == apagado: ${normal == apagado}")
    println(normal)
}
