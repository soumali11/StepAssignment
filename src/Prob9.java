import java.util.Scanner;

public class Prob9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weight in pounds:"); 
        double weight = sc.nextDouble();
        double weightInKg = weight * 2.2;
        System.out.println("The weight of the person in pounds is " + weight + " and in kilograms is " + weightInKg);
        
    }
    
}