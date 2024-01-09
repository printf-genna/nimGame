import java.util.Scanner;

       public class Human{
    
   
        private int choice; // how many marbles to take
        private Scanner input;
        
        public Human(){

            input= new Scanner(System.in);
            choice = -1;

        }
    
        public void move(int marblesLeft){
        
            System.out.println(" Take your marbles: ");   

            choice = input.nextInt(); 
            while(choice < 1 ||choice > marblesLeft/2){

            System.out.println("Invalid, choose another number. ");
            choice = input.nextInt();
        
             }

          
          }
          public int getChoice(){

             return choice;

          }
        
          }
    
    

          
    
    
          
