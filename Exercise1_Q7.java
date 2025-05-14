import java.util.Scanner;

public class Exercise1_Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;

        String choice;

        do {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            // Count based on value
            if (number > 0) {
                countPositive++;
            } else if (number < 0) {
                countNegative++;
            } else {
                countZero++;
            }

            System.out.print("Do you want to enter another number? (yes/no): ");
            sc.nextLine(); 
            choice = sc.nextLine();

        } while (choice.equalsIgnoreCase("yes"));

        // Display final counts
        System.out.println("\nResults:");
        System.out.println("Positive numbers: " + countPositive);
        System.out.println("Negative numbers: " + countNegative);
        System.out.println("Zeroes: " + countZero);
    }
}
