public class A1E7 {
    static int [][] Numeros = new int [4][3];
    public static void main(String[] args) {
        Aleatorio();
        SumaPar();
    }

    public static void Aleatorio() {
        int aleat = 0;

        System.out.println("Matriz 4x3");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                aleat = (int) (Math.random()*555);
                Numeros[i][j] = aleat;
                System.out.print(Numeros[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void SumaPar() {
        int sumar = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 || i == 3){
                    sumar = sumar + Numeros[i][j];
                }
            }
        }

        System.out.println("La suma de las filas pares es " + sumar);
    }
}
