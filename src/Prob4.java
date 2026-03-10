import java.util.Scanner;

public class Prob4 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int distanceinFeet = sc.nextInt();
        int distanceinYards = distanceinFeet / 3;
        int distanceinMiles = distanceinYards / 1760;
        System.out.println("The distance in yards is " + distanceinYards + " while the distance in miles is " + distanceinMiles);   

    }
}
