import java.util.Scanner;

public class Prob7 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of children: ");
        int numberofChildren = sc.nextInt();
        System.out.print("Enter the number of chocolates: ");
        int numberofChocolates = sc.nextInt();
        int chocolatesPerChild = numberofChocolates/numberofChildren;
        int remainingChocolates = numberofChocolates%numberofChildren;
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates is " + remainingChocolates);
    }
    
}