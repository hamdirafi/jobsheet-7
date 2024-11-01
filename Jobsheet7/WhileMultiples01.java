import java.util.Scanner;

public class WhileMultiples01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int multiple, sum = 0, counter = 0;

        
        System.out.print("Enter a number to find its multiples (1 to 50): ");
        multiple = input.nextInt();

        
        System.out.println("Multiples of " + multiple + " in the range 1 to 50:");
        int i = 1;
        while (i <= 50) {
            if (i % multiple == 0) {
                System.out.print(i + " "); 
                sum += i;                  
                counter++;                 
            i++; 
        }

        
        System.out.println("\nTotal sum of multiples: " + sum);
        System.out.println("Count of multiples: " + counter);

        
        if (counter > 0) {
            double average = (double) sum / counter;
            System.out.println("Average of multiples: " + average);
        } else {
            System.out.println("No multiples found.");
        }

        input.close();
    }
}
}
