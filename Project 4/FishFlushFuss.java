/**
* 
* @author Brian Ding
* @version 1.0
*/

public class FishFlushFuss {
 
   /**
   * fish - the value of Fish
     flush - the value of Flush
     fuss - the value of Fuss
   */
   
   private int fish;
   private int flush;
   private int fuss;
   
   
   /**
   * Constructor to store Fish Flush and Fuss Values
   * @param fishValue - The value assigned to Fish
   * @param flushValue - The value assigned to Flush 
   * @param fussValue - The value assigned to Fuss
   */
    
   /*  The constructor takes in three ints,
   *  which must be assigned to their instance variables and initialized.
   */
   
   
   public FishFlushFuss(int fishValue, int flushValue, int fussValue){
      fish = fishValue;
      flush = flushValue;
      fuss = fussValue;
   }
   
   /**
   * plays a single round of Fish Flush Fuss
   * @param round - the current round of the game of fish flush fuss
   * @return - String result for the specific round
   */ 
     
   /* playRound() is a helper method for playGame(). 
   *  It takes an int parameter representing the 
   *  current round of play, and returns the 
   *  String result for that specific round only.
   */
   
   public String playRound(int round){
   
      String result = "";
      
      if((round % getFish() == 0) && (round % getFlush() == 0) && (round % getFuss() == 0)){
         result = "Flamingo";
      }
      
      else if(round % getFish() == 0 && round % getFlush() == 0){
         if(getFish() > getFlush()){
            result = "Fish";
         }
         else if(getFlush() > getFish()){
            result = "Flush";
         }
      }
      
      else if(round % getFish() == 0 && round % getFuss() == 0){
         if(getFish() > getFuss()){
            result = "Fish";
         }
         else if(getFuss() > getFish()){
            result = "Fuss";
         }
      } 
      
      else if(round % getFlush() == 0 && round % getFuss() == 0){
         if(getFlush() > getFuss()){
            result = "Flush";
         }
         else if(getFuss() > getFlush()){
            result = "Fuss";
         }
      }
      
      else if(round % getFish() == 0){
         result = "Fish";
      }
      
      else if(round % getFlush() == 0){
         result = "Flush";
      }
      
      else if(round % getFuss() == 0){
         result = "Fuss";
      }
      
      else{
         result = Integer.toString(round);
      }
      
      return result;
   }
   
   /**
   * Plays a game of Fish Flush Fuss using playRound()
   * @param rounds - The number of rounds
   * @return - The results of the game of Fish Flush Fuss
   */ 
   
   public String playGame(int rounds){
   
      String result = "";
   
      for(int i = 1; i <= rounds; ++i){
         result = result + "Round " + i + ": " + playRound(i) + "\n";
      }
      
      return result;
   
   }
      
      //Loop through the rounds of the game
         //call playRound to handle the specific round
      //return the total aggregated game results
   
   /**
   * Returns the value of Fish
   * @return - value of Fish
   */ 
   
   public int getFish(){
      return fish;
   }
   
   /**
   * Returns the value of Flush
   * @return - value of Flush
   */ 
    
   public int getFlush(){
      return flush;
   }
   
   /**
   * Returns the value of Fuss
   * @return - value of Fuss
   */ 
     
   public int getFuss(){
      return fuss;
   }
   
} //end class

