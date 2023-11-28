import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter two numbers:");

        // nextDouble() reads the next double from the keyboard
        double first = input.nextDouble();
        double second = input.nextDouble();

        // Here we are adding the two numbers
        double sum = first + second;

        System.out.println("The sum of " + first + " and " + second + " is: " + sum);
    }
}
