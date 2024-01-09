import java.util.Random;
        public class Nim{
        
        private int marbles;
        private Human humanPlayer;
        private Computer computerPlayer;
        
        public Game(int difficulty){

            computerPlayer = new Computer(difficulty);

            humanPlayer = new Human();

            marbles = -1;

            }
        
        
        public void play(){
            Random generator = new Random();

            marbles = 1 + generator.nextInt(100);

            if (marbles<10){
                
                marbles = marbles*10;
            }

                int firstPlayer = 1 + generator.nextInt(2);

                System.out.println("Your initial number of marbles is " + marbles);
            

            while (marbles>0) { 
                if (firstPlayer == 1){

                System.out.println("Your turn! ");

                humanPlayer.move(marbles);

                marbles = marbles - humanPlayer.getChoice();

                if(marbles == 1){

                System.out.println("YOU WIN!!! Go celebrate :)");
                break;
                }

                computerPlayer.move(marbles);
                marbles = marbles - computerPlayer.getChoice();
                 if(marbles == 1){

                System.out.println("Computer Wins... Loser..");
                break;
                }

                System.out.println("Your adversary took " + computerPlayer.getChoice() 
                + "  There are " + marbles + " marbles left!");


             } else if (firstPlayer==2){

                System.out.println("Computer's turn..");

                computerPlayer.move(marbles);

                marbles = marbles - computerPlayer.getChoice();

                if(marbles == 1){

                System.out.println("Computer Wins...Loser.. ");
                break;

             }

                System.out.println("Your adversary took " + computerPlayer.getChoice() 
                + "  There are " + marbles+ " marbles left!");
                System.out.println("Your turn! ");

                humanPlayer.move(marbles);

                marbles = marbles - humanPlayer.getChoice();
                if(marbles == 1){

                System.out.println("YOU WIN!!! Go celebrate :) ");
                break;

             }
                
               
                
             }

             } 
            
        
             }
             }
             
        
