//makes a random  for ints and boolean
public class Randomizer {
  public static int NumGen(){
       //instance of random class
      if (BooleanGen() == true){
        
        int min = 100000;
        int max = 199999;
        
        int rand_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        
        return rand_int;
        
        
      }else{
        int min = 200000;
        int max = 299999;

        int rand_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        
        
        return rand_int;}
      
  }
  public static  boolean BooleanGen() {
     boolean Gen = Math.random() < 0.5;

    return Gen;
  }
}