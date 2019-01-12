import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SpaceChallenge {

    public static void main(String[] args) {
        File file1 = new File("Phase-1.txt");
        Scanner scannerFile1 = null;
        try {
            scannerFile1 = new Scanner(file1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<String> Phase1Array = new ArrayList<String>();
        while (scannerFile1.hasNextLine()){
            Phase1Array.add(scannerFile1.nextLine());
        }

        Phase1Array.get(0).indexOf('=');

        File file2 = new File("Phase-2.txt");
        Scanner scannerFile2 = null;
        try {
            scannerFile2 = new Scanner(file2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<String> Phase2Array = new ArrayList<String>();
        while (scannerFile2.hasNextLine()){
            Phase2Array.add(scannerFile2.nextLine());
        }
    }
}
