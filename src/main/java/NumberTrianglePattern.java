import java.util.Scanner;

public class NumberTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int length = sc.nextInt();
        int number = length;

        // TODO: Step 1 - Get user input
        for (int j=0; j<=length; j++)
        {
            for (int x=1; x<=j; x++)
            {
                System.out.print(x + " ");
            }
            System.out.println(" ");
            if (j == length)
            {
                System.out.print("");
            }
            else
            {
                System.out.print(" ");
            }



        }

        // TODO: Step 2 - Generate the number triangle pattern
    }
}
