// Ej04 · Argumentos con nombre

// PASO 1: si formal es true, devuelve "Buenos días, $nombre"; si no, "Hola, $nombre".
fun saludo(nombre: String = "invitado", formal: Boolean = false): String = "Hola, $nombre"

fun main() {
    println(saludo())
    println(saludo("Ana"))
    // PASO 2: muestra el saludo formal SIN escribir el nombre (argumento con nombre: formal = true).

    // PASO 3: muestra el saludo formal a "Sr. Ruiz" escribiendo primero formal y después nombre.

}
