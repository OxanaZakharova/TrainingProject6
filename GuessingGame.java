import java.util.Scanner;

public class GuessingGame{


    public static void main(String[] args){
        int low, high;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input low number:");
        low = sc.nextInt();
        System.out.println("Input high number:");
        high = sc.nextInt();
        if (high > low) {
            Guesser g1 = new Guesser(low,high);
            g1.start();
        } else System.out.println("High number is less ");
    }

}

