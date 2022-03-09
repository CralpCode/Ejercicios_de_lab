import java.util.Scanner;

public class A1E10 {
    static int[][] Matriz = new int[3][4];
    static int[][] MatrizTranspuesta = new int[4][3];
    public static void main(String[] args) {
        DatosMatriz();
        MatrizTranspuestaTotal();
    }
    public static void DatosMatriz() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los datos para la matrz 3x4");

        for (int index = 0; index < 3; index++) {
            for (int i = 0; i < 4; i++) {
                System.out.println("Ingrese el valor de la pocision " + (index+1) + " x " + (i+1) + " de la matriz" );
                Matriz[index][i] = entrada.nextInt();
            }
        }
    }
    public static void MatrizTranspuestaTotal() {
        int cambio = 0;

        System.out.println("Matriz Principal                     Matriz Transpuesta");

        for (int i = 0; i < 4; i++) {
                for(int k = 0; k < 4; k++ ){
                    if (i < 3){

                        System.out.print(Matriz[i][k] + " ");
                    }
                    if(k == 3){
                        System.out.print("                          ");
                        if (i == 3){
                        System.out.print("        ");
                        }
                        for(int j = 0; j < 3; j++){
                            MatrizTranspuesta[i][j] = Matriz[j][cambio];
                            System.out.print( MatrizTranspuesta[i][j] + " ");
                        }
                    }
                }
            cambio = cambio + 1;
            System.out.println("");
        }

        cambio = 0;

        System.out.println("\n\n Matriz transpuesta");
        for (int i = 0; i < 4; i++) {
            for(int k = 0; k < 3; k++ ){

                        MatrizTranspuesta[i][k] = Matriz[k][cambio];
                        System.out.print( MatrizTranspuesta[i][k] + " ");
                    }
                    cambio = cambio + 1;
                    System.out.println("");
            }
    }
}
