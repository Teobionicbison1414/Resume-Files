import java.util.Scanner;
/*Ideas: Enable users to control a "character" by pressing w a s d in 
 *       in order to increment values to get to the given setpoint
 */
public class KeyboardInput{
        private double startingX = 0.0;
        private double startingX2 = 0.0;
        private double startingY = 0.0;
        private double startingY2 = 0.0;
        private String name;
        private boolean errorFlag;
        private boolean errorFlag2;


    public int sum(int x, int y){
        int m_sum = x + y; 
        return m_sum;
    }
    public void setStartingPosition() {
        Scanner keyboard = new Scanner(System.in); 
        System.out.println("Enter your name: ");
        name = keyboard.nextLine();
        System.out.println("Your name is: " + name);
        System.out.println("Set your starting position: (x , y) ");
        System.out.println("Let's start with X");
        errorFlag = false;
        startingX = keyboard.nextDouble();
        if(startingX > 10 || startingX < 0){
            errorFlag = true;
        }
        if(errorFlag == true){
            System.out.println("You cannot proceed: value must be inside 0 - 10");
            System.out.println("Try again: ");
            startingX2 = keyboard.nextDouble();
            if(startingX2 <= 10 && startingX2 >= 0){
                System.out.println("Your X position is: " + startingX2);
            }
         }else {
            System.out.println("Your X position is: " + startingX);
        }
        System.out.println("Now, Let's set your Y value");
        startingY = keyboard.nextDouble();
        errorFlag2 = false;
        if(startingY > 10 || startingY < 0){
            errorFlag2 = true;
        }else if(errorFlag2 == true){
            System.out.println("You cannot proceed: value must be inside 0 - 10");
            System.out.println("Try again: ");
            startingY2 = keyboard.nextDouble();
            if(startingY2 <= 10 || startingY2 >= 0){
                System.out.println("Your Y position is: " + startingY2);
            }
        }
        else {
            System.out.println("Your Y position is: " + startingY);
            System.out.println("Your initial position is: ");
            if((errorFlag && errorFlag2) == true){
                System.out.println(startingX2 + "," + startingY2);
            }else if ((errorFlag && errorFlag2) == false){
                System.out.println(startingX + "," + startingY);
            }

        }  
    }

    public KeyboardInput(){}
    public static void main(String[] args){
    }
}