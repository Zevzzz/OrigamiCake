import javax.xml.namespace.QName;

public class Cookie {

    /*
     *
     * instance variables
     */
    public static final String ITEM_DESC = "It's a cookie";
    public static int cookieIdMaster = 100000;
    private int numberOfChocolateChips;
    private double diameter;
    private int numberOfCracks;
    private String flavor;
    private int cookieId;

    private static final String[] flavorChoice = { "chocolate", "vanilla", "red velvet" };

    /*
     * constructors
     */

    public Cookie(String currentFlavor, double radius, int currentChips) {
        cookieId = cookieIdMaster;
        cookieIdMaster += 12;

        flavor = currentFlavor;
        diameter = radius * 2;
        currentChips = numberOfChocolateChips;
        numberOfCracks = 0;

        System.out.println("CREATING COOKIE..." + cookieId + "...");
        showStatus();
    }

    public static Cookie makeCookie(String currentFlavor, double radius, int currentChips) {
        if (radius > 0) {
            return new Cookie(currentFlavor, radius, currentChips);

        }
        return null;
    }

    public Cookie(int choice) {
        this(flavorChoice[choice],
                (int) (Math.random() * 5 + 1),
                (int) (Math.random() * 5 + 1));
    }

    public String toString() {
        String returnThis = "This is a";
        String firstCharOfFlavor = flavor.substring(0, 1).toLowerCase();
        if (firstCharOfFlavor.equals("a") || 
        firstCharOfFlavor.equals("e") || 
        firstCharOfFlavor.equals("i") || 
        firstCharOfFlavor.equals("o") || 
        firstCharOfFlavor.equals("u")) {
            returnThis += "n";
        }
        returnThis += " " + flavor + " cookie";
        return returnThis;
     }
    // public int length() {
    //     return 999;
    // }
    public Cookie randomCookie(Cookie otherCookie) {
        int random = (int) (Math.random() * 2) + 1;
        if (random == 1) {
            return otherCookie;
        } else {
            return this;
        }
    }

    /*
     * methods
     */

    /**
     * allow the change of the number of chocolate chips
     * but will check to ake suer the number is within range,
     * or else I will set it to 0
     * 
     * @param newNumberOfChips Enter an integer for the new value of chips
     */

    public boolean setNumberofChips(int newNumberOfChips) {
        if (newNumberOfChips >= 0 && newNumberOfChips < diameter) {
            numberOfChocolateChips = newNumberOfChips;
            return true;
        }
        return false;
    }

    public double findCircumference() {

        return Math.PI * diameter;
    }

    public String getFlavor() {

        return flavor;
    }

    public void smashCookie() {

        numberOfCracks++;
        numberOfCracks += (int) (Math.random() * 10 + 1); // a random number from 1 - 10
        // Math.random()

    }

    public void showStatus() {
        System.out.println("*****************");
        System.out.println("COOKIE STATUS");
        System.out.println("* Flavor: * " + flavor);
        System.out.println("* Diameter * " + diameter); // in centimeters
        System.out.println("* Number of Chocolate Chips: " + numberOfChocolateChips);
        System.out.println("* Number of Cracks: " + numberOfCracks);
        System.out.println("*****************");
    }
}