public class Rocket implements SpaceShip {
    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public int carry(Item itemCarry) {
        return 0;
    }

    @Override
    public boolean canCarry(Item itemCanCarry) {
        return false;
    }
}
