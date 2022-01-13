/**
* @author Brian Ding
* @version 1.0
*/

public class relCheck{

   //matrix - The stored matrix.
   private static int[][] matrix = new int[1][1];

   //Constructor to store the matrix.
   public relCheck(int[][] matrix){
      this.matrix = matrix;
   }
   
   //Checks to see if the matrix is a transitive relation, returns true or false.
   public static boolean checkTransitive(){
      for(int i = 0; i < matrix.length; ++i){
          for(int j = 0; j < matrix.length; ++j){
         //Check for relation between row "i" and column "j"
            if(matrix[i][j] == 1){
               for(int k = 0; k < matrix.length; ++k){
               //Check for relation between row "j" and column "k"
               //AND if there is no relation betweek "i" and "k", return false
                  if(matrix[j][k] == 1 && matrix[i][k] != 1){
                     return false;
                  }
               }
            }
         }
      }
      return true;
   }
   
   //Checks to see if the matrix is a reflexive relation, returns true or false.
   public static boolean checkReflexive(){
      for(int i = 0; i < matrix.length; ++i){
         //If there is no relation between row "i" and column "i", return false
         if (matrix[i][i] != 1){
            return false;
         }
      } 
      return true;
   }
   
   //Checks to see if the matrix is an antisymmetric relation, returns true or false.
   public static boolean checkAntisymmetric(){
      for(int i = 0; i < matrix.length; ++i){
         for(int j = 0; j < matrix.length; ++j){
            //Check for relation between row "i" and column "j", AND row "j" and column "i".
            if (matrix[i][j] == 1 && matrix[j][i] == 1){
               if (i != j){
                  return false;
               }
            }
         }
      }
      return true;
   }

   //Checks to see if the matrix is a Complete Order (checkTransitive() == true, checkReflexive() == true, checkAntisymmetric() == true).
   //Returns true or false.
   public static boolean checkCompleteOrder(){
      if(checkTransitive() == true && checkReflexive() == true && checkAntisymmetric() == true){
         return true;
      }
      else{
         return false;
      }
   } 
}
