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
        ArrayList<String> phase1Array = new ArrayList<>();
        ArrayList<String> phase1ToolsNames = new ArrayList<>();
        ArrayList<Integer> phase1ToolsAmmount = new ArrayList<>();

        while (scannerFile1.hasNextLine()) {
            phase1Array.add(scannerFile1.nextLine());
        }
        for (int i = 0; i < phase1Array.size() - 1; i++) {
            String[] parts = phase1Array.get(i).split("=");
            phase1ToolsNames.add(parts[0]);
            phase1ToolsAmmount.add(Integer.valueOf(parts[1]));



        }
        for (int j = 0; j < phase1ToolsAmmount.size(); j++){
            System.out.println(j + "  "  +phase1ToolsAmmount.get(j));
        }

        File file2 = new File("Phase-2.txt");
        Scanner scannerFile2 = null;
        try {
            scannerFile2 = new Scanner(file2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<String> Phase2Array = new ArrayList<String>();
        while (scannerFile2.hasNextLine()) {
            Phase2Array.add(scannerFile2.nextLine());
        }
    }
}
