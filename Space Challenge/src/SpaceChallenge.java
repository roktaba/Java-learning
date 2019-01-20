import java.util.ArrayList;
import java.util.Collections;

public class SpaceChallenge {

    public static void main(String[] args) {
        Simulation phase1Simulation = new Simulation();
        ArrayList<Item> items;
        items = phase1Simulation.loadItems("Phase-1.txt");
        Collections.sort(items);
        ArrayList<Rocket> u1Rockets;
        u1Rockets = phase1Simulation.loadU1(items);
        ArrayList<Rocket> u2Rockets;
        u2Rockets = phase1Simulation.loadU2(items);
        double p1U1Budget = phase1Simulation.runSimulation(u1Rockets);
        double p1U2Budget = phase1Simulation.runSimulation(u2Rockets);
        System.out.println("Phase-1 Budget for U1 Rockets = "+p1U1Budget);
        System.out.println("Phase-1 Budget for U2 Rockets = "+p1U2Budget);
    }
}
