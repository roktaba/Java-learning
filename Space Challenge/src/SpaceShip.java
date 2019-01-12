public interface SpaceShip {
    boolean launch();
    boolean land();
    boolean canCarry(Item itemCanCarry);
    void carry(Item itemCarry);
}
