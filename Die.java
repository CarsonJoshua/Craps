public class Die{
   private int s;//number of sides
   private int v;//value of die
   public Die(int s){
      if(s<1){
         s = 1;
      }
      this.s = s;
      this.v = 1;
   }
   public int getSides(){
      return s;
   }
   public void setSides(int s){
      this.s = s;
   }
   public int getValue(){
      return v;
   }
   public void setValue(int v){
      this.v = v;
   }
   public void roll(){
      v = (int)(Math.random() * s) + 1;
   }
   public String toString(){
      return v + "/" + s;
   }
}