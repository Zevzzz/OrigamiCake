
import java.util.ArrayList;
import java.util.Arrays;

public class Store{

    public static void main(String[] args){
        ArrayList<String> toppings = new ArrayList<String>(Arrays.asList("Sprinkles", "Frosting"));
        OrigamiCake origamiCake = new OrigamiCake("Blue", 2, 7, 3.0, 4.0, 5.0);
        System.out.println(origamiCake.getColorOfCake());
        System.out.println(origamiCake.getNumberOfFaces());
        System.out.println(origamiCake.getNumberOfFolds());
        for (int i = 0; i < origamiCake.getToppings().size(); i++){
            System.out.println(origamiCake.getToppings().get(i));
        }
        for (int i = 0; i < origamiCake.getDimensions().length; i++){
            System.out.println(origamiCake.getDimensions()[i]);
        }

    }
}