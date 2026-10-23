/*
 * Autor: José Alejandro Olvera Lugo
 * Fecha de creación / última modificación: 22/10/2026
 * Descripción: Comprueba si una palabra es un palíndromo
 * mediante un método recursivo.
 */

import java.util.Scanner;

public class Palindromo {

    public static boolean esPalindromo(String palabra, int inicio, int fin) {

        // llegamos al centro de la palabra
        if (inicio >= fin) {
            return true;
        }

        // Si los caracteres son diferentes, no es palindromo
        if (palabra.charAt(inicio) != palabra.charAt(fin)) {
            return false;
        }

        // Llamada recursiva: avanzamos hacia el centro
        return esPalindromo(palabra, inicio + 1, fin - 1);
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa una palabra: ");
        String palabra = entrada.nextLine().toLowerCase().trim();

        boolean resultado = esPalindromo(
            palabra, 0, palabra.length() - 1
        );

        if (resultado) {
            System.out.println("La palabra es un palindromo.");
        } else {
            System.out.println("La palabra no es un palindromo.");
        }

        entrada.close();
    }
}