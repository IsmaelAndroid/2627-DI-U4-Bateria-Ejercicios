// Ej07 · Un componente que avisa con un evento

val MESES = listOf(
    "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
    "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre",
)

class SelectorMes(private val onSeleccion: (Int) -> Unit) {
    // PASO 1: busca la posición del mes (MESES.indexOf). Si existe (>= 0),
    //         avisa con el número del mes:  onSeleccion(posicion + 1)
    fun elegir(nombre: String) {
    }
}

fun main() {
    // PASO 2: la pantalla decide qué hacer con el mes: muestra "Abono recargado para el mes 3"
    val selector = SelectorMes { mes -> }
    selector.elegir("Marzo")
    selector.elegir("Brumario")
    selector.elegir("Diciembre")
}
