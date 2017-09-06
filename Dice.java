public class Dice{
   private Die[] dice;
   public Dice(int amount, int sides){
      if(amount < 1){
         amount = 1;
      }
      dice = new Die[amount];
      for(int i = 0; i < dice.length; i++){
         dice[i] = new Die(sides);
      }
//       for(Die d: dice){
//          d = new Die(sides);
//       }    //this didn't work because there is no Die in dice yet. duh.
   }
   public int getValue(){
      int sum = 0;
      for(Die d:dice){
         sum += d.getValue();
      }
      return sum;
   }
   public void roll(){
      for(Die d:dice){
         d.roll();
      }
   }
   public String toString(){
      String s = Integer.toString(dice[1].getValue());
      for(int i = 1; i < dice.length; i++){
         s += ":" + dice[i].getValue();
      }
      s += " = " + getValue();
      return s;
   }
}