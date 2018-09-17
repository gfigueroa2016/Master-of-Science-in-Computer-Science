public class Average {

    public static void main(String[] args) {
        int sum = 0;
        int height[] = { 66, 69, 71, 70, 75, 67, 69, 64, 73, 71 };

        for (int i = 0; i < height.length; i++) {
            sum += height[i];
        }

        int average = sum / height.length;

        System.out.println("The average height is " + average);

        for (int i = 0; i < height.length; i++) {

            if (height[i] < average) {

                System.out.println(
                        "This height of " + height[i] + " is smaller than the average height of " + average + ".");

            } else if (height[i] > average) {

                System.out.println(
                        "This height of " + height[i] + " is taller than the average height of " + average + ".");

            } else {

                System.out.println("This height of " + height[i] + " is average.");

            }
        }
    }
}
