public class U1 extends Rocket {
   final int cost =  1000000;
   int weight = 10000;
   final int maxWeight = 18000;

    @Override
   public boolean launch(){
       double chance = 0.05* (weight/maxWeight);
       double isBoom = Math.random()*101;
       if (chance > isBoom){
           return true;
       } else return false;
   }

    @Override
    public boolean land() {
        double chance = 0.01* (weight/maxWeight);
        double isBoom = Math.random()*101;
        if (chance > isBoom){
            return true;
        } else return false;
    }
}
