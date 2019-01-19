import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
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
        ArrayList<Item> items = new ArrayList<>();
        while (scannerFile.hasNextLine()) {
            phaseArray.add(scannerFile.nextLine());
        }
        for (int i = 0; i < phaseArray.size(); i++) {
            Item phaseItems = new Item();
            String[] parts = phaseArray.get(i).split("=");
            items.add(phaseItems);
            items.get(i).setWeight(Integer.valueOf(parts[1]));
            items.get(i).setName(parts[0]);
        }
        return items;
    }

    public ArrayList<SpaceShip> loadU1(ArrayList<Item> loadedItems){
        ArrayList<SpaceShip> rockets = new ArrayList<>();
        U1 u1 = new U1();
        List<Item> loadedItems2 = new ArrayList<>();
        System.out.println(loadedItems.size());
            rockets.add(u1);

            for (int i = 0; i < loadedItems.size()-1 ;i++) {
                if (rockets.get(0).canCarry(loadedItems.get(i))){
                    rockets.get(0).carry(loadedItems.get(i));
                    loadedItems2.add(loadedItems.get(i));
                }
            }
        System.out.println(loadedItems.size());
        return rockets;
    }
}
