import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {
    public ArrayList<Item> loadItems (String text) {
        File file = new File(text);
        Scanner scannerFile = null;
        try {
            scannerFile = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<String> phaseArray = new ArrayList<>();
        Item phaseItems = new Item();
        ArrayList<Item> Items = new ArrayList<>();
        while (scannerFile.hasNextLine()) {
            phaseArray.add(scannerFile.nextLine());
        }
        for (int i = 0; i < phaseArray.size() - 1; i++) {
            String[] parts = phaseArray.get(i).split("=");
            Items.add(phaseItems);
            Items.get(i).setWeight(Integer.valueOf(parts[1]));
            Items.get(i).setName(parts[0]);
        }
        return Items;
    }

    public ArrayList<Rocket> loadU1(ArrayList<Item> loadedItems){
        ArrayList<Rocket> rockets = new ArrayList<>();
        U1 u1 = new U1();

        return rockets;
    }
}
