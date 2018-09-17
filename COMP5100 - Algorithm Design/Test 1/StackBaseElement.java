public class StackBaseElement {

    public static void main(String[] args) {

        Stack<String> contenidos = new Stack<>();

        contenidos.add("Gomas");
        contenidos.add("Motor");
        contenidos.add("Cristales");
        contenidos.add("Antenas");

        System.out.println(stackBase(contenidos));

    }

    public static String stackBase(Stack<String> base) {

        return base.firstElement();

    }

}
