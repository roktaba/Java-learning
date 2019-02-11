public class U1 extends Rocket {

   public U1(){
       this.cost = 1000000;
       this.weight = 10000;
       this.maxWeight = 18000;

   }

    @Override
   public boolean launch(){
       double chance = 5* (weight/maxWeight);
       double isBoom = Math.random()*100+1;
        return chance > isBoom;
   }

    @Override
    public boolean land() {
        double chance = 1* (weight/maxWeight);
        double isBoom = Math.random()*100+1;
        return chance > isBoom;
    }

}
