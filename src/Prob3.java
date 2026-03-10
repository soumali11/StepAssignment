import java.util.Scanner;

public class Prob3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter bonus: ");
        double bonus = sc.nextDouble();
        double totalSalary = salary + bonus;
        System.out.println("The total salary is " + totalSalary + " if the salary is " + salary + " and the bonus is " + bonus);

    }
        
}
