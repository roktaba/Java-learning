import java.util.ArrayList;

public class SpaceChallenge {

    public static void main(String[] args) {
        Simulation phase1Simulation = new Simulation();
        ArrayList<Item> items = new ArrayList<>();
        items = phase1Simulation.loadItems("Phase-1.txt");
        ArrayList<Rocket> u1Rockets = new ArrayList<>();
        u1Rockets = phase1Simulation.loadU1(items);
    }
}
