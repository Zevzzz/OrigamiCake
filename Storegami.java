
import java.util.ArrayList;
import java.util.Arrays;

public class Storegami{

    public static void main(String[] args){
        // ArrayList<String> toppingsTest = new ArrayList<String>(Arrays.asList("Sprinkles", "Frosting"));
        // OrigamiCake origamiCake = new OrigamiCake("Blue", 2, 7, 3.0, 4.0, 5.0);


        OrigamiCakes origamiCakes = new OrigamiCakes(3);

        // Donson
        ArrayList<String> toppingsD = new ArrayList<String>(Arrays.asList("Sticky Note", "The Face of G O D"));
        origamiCakes.cake(0).setColorOfCake("Blue");
        origamiCakes.cake(0).setDimensions(8.6, 0.2, 7.9);
        origamiCakes.cake(0).setNumberOfFaces(1);
        origamiCakes.cake(0).setNumberOfFolds(10);
        origamiCakes.cake(0).setToppings(toppingsD);

        // Percy
        ArrayList<String> toppingsP = new ArrayList<String>(Arrays.asList("White Frosting", "Orange Frosting", "Blue  Frosting", "Pink  Frosting"));
        origamiCakes.cake(1).setAllParams("Red", 0, 10, 10.5, 0.1, 6.1);
        origamiCakes.cake(1).setToppings(toppingsP);

        // // Aaron Liang
        ArrayList<String> toppingsA = new ArrayList<String>(Arrays.asList("Pink Face Sprinkles", "White Frosting"));
        origamiCakes.cake(2).setAllParams("Purple", 16, 20, 13.05, 0.15, 7.2);
        origamiCakes.cake(2).setToppings(toppingsA);


        // Get all Cake Info
        System.out.println(origamiCakes.getAllInfo());

        // Get alll toStrings
        System.out.println("\n\n");
        System.out.println(origamiCakes.getAllToStrings());

        

    }
}