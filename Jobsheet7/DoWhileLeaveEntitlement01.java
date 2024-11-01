import java.util.Scanner;

public class DoWhileLeaveEntitlement01 {
    public static void main(String[] args) {
        // Step 4: Create an instance of Scanner
        Scanner input = new Scanner(System.in);
        
        // Step 5: Create variables for leave entitlement and used leave
        int leaveEntitlement = 5; // Total leave days
        int numLeave = 0;         // Leave days used
        String confirmation;       // For user confirmation

        // Step 7: DO-WHILE loop to manage leave requests
        do {
            // Display current leave status
            System.out.println("You have " + (leaveEntitlement - numLeave) + " leave days remaining.");

            // Check for warning
            if (leaveEntitlement - numLeave <= 2) {
                System.out.println("Warning: You have only 2 leave days remaining.");
            }

            // Ask user how many leave days they want to take
            System.out.print("Enter the number of leave days to take: ");
            int requestedLeave = input.nextInt();

            // Check if the requested leave can be granted
            if (numLeave + requestedLeave <= leaveEntitlement) {
                numLeave += requestedLeave; // Update the number of leave days used
                System.out.println("Leave days granted.");
            } else {
                System.out.println("You cannot take more leave than you are entitled to.");
            }

            // Ask for confirmation to continue
            System.out.print("Do you want to request leave again? (yes/no): ");
            confirmation = input.next();

        } while (confirmation.equalsIgnoreCase("yes"));

        // Closing message
        System.out.println("Total leave days taken: " + numLeave);
        System.out.println("Leave entitlement management ended.");

        // Close the Scanner
        input.close();
    }
}
