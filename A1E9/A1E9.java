import java.util.Scanner;

public class A1E9 {
    static int conteo = 0;
    static int[][] Matrizuno;
    static int FilasUno = 0;
    static int FilasDos = 0;
    static int ColumnasUno = 0;
    static int ColumnasDos = 0;
    static int[][] Matrizdos;
    public static void main(String[] args) {
        Datos();
        SumarM();
    }

    public static void Datos() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese cantidad de filas para la primera Matriz");
        FilasUno = entrada.nextInt();
        System.out.println("Ingrese cantidad de Columnas para la primera Matriz");
        ColumnasUno = entrada.nextInt();
        System.out.println("Ingrese cantidad de filas para la segunda Matriz");
        FilasDos = entrada.nextInt();
        System.out.println("Ingrese cantidad de Columnas para la segunda Matriz");
        ColumnasDos = entrada.nextInt();

        if (FilasDos == FilasUno && ColumnasDos == ColumnasUno){
            Ingreso(FilasUno, ColumnasUno);
            Ingreso(FilasDos, ColumnasDos);

        }
        else{
            System.out.println("Ingrese matrices con la misma dimension");
            Datos();
        }
    }

    public static void Ingreso(int Filas, int Columnas) {
        Scanner entrada = new Scanner(System.in);
                if (conteo == 3) {
                    conteo =0;
                }
            conteo = conteo +1;
            
            

            if (conteo == 1) {
                Matrizuno = new int[Filas][Columnas];
                for (int i = 0; i < Filas; i++) {
                    for (int j = 0; j < Columnas; j++) {
                        System.out.println("Ingrese el valor de la pocision " + (i+1) + " x " + (j+1) + " de la primera matriz" );
                        Matrizuno[i][j] = entrada.nextInt();
                    }
                }
            }

            if (conteo == 2) {
                Matrizdos = new int[Filas][Columnas];
                for (int i = 0; i < Filas; i++) {
                    for (int j = 0; j < Columnas; j++) {
                        System.out.println("Ingrese el valor de la pocision " + (i+1) + " x " + (j+1) + " de la segunda matriz" );
                        Matrizdos[i][j] = entrada.nextInt();
                    }
                }
            }

    }
    public static void SumarM() {

        System.out.println("Suma de Matrices");

                for (int i = 0; i < FilasUno ; i++) {
                    for (int j = 0; j < ColumnasUno; j++) {

                        System.out.print((Matrizuno[i][j]+Matrizdos[i][j]) + " ");

                    }
                    System.out.println("");
                }
    }
}
