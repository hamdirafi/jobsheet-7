import java.util.Scanner;

public class TheTriangle01 {
    public static void main(String[] args) {
        // Step 4: Create an instance of Scanner
        Scanner input = new Scanner(System.in);
        
        // Step 5: Create int variable called numInput
        int numInput;
        
        // Step 8: Get input from the user
        System.out.print("Enter the number of rows for the rectangle: ");
        numInput = input.nextInt();
        
        // Step 6: Create int variable i and give 0 as initial value
        int i = 0;

        // Step 7: Create String variable s and give empty string as initial value
        String s = "";

        // Step 9: Loop to print the rectangle pattern
        while (i < numInput) {
            s += "* "; // Build the pattern for one row
            i++; // Increment i
        }

        // Print the rectangle pattern
        for (int j = 0; j < numInput; j++) {
            System.out.println(s); // Print the same row for the number of times specified by numInput
        }

        // Close the Scanner
        input.close();
    }
}
