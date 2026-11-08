// Ej08 · El estado vive arriba

// El "componente": solo dibuja lo que le pasan.
fun interruptor(texto: String, activo: Boolean) = "$texto: " + if (activo) "[ON]" else "[OFF]"

fun main() {
    var wifi = false   // el estado vive en la PANTALLA, no en el componente

    // PASO 1: el evento recibe el valor nuevo y lo guarda en wifi.
    val alCambiar: (Boolean) -> Unit = { nuevo -> }

    println(interruptor("Wi-Fi", wifi))
    // PASO 2: simula que el usuario pulsa dos veces: alCambiar(!wifi) y vuelve a dibujar cada vez.

}
