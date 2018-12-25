import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadingScanner {
    private char guessedLetter;
    private int chances;
    private int checkedLettersCounter;
    char [] checkedChars;

    ReadingScanner(){
        guessedLetter = ' ';
        chances = 10;
        checkedLettersCounter = 0;
        checkedChars = new char[100];
    }

    public char lookingForAnswer() {
        System.out.println("Pozostalych prob: " + chances);
        Scanner InScanner = new Scanner(System.in);
        try {
            guessedLetter = InScanner.next().charAt(0);
        } catch (InputMismatchException exception) {
            System.out.print("To nie była jedna litera");
        }
        if(!checkIsAlready(guessedLetter)){
            chances--;
        }
        return guessedLetter;
    }

    public int getChances() {
        return chances;
    }

    private boolean checkIsAlready(char x){
        for (int i=0; i<checkedChars.length; i++){
            if(checkedChars[i]==x){
                System.out.println("Ta litera juz byla, sprobuj ponownie");
                return true;
            }
        }
        checkedChars[checkedLettersCounter] = x;
        checkedLettersCounter++;
        return false;
    }
}
