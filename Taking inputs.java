import java.util.Scanner;

public class NameAgeInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input name
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        input.close();
    }
}
