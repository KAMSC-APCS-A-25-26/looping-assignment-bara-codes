import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        // TODO: Step 1 - Get user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int sum = 0;
        int value = sc.nextInt();

        // TODO: Step 2 - Validate input
        if (value < 2) {
            System.out.print("Error: Input must be 2 or greater.");
        } else {
            for (int j = 2; j <= value; j++) {
                if (j % 2 == 0) {
                    sum += j;
                }
            }
            System.out.println("The sum of even numbers between 2 and " + value + " is " + sum + ".");
        }
    }
}
