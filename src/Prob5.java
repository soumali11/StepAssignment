import java.util.Scanner;

public class Prob5 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();
        System.out.println("The swapped numbers are " +(number1+number2-number1)+ " and " +(number1+number2-number2));
    }
    
}