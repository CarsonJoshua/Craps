public class CrapsDriver{
   public static void main(String[] args){
      Dice d = new Dice(2, 6);
      int pass = 0;
      boolean buttonOn = false;
      for(int c = 0; c < 100000; c++){
         d.roll();
         int pline = d.getValue();
         if(pline == 2 || pline == 3 || pline == 12)
            continue;
         if(pline == 7 || pline == 11){
            pass++;
            continue;
         }
         buttonOn = true;
         while(buttonOn){
            d.roll();
            if(d.getValue() == 7)
               buttonOn = false;
            if(d.getValue() == pline){
               pass++;
               buttonOn = false;
            }
         }
      }
      System.out.println("Wins: " + pass + "/100000\nPercent: " + (pass/1000.0) + "%");
   }
}