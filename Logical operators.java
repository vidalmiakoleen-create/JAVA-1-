import java.util.Scanner;

public class LabActivity2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int limit = sc.nextInt();

        int sum = 0;
        int i = 1;    

        while (i <= limit) {
            sum = sum + i;  
            i = i + 1;     
        }

        System.out.println("The sum of natural numbers up to " + limit + " is: " + sum);

        sc.close();
    }
}
