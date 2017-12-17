package headfirst.sink_game.arraylist;

import java.util.ArrayList;

/**
 * Created by OMAR on 11/23/2017.
 */
public class EnhancedDotComGame {
    private String DotCom;
    private ArrayList<String> location_cells;
    public String check_values (String number){
        String result = "miss";
        int index = location_cells.indexOf(number);
        if (index >= 0){
            location_cells.remove(index);
            if(location_cells.isEmpty()){
               result = "kill";
            }
            else {
                result = "hit";
            }
        }
        return result;
    }

    public void setDotCom(String dotCom) {
        DotCom = dotCom;
    }


    public void setLocation_cells(ArrayList<String> location_cells) {
        this.location_cells = location_cells;
    }
}
