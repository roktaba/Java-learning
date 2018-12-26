import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Game {
    public static void main(String[] args) {
        ReadingScanner playerGuess = new ReadingScanner();
        File file = new File("movies.txt");
        Scanner scanner = null;
        boolean win = false;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.exit(0);
        }
        String[] moviesList = new String[30];
        int i = 0;
        while (scanner.hasNextLine()) {
            moviesList[i] = scanner.nextLine();
            i++;
        }
        int random = (int) (Math.random() * i + 1);
        String randomMovie = moviesList[random];
        String guessingMovie = randomMovie;
        char[] movieLetters = new char[randomMovie.length()];
        for (int j = 0; j < randomMovie.length(); j++) {
            movieLetters[j] = randomMovie.charAt(j);
            if (movieLetters[j] != ' ') {
                movieLetters[j] = '_';
            }
        }
        System.out.println("Zgadnij jaki film! Masz 10 prób!");
        while (playerGuess.getChances() > 0) {
            char guessedChar = playerGuess.lookingForAnswer();
            for (int k = 0; k < randomMovie.length(); k++) {
                if (guessedChar == randomMovie.charAt(k)) {
                    movieLetters[k] = guessedChar;
                }
            }
            boolean winTest = true;
            for (int k = 0; k < randomMovie.length(); k++) {
                if (movieLetters[k] != randomMovie.charAt(k)) {
                    winTest = false;
                }
            }
            if (winTest) {
                win = true;
                break;
            }
            for (int j = 0; j < randomMovie.length(); j++) {
                System.out.print(movieLetters[j]);
                System.out.print(' ');
            }
        }
        if ((playerGuess.getChances() < 1) && (!win)) {
            System.out.println("Przegrałeś!" + " Prawidłowa odpowiedź to: " + randomMovie);
        }
        if (win) {
            System.out.println("Wygrana, prawidłowa odpowiedź to: " + randomMovie);
        }
    }
}
