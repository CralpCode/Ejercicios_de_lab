import java.util.Scanner;

public class A1E3{
    static int[] Numeros = new int[8];
    public static void main(String[] args) {
        Num();
        Buscar();
    }
    public static void Num() {
        Scanner entrada = new Scanner(System.in);

        for (int index = 0; index < 8; index++) {
            System.out.println("Ingrese un número");
            Numeros[index]= entrada.nextInt();

        }
    }
    public static void Buscar() {
        Scanner entrada = new Scanner(System.in);
        int Ingreso = 0;
        boolean retorno = false;

        System.out.println("Que número desea buscar");
        Ingreso = entrada.nextInt();
        for (int index = 0; index < 8; index++) {
            if (Ingreso == Numeros[index]) {
                retorno = true;
            }

        }
        System.out.println(retorno);
    }
}