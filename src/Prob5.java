import java.util.Scanner;

public class Prob5 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the unit price of the item: ");
        int unitPrice = sc.nextInt();
        System.out.print("Enter the quantity of the item: ");
        int quantity = sc.nextInt();
        int totalPrice = unitPrice * quantity;
        System.out.println("The total purchase price is " + totalPrice + " if the quantity is " + quantity + " and the unit price is " + unitPrice);
    }
}
