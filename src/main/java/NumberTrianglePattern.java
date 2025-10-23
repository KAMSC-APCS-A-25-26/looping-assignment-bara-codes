import java.util.Scanner;

public class NumberTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int length = sc.nextInt();
        int number = length;

        // TODO: Step 1 - Get user input
        for (int j=0; j<=length; j++)
        {
            for (int x=1; x<=j; x++)
            {
                if (x == length)
                {
                    System.out.print(x);
                }
                else
                {
                    System.out.print(x + " ");
                }   
               
            }
            System.out.println();
         



        }

        // TODO: Step 2 - Generate the number triangle pattern
    }
}
