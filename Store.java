
import java.util.ArrayList;
import java.util.Arrays;

public class Store{

    public static void main(String[] args){
        ArrayList<String> toppings = new ArrayList<String>(Arrays.asList("Sprinkles", "Frosting"));
        OrigamiCake origamiCake = new OrigamiCake("Blue", toppings, 2, 7);
        System.out.println(origamiCake);

        origamiCake.addTopping("newTopping");

        System.out.println(origamiCake.getToppings());
    }
}