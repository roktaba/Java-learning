import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

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
            rockets.add(u1);
            for (int i = 0; i < loadedItems.size()-1; i++ ){
                if (loadedItems.get())
            }

/*            for (int i = 0; i < loadedItems.size(); i++) {
                if (rockets.get(rockets.size()-1).canCarry(loadedItems.get(i))) {
                    rockets.get(rockets.size() - 1).carry(loadedItems.get(i));
                    loadedItems.remove(i);
                    i--;
                }*/

        return rockets;
    }

    public ArrayList<SpaceShip> loadU2(ArrayList<Item> loadedItems2){
        ArrayList<SpaceShip> rockets = new ArrayList<>();
        while (loadedItems2.size() > 0) {
            U2 u2 = new U2();
            rockets.add(u2);
            for (int i = 0; i < loadedItems2.size(); i++) {
                if (rockets.get(rockets.size()-1).canCarry(loadedItems2.get(i))) {
                    rockets.get(rockets.size()-1).carry(loadedItems2.get(i));
                    loadedItems2.remove(i);
                    i--;
                }
            }
        }
        return rockets;
    }
}
