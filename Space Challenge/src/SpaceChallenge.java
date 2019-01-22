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

        ArrayList<Item> items2;
        items2 = phase1Simulation.loadItems("Phase-2.txt");
        Collections.sort(items2);
        ArrayList<Rocket> u1Rockets2;
        u1Rockets2 = phase1Simulation.loadU1(items2);
        ArrayList<Rocket> u2Rockets2;
        u2Rockets2 = phase1Simulation.loadU2(items2);
        double p2U1Budget = phase1Simulation.runSimulation(u1Rockets2);
        double p2U2Budget = phase1Simulation.runSimulation(u2Rockets2);

        System.out.println("Phase-1 Budget for U1 Rockets = "+p1U1Budget);
        System.out.println("Phase-1 Budget for U2 Rockets = "+p1U2Budget);
        System.out.println("Phase-2 Budget for U1 Rockets = "+p2U1Budget);
        System.out.println("Phase-2 Budget for U2 Rockets = "+p2U2Budget);
        double totalU1Budget = p1U1Budget + p2U1Budget;
        System.out.println("Total Budget for U1 Rockets = "+ totalU1Budget);
        double totalU2Budget = p1U2Budget + p2U2Budget;
        System.out.println("Total Budget for U2 Rockets = "+ totalU2Budget);
    }
}
