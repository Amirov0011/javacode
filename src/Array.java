import java.util.Scanner;

public class Array {
    public static boolean numberArray(int[] array, int number) {
        for (int value : array) {
            if (value == number) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = scanner.nextInt();

        if (numberArray(array, a)) {
            System.out.println("The number " + a + " is in the array.");
        } else {
            System.out.println("The number " + a+ " is not in the array.");
        }


    }
}
