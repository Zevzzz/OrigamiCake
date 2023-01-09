
import java.util.ArrayList;

/**
 * @param cakeNum Number of cake objects to create in the OrigamiCakes object
 */

public class OrigamiCakes{

    private ArrayList<OrigamiCake> origamiCakes = new <OrigamiCake>ArrayList();
    private int cakeNum;
    private String returnStr = "";

    // Overloaded Constructors
    public OrigamiCakes(){}

    public OrigamiCakes(int cakeNum){
        this.cakeNum = cakeNum;

        for (int i = 0; i < cakeNum; i++){
            origamiCakes.add(new OrigamiCake("NONE", 0, 0, false, 0, 0, 0));
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
    
    public void setCake(int i, OrigamiCake val){
        origamiCakes.set(i, val);
    }
    
    @Override
    public String toString(){
        for (int i = 0; i < getLen(); i++){
            returnStr += "**************************************************\n";

            returnStr += cake(i).getColorOfCake() + " cake's color: " + (getCake(i).getColorOfCake()) + "\n";
            returnStr += cake(i).getColorOfCake() + " cake's number of faces: " + (getCake(i).getNumberOfFaces()) + "\n";
            returnStr += cake(i).getColorOfCake() + " cake's number of folds: " + (getCake(i).getNumberOfFolds()) + "\n";
            if (getCake(i).getToppings() != null) {
            for (int j = 0; j < getCake(i).getToppings().size(); j++){
                returnStr += cake(i).getColorOfCake() + " cake's topping number " + (j + 1) + ": " + (getCake(i).getToppings().get(j)) + "\n";
            }
            } else {
                returnStr += "No toppings present. \n";
            }
        
            returnStr += cake(i).getColorOfCake() + " cake's length: " + cake(i).getDimensions()[0] + "\n";
            returnStr += cake(i).getColorOfCake() + " cake's width: " + cake(i).getDimensions()[1] + "\n";
            returnStr += cake(i).getColorOfCake() + " cake's height: " + cake(i).getDimensions()[2] + "\n";
            
            returnStr += "**************************************************\n\n";
        }

        return returnStr;
    }
    
    public OrigamiCakes copyOrigamiCakes() {
        OrigamiCakes returnCakes = new OrigamiCakes(cakeNum);
        for (int i = 0; i < cakeNum; i++) {
            returnCakes.setCake(i, this.cake(i).copyCake());
        }
        return returnCakes;
    }
       
    public static OrigamiCakes makeRandomCakes(int len) {
        OrigamiCakes randCakes = new OrigamiCakes(len);
        for (int i = 0; i < len; i++) {
            randCakes.setCake(i, OrigamiCake.makeRandomCake());
        }
        return randCakes;
    }


}
