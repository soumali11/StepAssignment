import java.util.Scanner;

public class Prob6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();
        System.out.println("The Quotient is " + (number1/number2) + " and Remainder is " + (number1%number2) + " of two number " + number1 + " and " + number2);
    }
}
