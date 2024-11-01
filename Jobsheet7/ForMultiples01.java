import java.util.Scanner;

public class ForMultiples01 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
        int multiple, sum = 0, counter = 0;

        
        System.out.print("Input the multiples : ");
        multiple = input.nextInt();


        for (int i = 1; i <= 50; i++) {
            if (i % multiple == 0) {
                System.out.print(i + " "); 
                sum += i;                  
                counter++;                 
            }
        }

        
        System.out.printf("\nTotal sum of multiples: " + sum);
        System.out.printf("Count of multiples: " + counter);

        input.close();
    }
}

