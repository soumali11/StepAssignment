import java.util.Scanner;

public class Prob6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sides of the triangle: ");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        int perimeter = side1 + side2 + side3;
        System.out.println("The total number of rounds the athlete will run is " + (5000/perimeter) + " to complete 5km.");

    }
} 