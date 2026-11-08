// Ej11 · Dibujar con coordenadas

// Un lienzo de "ancho" columnas y "alto" filas, relleno de puntos.
fun lienzo(ancho: Int, alto: Int) = Array(alto) { CharArray(ancho) { '.' } }

// PASO 1: rellena con el carácter c el rectángulo que empieza en (x, y) y mide w × h.
//   Pista:  for (fy in y until y + h) for (fx in x until x + w) l[fy][fx] = c
fun rectangulo(l: Array<CharArray>, x: Int, y: Int, w: Int, h: Int, c: Char) {
}

fun main() {
    val l = lienzo(12, 5)
    // PASO 2: dibuja un rectángulo '#' en (1, 1) de 4 × 3 y otro 'o' en (7, 2) de 3 × 2.

    l.forEach { println(String(it)) }
}
