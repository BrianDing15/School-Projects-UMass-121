public class relCheckTest{
   public static void main(String[] args){
   
      //TEST 1: Check for Transitive Relation (True)
      int[][] testOneMatrix = new int[][] { {0,1,0,1},
                                            {0,0,0,0},
                                            {0,0,0,0},
                                            {0,1,0,0} };
   
      relCheck testOne = new relCheck(testOneMatrix);
      
      if(testOne.checkTransitive() == true){
         System.out.println("Test One Passed, checkTransitive() == True.");
      }
      else{
         System.out.println("Test One Failed, logic is incorrect.");
      }
      
      //TEST 2: Check for Transitive Relation (False)
      int[][] testTwoMatrix = new int[][] { {0,1,0,0},
                                            {0,0,0,1},
                                            {0,0,0,0},
                                            {0,1,0,0} };
                                            
      relCheck testTwo = new relCheck(testTwoMatrix);
   
      if(testTwo.checkTransitive() == false){
         System.out.println("Test Two Passed, checkTransitive() == False.");
      }
      else{
         System.out.println("Test Two Failed, logic is incorrect.");
      }
      
      //TEST 3: Check for Reflexive Relation (True)
      int[][] testThreeMatrix = new int[][] { {1,0,0,0}, 
                                              {0,1,0,0}, 
                                              {0,0,1,0}, 
                                              {0,0,0,1} };
                                              
      relCheck testThree = new relCheck(testThreeMatrix);
   
      if(testThree.checkReflexive() == true){
         System.out.println("Test Three Passed, checkReflexive() == True.");
      }
      else{
         System.out.println("Test Three Failed, logic is incorrect.");
      }
      
      //TEST 4: Check for Reflexive Relation (False)
      int[][] testFourMatrix = new int[][] { {1,0,0,0}, 
                                             {0,0,1,0}, 
                                             {0,0,1,0}, 
                                             {0,0,0,1} };
                                           
      relCheck testFour = new relCheck(testFourMatrix);
      
      if(testFour.checkReflexive() == false){
         System.out.println("Test Four Passed, checkReflexive() == False.");
      }
      else{
         System.out.println("Test Four Failed, logic is incorrect.");
      }
      
      //TEST 5: Check for Antisymmetric Relation (True)
      int[][] testFiveMatrix = new int[][] { {1,0,0,0}, 
                                             {0,0,0,0}, 
                                             {0,0,0,0}, 
                                             {0,0,0,0} };
                                           
      relCheck testFive = new relCheck(testFiveMatrix);
      
   
      if(testFive.checkAntisymmetric() == true){
         System.out.println("Test Five Passed, checkAntisymmetric() == True.");
      }
      else{
         System.out.println("Test Five Faild, logic is incorrect.");
      }
      
      //TEST 6: Check for Antisymmetric Relation (False)
      int[][] testSixMatrix = new int[][] { {1,0,1,0},
                                            {0,1,0,0},
                                            {1,0,1,0},
                                            {0,0,0,1} };
                                           
      relCheck testSix = new relCheck(testSixMatrix);
      
      if(testSix.checkAntisymmetric() == false){
         System.out.println("Test Six Passed, checkAntisymmetric() == False.");
      }
      else{
         System.out.println("Test Six Failed, logic is incorrect.");
      }
      
      //TEST 7: Check for Complete Order (True).
      int[][] testSevenMatrix = new int[][] { {1,0,1,0,0,1},
                                              {0,1,0,0,0,0},
                                              {0,0,1,0,0,1},
                                              {0,0,0,1,0,0},
                                              {0,1,1,0,1,1},
                                              {0,0,0,0,0,1} };

                                           
      relCheck testSeven = new relCheck(testSevenMatrix);
   
      if(testSeven.checkCompleteOrder() == true){
         System.out.println("Test Seven Passed, checkCompleteOrder() == True.");
      }
      else{
         System.out.println("Test Seven Failed, logic is incorrect.");
      }
   }
}