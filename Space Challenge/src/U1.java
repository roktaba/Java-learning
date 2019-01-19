public class U1 extends Rocket {

   public U1(){
       this.cost = 1000000;
       this.weight = 10000;
       this.maxWeight = 18000;

   }

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
