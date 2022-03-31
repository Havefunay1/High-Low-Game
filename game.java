import java.util.*;

public class game {
    
    public static void main(String[] args) {
        
        System.out.println("""
                           |    Hello!  |
                      This program is a game called
                           "High Low Game"
                      The computer will roll 5 die
                       and you will guess if the 
                           next roll will be
                            lower or higher\n\n\n""");
        
        Scanner keyboard = new Scanner(System.in);
        Random randGen = new Random();
        String start;
        String loops = "l";
        boolean ends = true;
        
        
        int point = 0;
        int die_1 = 0;
        int die_2 = 0;
        int die_3 = 0;
        int die_4 = 0;
        int die_5 = 0;
        
        int die2_1 = 0;
        int die2_2 = 0;
        int die2_3 = 0;
        int die2_4 = 0;
        int die2_5 = 0;
        
        String prompt = "Would you like to start\n"
                      + "the game?\n\n"
                      + "Y/N--->";
        System.out.print(prompt);
        start = keyboard.next();
        
        if ("y".equals(start)||"Y".equals(start)){
            while (ends){
                die_1 = randGen.nextInt(1, 7);
                die_2 = randGen.nextInt(1, 7);
                die_3 = randGen.nextInt(1, 7);
                die_4 = randGen.nextInt(1, 7);
                die_5 = randGen.nextInt(1, 7);
                int total = die_1 + die_2 + die_3 + die_4 + die_5;

                die2_1 = randGen.nextInt(1, 7);
                die2_2 = randGen.nextInt(1, 7);
                die2_3 = randGen.nextInt(1, 7);
                die2_4 = randGen.nextInt(1, 7);
                die2_5 = randGen.nextInt(1, 7);
                int total2 = die2_1 + die2_2 + die2_3 + die2_4 + die2_5;

                String game_prompt2 = "\n\nThe following values were rolled:\n"
                                    + "Die 1 --> "+die2_1+"\n"
                                    + "Die 2 --> "+die2_2+"\n"
                                    + "Die 3 --> "+die2_3+"\n"
                                    + "Die 4 --> "+die2_4+"\n"
                                    + "Die 5 --> "+die2_5+"\n";

                String game_prompt = "\n\nThe following values were rolled:\n"
                                   + "Die 1 --> "+die_1+"\n"
                                   + "Die 2 --> "+die_2+"\n"
                                   + "Die 3 --> "+die_3+"\n"
                                   + "Die 4 --> "+die_4+"\n"
                                   + "Die 5 --> "+die_5+"\n";
                System.out.print(game_prompt);
                System.out.print("Which totals to "+total+"\n\n");

                System.out.print("Enter:\n"
                                 + "H if you think your roll will be higher or\n"
                                 + "L if you think your roll wil be lower\n"
                                 + "Point: "+point+"\n\n"
                                 + "-->");
                String inputGuess = keyboard.next();

                System.out.println(game_prompt2);
                System.out.println("Which totals to "+total2+"\n\n");

                if ("l".equals(inputGuess)||"L".equals(inputGuess)){

                    if (total > total2){
                        System.out.println("You called \"lower\" correctly and scored 1 point!");
                        point += 1;
                    }
                    else
                        System.out.println("You called \"lower\" incorrectly");
                }
                else if ("h".equals(inputGuess)||"H".equals(inputGuess)){
                    
                    if (total < total2){
                        System.out.println("You called \"higher\" correctly and scored 1 point!");
                        point += 1;
                    }
                    else{
                        
                        System.out.println("You called \"higher\" incorrectly");
                    }   
                }
            
                System.out.println("\n\nEnter \"S\" for another round\n"
                                 + "Enter \"X\" to close the program\n\n");
                loops = keyboard.next();
                
                if ("x".equals(loops)||"X".equals(loops)){
                    
                    ends = false;
                }
            }
        System.out.println("You got a total of "+point+" points!");
        System.out.println("\nAlright!\nTerminating Program!\n\n\n");
        } 
    }
}
