public class Rocket implements SpaceShip {

    private int cost =  0;
    private int weight = 0;
    private int maxWeight = 0;

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
        if ((weight+itemCanCarry.getWeight())>maxWeight) {
            return false;
        } else return true;
    }
}
