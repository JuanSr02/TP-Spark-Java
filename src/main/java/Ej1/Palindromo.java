
package Ej1;


public class Palindromo {
        public static boolean esPalindromo(String palabra) {
        palabra = palabra.toLowerCase().replaceAll("[^a-z]", ""); // Convertir a minúsculas y quitar caracteres no alfabéticos
        int longitud = palabra.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(longitud - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
