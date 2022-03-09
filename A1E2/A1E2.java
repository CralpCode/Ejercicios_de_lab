public class A1E2 {
    static int numeros[] = new int [10];
    public static void main(String[] args) {
        numaleat();
       
        NumMayor();
    }

    public static void numaleat() {
        int aleat = 0;
        for (int i = 0; i < 10; i++) {
            aleat = (int) (Math.random()*100);
            numeros[i] = aleat;
            System.out.println((i+1)+") " + numeros[i]);
        }
        
    }

    public static void NumMayor() {
        int mayor = 0;
        int mayorfinal = 0;
        int igual = 0;
        for (int i = 0; i <= 9; i++) {
            if (i == 0) {
                    mayor = numeros[0];
            }
            else{
                if (mayor < numeros[i]) {
                    mayor = numeros[i];
                }
            }
        }

        mayorfinal = mayor;

        for (int i = 0; i <= 9; i++) {
            if (numeros[i] == mayorfinal) {
                igual = igual + 1;
            }
        }
        igual = igual - 1;
        System.out.println("El número mayor es " + mayorfinal );
        System.out.println("El numero mayor se repite " + igual + " veces");
    }
}
