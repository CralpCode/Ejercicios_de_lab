import java.util.Scanner;

public class A1E5 {
    static float [] Notas;
    static float CantidadNotas;
    static float SumaNotas;
    static int cambiar;
    public static void main(String[] args) {
        Ingreso();
        Promedio();
    }

    public static void Ingreso() {
        Scanner entrada = new Scanner(System.in);
        CantidadNotas =(float) 0;
        SumaNotas = (float) 0;
        System.out.println("Cuantas Notas desea ingresar");
        CantidadNotas = entrada.nextFloat();
        cambiar = (int) CantidadNotas;
        Notas = new float[cambiar];
        for (int i = 0; i <CantidadNotas; i++) {
            System.out.println("Ingrese la nota " + (i+1));
            Notas[i] = entrada.nextFloat();
            SumaNotas = SumaNotas + Notas[i];
        }
    }

    public static void Promedio() {
        float prom = 0;
        float proma = 0;
        float promb = 0;
        float promc = 0;

        prom = (SumaNotas-50)/(CantidadNotas+1);
        proma = (-5)/9;
        promb = (-44)/2;
        promc = 44/19;

        System.out.println("El promedio de las notas es " + prom);

        System.out.println("\n\n Conjuntos de notas propuestos");
        System.out.println("a. 5,7,2,3,9,5,6,8,-50 = " + proma);
        System.out.println("b. 6,-50 = " + promb);
        System.out.println("b. 1,5,4,7,8,3,2,9,4,5,3,6,6,8,8,-50 = " + promc);


    }
}
