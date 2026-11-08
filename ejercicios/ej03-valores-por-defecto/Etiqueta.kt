// Ej03 · Propiedades con valor por defecto

// PASO 1: da a color el valor por defecto "negro" y a tamano el valor 14.
class Etiqueta(val texto: String, val color: String, val tamano: Int) {
    fun dibujar() = "[$texto | $color | $tamano sp]"
}

fun main() {
    // PASO 2: cuando tengan valor por defecto, quita los argumentos que sobran:
    //   Etiqueta("Hola"), Etiqueta("Aviso", color = "rojo") y Etiqueta("Título", tamano = 22)
    println(Etiqueta("Hola", "negro", 14).dibujar())
    println(Etiqueta("Aviso", "rojo", 14).dibujar())
    println(Etiqueta("Título", "negro", 22).dibujar())
}
