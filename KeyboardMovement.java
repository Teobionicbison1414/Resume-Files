import java.util.Scanner;

    public class KeyboardMovement {

        private int i = 0;

        private double startingmax = 10;
        private double startingmin = 0.0;
        private double startingX = 0.0;
        private double startingY = 0.0;
        private double mastervalueX = 10.0;
        private double mastervalueY = 2.0;
        private double movespeed = 0.0;
        private double movespeeeed = movespeed + 1.0;
        private double maxmoves = 0.0;
        private String moveme;
        private String name;
        
        Scanner keyboard = new Scanner(System.in);
        Scanner keyboard2 = new Scanner(System.in);
        Scanner keyboard3 = new Scanner(System.in);

    public void setstartingx(){
        startingX = keyboard.nextDouble();
    }

    public void setstartingy(){
        startingY = keyboard.nextDouble();
    }

    public void setmoves(){
        maxmoves = keyboard.nextDouble();
    }

    public void setmovespeed(){
        movespeed = keyboard.nextDouble();
    }

    public void settask(){
        System.out.println("Enter Your Name");
        name = keyboard.nextLine();
        System.out.println("Your task is to get to point (10, 2) in under 10 moves ");
        System.out.println("by incrementing your starting position with your own increment");
        System.out.println("value and your starting position that you will set");
        System.out.println(" ");
        System.out.println(name + " , " + "please follow the directions as follows");
    }

    public void myMovement(){
        settask();
        setStartingXwithcheck();
        setStartingYwithcheck();
        System.out.println("Set how many moves you want");
        setmoves();
        System.out.println("Your maximum amount of moves is " + maxmoves);
        System.out.println("Set your move speed");
        setmovespeed();
        System.out.println("Your move speed is:" + movespeed);
        System.out.println("Use W A S D or w a s d to control the movemnt of your point");
        System.out.println("Just so you know, the capital letter inputs equal whatever your set value is, plus 1");
        System.out.println("type the word: 'exit' to close out of the system");
        while(i <= maxmoves){
            System.out.println("X: " + startingX + "Y: " + startingY + "Your moves : " + i);
            moveme = keyboard.nextLine();
            switch(moveme){
                case "w":
                    startingY += movespeed;
                break;
                case "W":
                    startingY += movespeeeed;
                break;
                case "a":
                    startingX -= movespeed;
                break;
                case "A":
                    startingX -= movespeeeed;
                break;
                case "s":
                    startingY -= movespeed;
                break;
                case "S":
                    startingY -= movespeeeed;
                break;
                case "d":
                    startingX += movespeed;
                break;
                case "D":
                    startingX += movespeeeed;
                break;
                case "exit":
                    System.exit(0);
                break;
            }
            if((i <= maxmoves) && (startingX == mastervalueX) && (startingY == mastervalueY)){
                System.out.println("X: " + startingX + "Y: " + startingY);
                System.out.println("Congratulations " + name + ", you have successfully completed my code.");
            }else if((i == maxmoves) && (startingX != mastervalueX) && (startingY != mastervalueY)){
                System.out.println("X: " + startingX + "Y: " + startingY);
                System.out.println(name + ", GAME OVER.");
            }else if((i == maxmoves) && (startingX == mastervalueX) && (startingY != mastervalueY)){
                System.out.println("X: " + startingX + "Y: " + startingY);
                System.out.println(name + ", GAME OVER.");
            }else if((i == maxmoves) && (startingX != mastervalueX) && (startingY == mastervalueY)){
                System.out.println("X: " + startingX + "Y: " + startingY);
                System.out.println(name + ", GAME OVER.");
            }
            i += 1;
        }
    }

    public void finalfunction(){
        System.out.println("Your initial position is: " + "X: " + startingX + "Y: " + startingY);
    }

    public void setStartingXwithcheck(){
        System.out.println("Set your X quardinate:");
        System.out.println("Just so you know, your X coordinate has to be below " + startingmax + " , and above " + startingmin);
        setstartingx();
        if(startingX > startingmax){
            System.out.println("your value is too high");
            System.out.println("please change your value");
            setstartingx();
            if(startingX > startingmax){
                System.out.println("come on man, how hard is it to follow directions");
                System.exit(0);
            }else if(startingX < startingmin){
                System.out.println("come on man, how hard is it to follow directions");
                System.exit(0);
            }
        }else if(startingX < startingmin){
            System.out.println("your value is too low");
            System.out.println("please change your value");
            setstartingx();
            if(startingX > startingmax){
                System.out.println("come on man, how hard is it to follow directions");
                System.exit(0);
            }else if(startingX < startingmin){
                System.out.println("come on man, how hard is it to follow directions");
                System.exit(0);
            }
        }else System.out.println("X: " + startingX);
    }

    public void setStartingYwithcheck(){
        System.out.println("Set your Y quardinate:");
        System.out.println("Just so you know, your Y coordinate has to be below " + startingmax + " , and above " + startingmin);
        setstartingy();
        if(startingY > startingmax){
            System.out.println("your value is too high");
            System.out.println("please change your value");
            setstartingy();
            if(startingY > startingmax){
                System.out.println("come on man, how hard is it to follow directions");
                System.exit(0);
            }else if(startingY < startingmin){
                System.out.println("come on man, how hard is it to follow directions");
                System.exit(0);
            }
        }else if(startingY < startingmin){
            System.out.println("your value is too low");
            System.out.println("please change your value");
            setstartingy();
            if(startingY > startingmax){
                System.out.println("come on man, how hard is it to follow directions");
                System.exit(0);
            }else if(startingY < startingmin){
                System.out.println("come on man, how hard is it to follow directions");
                System.exit(0);
            }
        }else System.out.println("Y: " + startingY);
    }
}
