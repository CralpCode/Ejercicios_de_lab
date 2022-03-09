public class A1E6 {
    static int[][] Numeros = {{5,6,13},{14,2,4},{21,7,6}};
    public static void main(String[] args) {
        MultiplicaionN();
    }
    public static void MultiplicaionN() {

        System.out.println("Multiplicacion por dos de la matriz");

        for (int i = 0; i < Numeros.length; i++) {
            for (int j = 0; j < Numeros.length; j++) {
                System.out.print((Numeros[i][j]*2)+ " ");
            }
            System.out.println("");
        }
    }
}
