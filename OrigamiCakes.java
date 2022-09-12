
import java.util.ArrayList;

/**
 * @param cakeNum Number of cake objects to create in the OrigamiCakes object
 */

public class OrigamiCakes{

    ArrayList<OrigamiCake> origamiCakes;
    int cakeNum;

    // Overloaded Constructors
    public OrigamiCakes(){}

    public OrigamiCakes(int cakeNum){
        this.cakeNum = cakeNum;

        for (int i = 0; i < cakeNum; i++){
            origamiCakes.add(new OrigamiCake("NONE", 0, 0, 0, 0, 0));
        }
    }
    

    // OrigamiCakes Methods
    public ArrayList getOrigamiCakes(){
        return origamiCakes;
    }

    public OrigamiCake getOrigamiCake(int index){
        return origamiCakes.get(index);
    }
    public OrigamiCake getCake(int index){
        return origamiCakes.get(index);
    }
    public OrigamiCake cake(int index){
        return origamiCakes.get(index);
    }

    public int getLen(){
        return cakeNum;
    }



}
