public class SquareRoot {

    public static void main(String[] args) {

        int[] numeros1 = { 300, 40000, 500, 1000, 5000 };
        int[] numeros2 = { 400, 50000, 600, 2000, 6000 };

        System.out.println(raizCuadrada(numeros1, numeros2));

    }

    public static double raizCuadrada(int[] numeros1, int[] numeros2) {

        int sumaNumeros1 = 0;
        int diferenciaNumeros1;
        int cuadradosNumeros1;

        int sumaNumeros2 = 0;
        int diferenciaNumeros2;
        int cuadradosNumeros2;

        double sumaCuadrados;

        for (int i = 0; i < numeros1.length; i++) {
            sumaNumeros1 += numeros1[i];
        }

        diferenciaNumeros1 = sumaNumeros1 / numeros1.length;
        cuadradosNumeros1 = diferenciaNumeros1 * diferenciaNumeros1;

        for (int i = 0; i < numeros2.length; i++) {
            sumaNumeros2 += numeros2[i];
        }

        diferenciaNumeros2 = sumaNumeros2 / numeros2.length;
        cuadradosNumeros2 = diferenciaNumeros2 * diferenciaNumeros2;

        sumaCuadrados = cuadradosNumeros1 + cuadradosNumeros2;

        return Math.sqrt(sumaCuadrados);

    }

}