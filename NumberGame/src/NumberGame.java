import java.util.Scanner;

public class NumberGame {
    public static void main(String [] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        boolean hasWon = false;
        System.out.println("Wylosowano numer 1-100");
        System.out.println("Spróbuj zgadnąć");
        for (int i=10; i>0; i--) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Zostało ci " +i + " prób.");
            int guess = scanner.nextInt();
            if (guess > randomNumber) {
                System.out.println("Wybrałeś za dużą liczbę");
            }
            else if (guess < randomNumber) {
                System.out.println("Wybrałeś za małą liczbę");
            }
            else {
                hasWon = true;
                break;
            }
        }
        if (hasWon){
            System.out.println("Wygrałeś!");
        }
        else {
            System.out.println("Przegrałeś, poprawną odpowiedzią jest: " + randomNumber);
        }
    }
}
