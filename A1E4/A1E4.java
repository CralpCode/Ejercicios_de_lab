public class A1E4 {
    static  int mayorfinal = 0;
    static int[] numeros = new int[10];
    public static void main(String[] args) {
        Aleatorio();
        Mayor();
        Distancias();
    }

    public static void Aleatorio() {
        int aleat = 0;
        for (int i = 0; i < 10; i++) {
            aleat = (int) (Math.random()*100);
            numeros[i] = aleat;
            System.out.println((i+1)+") " + numeros[i]);
        }
    }

    public static void Mayor() {
        int mayor = 0;
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
        System.out.println("El número mayor es " + mayorfinal);

    }

    public static void Distancias() {
        for (int index = 0; index < 10; index++) {
            System.out.println((index+1)+") La distacia con el número mayor es " + (mayorfinal - numeros[index]));
        }
    }
}
