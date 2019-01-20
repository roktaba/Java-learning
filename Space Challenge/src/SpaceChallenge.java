import java.util.ArrayList;
import java.util.Collections;

public class SpaceChallenge {

    public static void main(String[] args) {
        Simulation phase1Simulation = new Simulation();
        ArrayList<Item> items;
        items = phase1Simulation.loadItems("Phase-1.txt");
        Collections.sort(items);
        ArrayList<SpaceShip> u1Rockets = new ArrayList<>();
        u1Rockets = phase1Simulation.loadU1(items);
        ArrayList<SpaceShip> u2Rockets = new ArrayList<>();
        u2Rockets = phase1Simulation.loadU2(items);
    }
}
