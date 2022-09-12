
import java.util.ArrayList;
import java.util.Arrays;

public class Store{

    public static void main(String[] args){
        // ArrayList<String> toppingsTest = new ArrayList<String>(Arrays.asList("Sprinkles", "Frosting"));
        // OrigamiCake origamiCake = new OrigamiCake("Blue", 2, 7, 3.0, 4.0, 5.0);


        OrigamiCakes origamiCakes = new OrigamiCakes(3);

        // Donson
        ArrayList<String> toppingsD = new ArrayList<String>(Arrays.asList("Sticky Note", "The Face of G O D"));
        origamiCakes.cake(0).setColorOfCake("Blue");
        origamiCakes.cake(0).setDimensions(length, width, height);
        origamiCakes.cake(0).setNumberOfFaces(numberOfFaces);
        origamiCakes.cake(0).setNumberOfFolds(numberOfFolds);
        origamiCakes.cake(0).setToppings(toppings2);

        // Percy
        ArrayList<String> toppingsP = new ArrayList<String>(Arrays.asList("Sprinkles", "Frosting"));
        origamiCake.setAllParams(colorOfCake, numberOfFaces, numberOfFolds, length, width, height);

        // Aaron Liang
        ArrayList<String> toppingsA = new ArrayList<String>(Arrays.asList("Pink Face Sprinkles", "White Frosting"));
        origamiCake.setAllParams("Purple", numberOfFaces, 20, length, width, height);


        // Get all Cake Info
        for (int i = 0; i < origamiCakes.getLen(); i++){
            System.out.println(origamiCakes.getCake(i).getColorOfCake());
            System.out.println(origamiCakes.getCake(i).getNumberOfFaces());
            System.out.println(origamiCakes.getCake(i).getNumberOfFolds());
            for (int j = 0; j < origamiCake.getCake(i).getToppings().size(); j++){
                System.out.println(origamiCakes.getCake(i).getToppings().get(j));
            }
            for (int j = 0; j < origamiCakes.getCake(i).getDimensions().length; j++){
                System.out.println(origamiCakes.getCake(i).getDimensions()[j]);
            }
        }
        

    }
}