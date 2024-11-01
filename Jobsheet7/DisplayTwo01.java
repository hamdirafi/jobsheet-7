import java.util.Scanner;

public class DisplayTwo01 {
    public static void main(String[] args) {
        // Step 4: Create an instance of Scanner
        Scanner input = new Scanner(System.in);

        // Step 5: Declare int variable
        int numInput;

        // Step 6: Input from user
        System.out.print("Enter a number greater than 2: ");
        numInput = input.nextInt();

        // Validate input
        if (numInput <= 2) {
            System.out.println("Please enter a number greater than 2.");
        } else {
            // Step 7: FOR loop to print multiplication of 2
            System.out.println("Multiples of 2 up to " + numInput + ":");
            for (int i = 2; i <= numInput; i += 2) {
                System.out.print(i + " ");
            }
            System.out.println(); // New line for better output formatting
        }

        // Close the Scanner
        input.close();
    }
}
