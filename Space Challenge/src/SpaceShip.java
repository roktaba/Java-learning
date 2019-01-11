public interface SpaceShip {
    boolean launch();
    boolean land();
    boolean canCarry(Item itemCanCarry);
    int carry(Item itemCarry);
}
