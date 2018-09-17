public class RecursiveFunctionMaxValue {

    public static void main(String[] args) {

        int[] numeros = { 300, 40000, 500, 1000, 5000 };

        System.out.println(maximoElemento(numeros, 0, numeros.length - 1));

    }

    public static int maximoElemento(int[] numeros, int primero, int ultimo) {

        if (primero == ultimo) {
            return numeros[primero];
        }

        int subMedida = (ultimo + 1 - primero) / 2;

        int maxA = maximoElemento(numeros, primero, primero + subMedida - 1);
        int maxB = maximoElemento(numeros, primero + subMedida, ultimo);

        return Math.max(maxA, maxB);

    }

}