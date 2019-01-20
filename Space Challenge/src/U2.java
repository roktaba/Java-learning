public class U2 extends Rocket {

    public U2(){
        this.cost = 1200000;
        this.weight = 18000;
        this.maxWeight = 29000;

    }

    @Override
    public boolean launch(){
        double chance = 4* (weight/maxWeight);
        double isBoom = Math.random()*100+1;
        if (chance > isBoom){
            return true;
        } else return false;
    }

    @Override
    public boolean land() {
        double chance = 8* (weight/maxWeight);
        double isBoom = Math.random()*100+1;
        if (chance > isBoom){
            return true;
        } else return false;
    }
}
