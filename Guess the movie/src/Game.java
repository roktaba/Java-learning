import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Game {
    public static void main(String[] args) {
        File file = new File("movies.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        String [] moviesList = new String[30];
        int i = 0;
        while (scanner.hasNextLine()){
            moviesList[i] = scanner.nextLine();
            i++;
        }
        for (int j=0; j<(i); j++){
            System.out.println(moviesList[j]);
        }
    }
}
