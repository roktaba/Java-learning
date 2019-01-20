import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Simulation {
    public ArrayList<Item> loadItems(String text) {
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

    public ArrayList<Rocket> loadU1(ArrayList<Item> loadedItems) {
        ArrayList<Rocket> rockets = new ArrayList<>();
        int size = loadedItems.size();
        while (size > 0) {
            U1 u1 = new U1();
            rockets.add(u1);
            for (int i = 0; i < loadedItems.size(); i++) {
                if (rockets.get(rockets.size() - 1).canCarry(loadedItems.get(i)) && loadedItems.get(i).isLoaded() == false) {
                    rockets.get(rockets.size() - 1).carry(loadedItems.get(i));
                    loadedItems.get(i).setLoaded(true);
                    size--;
                }
            }
        }
        for (int i = 0; i < loadedItems.size(); i++) {
            loadedItems.get(i).setLoaded(false);
        }
        return rockets;
    }

    public ArrayList<Rocket> loadU2(ArrayList<Item> loadedItems) {
        ArrayList<Rocket> rockets = new ArrayList<>();
        int size = loadedItems.size();
        while (size > 0) {
            U2 u2 = new U2();
            rockets.add(u2);
            for (int i = 0; i < loadedItems.size(); i++) {
                if (rockets.get(rockets.size() - 1).canCarry(loadedItems.get(i)) && loadedItems.get(i).isLoaded() == false) {
                    rockets.get(rockets.size() - 1).carry(loadedItems.get(i));
                    loadedItems.get(i).setLoaded(true);
                    size--;
                }
            }
        }
        for (int i = 0; i < loadedItems.size(); i++) {
            loadedItems.get(i).setLoaded(false);
        }
        return rockets;
    }

    public double runSimulation (ArrayList<Rocket> rockets) {
        double budget = 0;
        for (int i = 0; i < rockets.size()-1; i++) {
            budget += rockets.get(i).getCost();
            while ((rockets.get(i).land()) || (rockets.get(i).launch())) {
                budget += rockets.get(0).getCost();
            }
        }
        return budget;
    }
}