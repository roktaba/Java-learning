public class U2 extends Rocket {
    final int cost =  1200000;
    int weight = 18000;
    final int maxWeight = 29000;


    @Override
    public boolean launch(){
        double chance = 0.04* (weight/maxWeight);
        double isBoom = Math.random()*101;
        if (chance > isBoom){
            return true;
        } else return false;
    }

    @Override
    public boolean land() {
        double chance = 0.08* (weight/maxWeight);
        double isBoom = Math.random()*101;
        if (chance > isBoom){
            return true;
        } else return false;
    }
}
