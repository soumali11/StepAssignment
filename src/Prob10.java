import java.util.Scanner;

public class Prob10 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();
        System.out.println("The number of possible handshakes is " + (numberOfStudents*(numberOfStudents-1)/2));
    }
    
}