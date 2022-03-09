import java.util.Scanner;

public class A1E8 {
    static String[] Palabras = new String[5];
    static String[] Palabrasdos = new String[5];
    public static void main(String[] args) {
        IngresoPalabras();
        Comparacion();
    }

    public static void IngresoPalabras() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Primer Array");
        for (int i = 0; i < 5; i++) {
            Palabras[i] = entrada.next();
        }

        System.out.println("Segundo Array");
        for (int i = 0; i < 5; i++) {
            Palabrasdos[i] = entrada.next();
        }
    }

    public static void Comparacion() {

        if (Palabras[0].length() == Palabrasdos[0].length()) {
            
            System.out.println("La palabra " + Palabras[0] + " pertenece al primer array, tinen el mismo tamaño que " + Palabrasdos[0] );
            System.out.println("La palabra " + Palabrasdos[0] + " pertenece al segundo array, tinen el mismo tamaño que " + Palabras[0] );
            System.out.println("Ambas palabras pertenecen a la posicion 0 de sus arrays");

            if (Palabras[0].equals(Palabrasdos[0])) {
                System.out.println("Las palabras son iguales");
            }
            else{
                System.out.println("Las palabras no son iguales");
            }
        }
    }
}
