// Ej10 · Probar y documentar

// PASO 1: escribe encima un comentario KDoc que explique qué hace la función y un ejemplo:
//   /** Devuelve las iniciales (máximo dos) de un nombre: "Ana Ruiz" → "AR". */
//
// PASO 2: completa la función: quita espacios de los bordes (trim), parte por espacios (split(" ")),
//         quita los trozos vacíos, quédate con dos (take(2)) y une la primera letra de cada uno en mayúscula.
//   Pista:  .joinToString("") { it.first().uppercase() }
fun iniciales(nombre: String): String = ""

fun main() {
    // Las pruebas: si alguna falla, el programa se para.
    require(iniciales("Ana Ruiz") == "AR") { "Ana Ruiz debería dar AR" }
    require(iniciales("  luis  ") == "L") { "luis debería dar L" }
    require(iniciales("María José García") == "MJ") { "María José García debería dar MJ" }
    println("Las 3 pruebas pasan")
}
