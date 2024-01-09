 import java.util.Random;

public class Computer{
    
            private int mode;
            private int choice;
            
            public Computer(int m){
            mode = m;
            choice = -1;

            }
            
            public void move(int marblesLeft){ 
                
            if(mode==1){
                    
            if(marblesLeft>=64){

            choice = marblesLeft - 63;

            } else if(marblesLeft>=32 && marblesLeft<64){
                
            choice = marblesLeft - 31;

            } else if (marblesLeft>=16 && marblesLeft<32){
                    
                choice = marblesLeft - 15;

            } else if (marblesLeft>=8 && marblesLeft<16){
                    
                    choice = marblesLeft - 7;

            } else if (marblesLeft>=4 && marblesLeft<8){
                    
                    choice = marblesLeft - 3;

            } else {

                Random rand = new Random();
                switch(marblesLeft){
                
                case 2: choice = 1;
                case 3: choice = 1;

                break;

                case 7: choice = 1 + rand.nextInt(3);

                break;

                case 15: choice = 1 + rand.nextInt(7);

                break;

                case 31: choice = 1 + rand.nextInt(15);

                break;

                case 63: choice = 1 + rand.nextInt(32);

                break;
            }
            }
            } else {

                Random numMarbles = new Random();
                
                choice = 1 + numMarbles.nextInt(marblesLeft/2);

            }
        
            }
    
            public int getChoice(){

            return choice;

            }   
    
    
            }
