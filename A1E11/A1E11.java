import java.util.Scanner;

public class A1E11 {
    static float[] Notas = new float[6];
    static String[] Nombres = new String[6];
    static String[] Calificar = new String[6];
    public static void main(String[] args) {
        Ingreso();
        Calificacion();
    }
    public static void Ingreso() {
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.println("Ingrese el nombre del alumno" + (i+1));
            Nombres[i] = entrada.next();
            System.out.println("Ingrese la nota del alumno" + (i+1));
            Notas[i] = entrada.nextFloat();

            if (Notas[i] >= 7 && Notas[i] < 9) {
                Calificar[i] = "Notable";
            }else{
                if (Notas[i] > 4 && Notas[i] < 7) {
                    Calificar[i] = "Bien";
                }
                else{
                    if (Notas[i] > 9 && Notas[i] <= 10 ) {
                        Calificar[i] = "Sobresaliente";
                    }else{
                        if (Notas[i] < 6 && Notas[i]>=0) {
                            Calificar[i] = "Suspenso";
                        }else{
                            i = i-1;
                            System.out.println("Ingrese un valor de nota entre 0 y 10");
                        }
                    }
                }
            }
        }
    }

    public static void Calificacion() {

        System.out.println("***Nombre********Notas*******Calificacion");

        for (int i = 0; i < 6; i++) {
            System.out.println((i+1) + ") " + Nombres[i] + "      " + Notas[i] +"       "+ Calificar[i]); 
        }
    }
}
