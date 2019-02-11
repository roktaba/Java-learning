public class Rocket implements SpaceShip {

    double cost;
    double weight;
    double maxWeight;

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public void carry(Item itemCarry) {
        weight = weight + itemCarry.getWeight();
    }

    @Override
    public boolean canCarry(Item itemCanCarry) {
        return !((weight + itemCanCarry.getWeight()) > maxWeight);
    }

    public double getCost() {
        return cost;
    }
}
