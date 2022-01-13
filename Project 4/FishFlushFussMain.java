import java.util.*;

public class FishFlushFussMain{

   public static void main(String[] args){
      
      // The scanner we will be using to accept user input
      Scanner scan = new Scanner(System.in);
     /*  Initializing fish, flush, fuss, and round to invalid values to cause them
      *  to enter their respective User Input loops.
      */
      int fish = -1;
      int flush = -1;
      int fuss = -1;
      int rounds = -1;
      
      // Our FishFlushFuss object
      FishFlushFuss scp;
      
      // Capture user input for fish, while also ensuring correctness
      System.out.println("Enter an integer for your fish number.");
      while(fish < 0){
         System.out.println("Please enter a number greater than zero:");
         try{
            fish = Integer.parseInt(scan.nextLine());
         } catch (Exception e) {
            System.out.println("That is not a valid number. Please enter an integer greater than zero.");
         }
      }
      
      // Capture user input for flush, while also ensuring correctness
      System.out.println("Enter an integer for your flush number.");
      while(flush < 0){
         System.out.println("Please enter a number greater than zero that is not equal to the fish number:");
         try{
            flush = Integer.parseInt(scan.nextLine());
            if(flush == fish) {
               System.out.println("Input invalid. Make sure that this number is not equal to the fish number.");
               flush = -1;
            }
         } catch(Exception e) {
            System.out.println("That is not a valid number. Please enter an integer greater than zero.");
         }
      }
      
      // Capture user input for fuss, while also ensuring correctness
      System.out.println("Enter an integer for your fuss number.");
      while(fuss < 0){
         System.out.println("Please enter a number greater than zero that is not equal to the fish or flush number:");
         try{
            fuss = Integer.parseInt(scan.nextLine());
            if(fuss == fish || fuss == flush) {
               System.out.println("Input invalid. Make sure that this number is not equal to the fish or flush number.");
               fuss = -1;
            }
         } catch(Exception e) {
            System.out.println("That is not a valid number. Please enter an integer greater than zero.");
         }
      }
      
      // Initializing our FishFlushFuss object with the values we just obtained from the user
      scp = new FishFlushFuss(fish, flush, fuss);
      
      // Capture user input for rounds, while also ensuring correctness 
      System.out.println("How many rounds would you like to play?");
      while(rounds < 0){
         System.out.println("Please enter a number greater than zero:");
         try{
            rounds = Integer.parseInt(scan.nextLine());
         } catch(Exception e) {
            System.out.println("That is not a valid number. Please enter an integer greater than zero.");
         }
      }
      
      // Printing results
      System.out.println("Results:");
      System.out.println(scp.playGame(rounds));
   
   }

}