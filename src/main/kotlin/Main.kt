import java.util.Scanner

fun main() {
    // Crear un objeto Scanner para leer la entrada del usuario
    val reader = Scanner(System.`in`)

    // Pedir al usuario que ingrese dos números
    print("Ingrese el primer número: ")
    val num1 = reader.nextDouble()

    print("Ingrese el segundo número: ")
    val num2 = reader.nextDouble()

    // Pedir al usuario que ingrese una operación
    print("Ingrese una operación (+, -, *, /): ")
    val operator = reader.next()[0]

    // Realizar la operación correspondiente
    val result = when (operator) {
        '+' -> num1 + num2
        '-' -> num1 - num2
        '*' -> num1 * num2
        '/' -> num1 / num2
        else -> throw IllegalArgumentException("Operador inválido: $operator")
    }

    // Comprobar si el resultado es un número entero y mostrar el resultado sin la parte decimal si es necesario
    if (result % 1 == 0.0) {
        println("El resultado es: ${result.toInt()}")
    } else {
        println("El resultado es: $result")
    }
}
