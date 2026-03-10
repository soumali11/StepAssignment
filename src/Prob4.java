
import java.util.Scanner;

public class Prob4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter traveller name: ");
        String name = sc.nextLine();

        System.out.print("Enter starting city: ");
        String fromCity = sc.nextLine();

        System.out.print("Enter via city: ");
        String viaCity = sc.nextLine();

        System.out.print("Enter destination city: ");
        String toCity = sc.nextLine();

        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " (km): ");
        double fromToVia = sc.nextDouble();

        System.out.print("Enter distance from " + viaCity + " to " + toCity + " (km): ");
        double viaToFinalCity = sc.nextDouble();

    
        System.out.print("Enter time taken from " + fromCity + " to " + viaCity + " (minutes): ");
        int timeFromToVia = sc.nextInt();

        System.out.print("Enter time taken from " + viaCity + " to " + toCity + " (minutes): ");
        int timeViaToFinalCity = sc.nextInt();

        
        double totalDistance = fromToVia + viaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;


        System.out.println("The Total Distance travelled by " + name + 
        " from " + fromCity + " to " + toCity + 
        " via " + viaCity + " is " + totalDistance + 
        " km and the Total Time taken is " + totalTime + " minutes");

        sc.close();
    }
}