import java.util.Scanner;

public class A1E1{
    static int elementos[] = new int[5];
    public static void main(String[] args) {
        pedir();
        mostrar();
    }

    public static void pedir() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese 5 numeros");

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el numero");
            elementos[i] = entrada.nextInt();
        }
    }

    public static void mostrar() {
        for (int i = 0; i < 5; i++) {
            System.out.println( (i+1) + ") " + elementos[i]);
        }
    }
}