import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Prompt user to enter the interval range
        System.out.println("Enter the starting number of the interval:");
        int start = scn.nextInt();

        System.out.println("Enter the ending number of the interval:");
        int end = scn.nextInt();

        // Check and print multiples of 10 in the interval
        System.out.println("Multiples of 10 between " + start + " and " + end + " are:");
        for (int i = start; i <= end; i++) {
            if (i % 10 == 0) {
                System.out.println(i);
            }
        }
    }
}
