import java.util.Scanner;

public class Prob8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        int principal = sc.nextInt();
        System.out.print("Enter the rate of interest: ");
        int rate = sc.nextInt();
        System.out.print("Enter the time (in years): ");
        int time = sc.nextInt();
        float simpleInterest = (principal * rate * time) / 100;
        System.out.println("The simple interest is: " + simpleInterest + " for Principal " + principal + ", Rate of interest " + rate + "% and Time " + time + " years.");
    }
    
}