package headfirst.sink_game.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by OMAR on 12/15/2017.
 */
public class DotComBust {
    public static GameHelper  helper= new GameHelper();
//    public static Scanner scanner = new Scanner(System.in);
    ArrayList<EnhancedDotComGame> DotComList = new ArrayList<EnhancedDotComGame>();
    int numOfGusses;
    /*
    * make three DotCom objects
    *create three DotComs objects
    * Add the DotComs to the array list
    */
    public void setUpGame(){
        EnhancedDotComGame enhancedDotComGame1 = new EnhancedDotComGame();
        enhancedDotComGame1.setDotCom("Pets.com");
        EnhancedDotComGame enhancedDotComGame2 = new EnhancedDotComGame();
        enhancedDotComGame2.setDotCom("eToys.com");
        EnhancedDotComGame enhancedDotComGame3 = new EnhancedDotComGame();
        enhancedDotComGame3.setDotCom("Go2.com");
        DotComList.add(enhancedDotComGame1);
        DotComList.add(enhancedDotComGame2);
        DotComList.add(enhancedDotComGame3);
        System.out.println("your goal is to sink 3 dotComs");
        System.out.println("Pets.com eToys.com Go2.com");
        System.out.println("try to guess 'em in fewest number of guesses");
        for (EnhancedDotComGame dotComGame : DotComList){
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComGame.setLocation_cells(newLocation);
        }
    }

    public void StartPlaying(){
        while (!DotComList.isEmpty()){
            String userGuess = helper.getUserInput("Enter guess: ");
            CheckUserGuess(userGuess);
        }
    }
    public void CheckUserGuess(String userGuess){
        numOfGusses++;
        String result = "miss";
        for (EnhancedDotComGame test : DotComList){
            result = test.check_values(userGuess);
            if(result.equals("hit")){
                break;
            }
            else if (result.equals("kill")){
                DotComList.remove(test);
                break;
            }

        }
        System.out.println(result);
    }

    public void finish(){

    }


    }
