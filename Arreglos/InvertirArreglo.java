/*
 * Autor: José Alejandro Olvera Lugo
 * Fecha de creación / última modificación: 22/10/2026
 * Descripción: Invierte el orden de los elementos
 * de un arreglo de números enteros.
 */


import java.util.Scanner; // hace leer los datos ingresados

public class InvertirArreglo {

    // Recibe el arreglo y cambia el orden de sus elementos
    public static void invertirArreglo(int[] numeros) {

        // Inicio señala la primera posición del arreglo
        int inicio = 0;

        // Fin señala la última posición del arreglo
        int fin = numeros.length - 1;

        while (inicio < fin) {

            // Guardamos temporalmente el número del inicio para no perderlo al realizar el intercambio.
            int temporal = numeros[inicio];

            numeros[inicio] = numeros[fin];

            // Colocamos el número que guardamos en la posición final
            numeros[fin] = temporal;

            inicio++;

            // Movemos el final hacia la izquierda
            fin--;
        }
    }

    // Aqui comienza la ejecución del programa
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Preguntamos cuantos numeros tendra el arreglo
        System.out.print("Cuantos numeros deseas ingresar? ");
        int cantidad = entrada.nextInt();

        // Evitamos crear un arreglo con una cantida de elementos igual a cero o menor
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor que cero.");
            entrada.close();
            return;
        }

        int[] numeros = new int[cantidad];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa el numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        // Llamamos al método que invierte el arreglo
        invertirArreglo(numeros);

        System.out.println("Arreglo invertido:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        entrada.close();
    }
}