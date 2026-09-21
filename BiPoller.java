import java.util.Random;
import java.util.Scanner;

class BiPoller extends Variables {

    Scanner keyboard = new Scanner(System.in);
    Variables variable = new Variables();
    Random rand = new Random();
    String testName; 

    private int testchoice = 0;
    private char response;
    private int y_score = 0; 

    public void personalityTestprompt() {
        System.out.println("Welcome to the personality test. \n Please answer the following questions honestly.  \n Answer each question with a (Y / N):  \n Failure to comply will result in a reptition of a question and a penalty. \n Three penalties, and the program shuts down" );
    }

    public int scoring(int i){
         if(response == 'Y'){
                y_score += 1; 
            }else if(response == 'N'){
                y_score -= 1;
            }else{
                System.out.println("Invalid input. Please answer with Y or N.");
                i--; // Repeat the question
                if(i < 0) i = 0; // Ensure index doesn't go negative
            }
            return y_score;
    }

    public void personalitytest(){
        System.out.println("What test do you want to take? \n 1. Cognitive Style \n 2. Social Processing \n 3. Emotional Regulation \n 4. Motivation and Drive \n 5. Identity Structure \n 6. Behavioral Tendencies \n 7. Environmental Sensitivity \n 8. Cognitive Stability and Internal Architecture ");
        System.out.print("Enter the number of the test you want to take: ");
        testchoice = keyboard.nextInt();
        switch(testchoice){
            case 1:
                testName = "Cognitive Style";
                for(int i = 0; i < 25; i++){
                    System.out.println(variable.cognitivequestionlist(i));
                    response = keyboard.next().charAt(0);
                    response = Character.toUpperCase(response);
                    scoring(i);
                }
                if(18 <= y_score && y_score <= 25){
                    System.out.println("You are: " + variable.personalitytypes(0));
                }else if(0 <= y_score && y_score <= 8){
                    System.out.println("You are: " + variable.personalitytypes(1));
                }else{
                    System.out.println("You are: " + variable.personalitytypes(16));
                }
                System.out.println("Thank you for taking the " +  testName + " test! " + "Your score is: " + y_score);
                break;
            case 2:
                testName = "Social Processing";
                for(int i = 0; i < 25; i++){
                    System.out.println(variable.socialquestionlist(i));
                    response = keyboard.next().charAt(0);
                    response = Character.toUpperCase(response);
                    scoring(i);
                }
                if(18 <= y_score && y_score <= 25){
                    System.out.println("You are: " + variable.personalitytypes(2));
                }else if(0 <= y_score && y_score <= 8){
                    System.out.println("You are: " + variable.personalitytypes(3));
                }else{
                    System.out.println("You are: " + variable.personalitytypes(17));
                }
                System.out.println("Thank you for taking the " +  testName + " test! " + "Your score is: " + y_score);
                break;
            case 3:
                testName = "Emotional Regulation";
                for(int i = 0; i < 25; i++){
                    System.out.println(variable.emotionalquestionlist(i));
                    response = keyboard.next().charAt(0);
                    response = Character.toUpperCase(response);
                    scoring(i);
                }
                if(18 <= y_score && y_score <= 25){
                    System.out.println("You are: " + variable.personalitytypes(4));
                }else if(0 <= y_score && y_score <= 8){
                    System.out.println("You are: " + variable.personalitytypes(5));
                }else{
                    System.out.println("You are: " + variable.personalitytypes(18));
                }
                System.out.println("Thank you for taking the " +  testName + " test! " + "Your score is: " + y_score);
                break;
            case 4:
                testName = "Motivation and Drive";
                for(int i = 0; i < 25; i++){
                    System.out.println(variable.motivationquestionlist(i));
                    response = keyboard.next().charAt(0);
                    response = Character.toUpperCase(response);
                    scoring(i);
                }
                if(18 <= y_score && y_score <= 25){
                    System.out.println("You are: " + variable.personalitytypes(6));
                }else if(0 <= y_score && y_score <= 8){
                    System.out.println("You are: " + variable.personalitytypes(7));
                }else{
                    System.out.println("You are: " + variable.personalitytypes(19));
                }
                System.out.println("Thank you for taking the " +  testName + " test! " + "Your score is: " + y_score);
                break;
            case 5:
                testName = "Identity Structure";
                for(int i = 0; i < 25; i++){
                    System.out.println(variable.identityquestionlist(i));
                    response = keyboard.next().charAt(0);
                    response = Character.toUpperCase(response);
                    scoring(i);
                }
                if(18 <= y_score && y_score <= 25){
                    System.out.println("You are: " + variable.personalitytypes(8));
                }else if(0 <= y_score && y_score <= 8){
                    System.out.println("You are: " + variable.personalitytypes(9));
                }else{
                    System.out.println("You are: " + variable.personalitytypes(20));
                }
                System.out.println("Thank you for taking the " +  testName + " test! " + "Your score is: " + y_score);
                break;
            case 6:
                testName = "Behavioral Tendencies";
                for(int i = 0; i < 25; i++){
                    System.out.println(variable.behaviorquestionlist(i));
                    response = keyboard.next().charAt(0);
                    response = Character.toUpperCase(response);
                    scoring(i);
                }
                if(18 <= y_score && y_score <= 25){
                    System.out.println("You are: " + variable.personalitytypes(10));
                }else if(0 <= y_score && y_score <= 8){
                    System.out.println("You are: " + variable.personalitytypes(11));
                }else{
                    System.out.println("You are: " + variable.personalitytypes(21));
                }
                System.out.println("Thank you for taking the " +  testName + " test! " + "Your score is: " + y_score);
                break;
            case 7:
                testName = "Environmental Sensitivity";
                for(int i = 0; i < 25; i++){
                    System.out.println(variable.environmentquestionlist(i));
                    response = keyboard.next().charAt(0);
                    response = Character.toUpperCase(response);
                    scoring(i);
                }
                if(18 <= y_score && y_score <= 25){
                    System.out.println("You are: " + variable.personalitytypes(12));
                }else if(0 <= y_score && y_score <= 8){
                    System.out.println("You are: " + variable.personalitytypes(13));
                }else{
                    System.out.println("You are: " + variable.personalitytypes(22));
                }
                System.out.println("Thank you for taking the " +  testName + " test! " + "Your score is: " + y_score);
                break;
            case 8:
                testName = "Cognitive Stability and Internal Architecture";
                for(int i = 0; i < 25; i++){
                    System.out.println(variable.cognitivearchitecturequestionlist(i));
                    response = keyboard.next().charAt(0);
                    response = Character.toUpperCase(response);
                    scoring(i);
                }
                if(18 <= y_score && y_score <= 25){
                    System.out.println("You are: " + variable.personalitytypes(14));
                }else if(0 <= y_score && y_score <= 8){
                    System.out.println("You are: " + variable.personalitytypes(15));
                }else{
                    System.out.println("You are: " + variable.personalitytypes(23));
                }
                System.out.println("Thank you for taking the " +  testName + " test! " + "Your score is: " + y_score);
                break;
            default:
                System.out.println("Invalid choice. Please select a number between 1 and 8.");
        }
    }

    public static void main(String[] args){
        BiPoller ha = new BiPoller();
        ha.personalityTestprompt();
        ha.personalitytest();
        
    }
}