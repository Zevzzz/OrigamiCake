
import java.util.ArrayList;

public class OrigamiCake extends OrigamiCakes{


private String colorOfCake;
private ArrayList toppings; 
private int numberOfFaces;
private int numberOfFolds;
private boolean isSmooshed;
private double[] dimensions = {0, 0, 0}; 

/**
 * @param colorOfCake Main color of cupcake. 
 * @param numberOfFaces Number of total drawn faces. 
 * @param numberOfFolds Number of total folds required to create cupcake. 
 * @param length Longest horizonal length of cupcake in centimeters (cm)
 * @param width Longest thickness of cupcake in centimeters (cm)
 * @param height Longest vertical height of cupcake in centimeters (cm)
 */

public OrigamiCake(String colorOfCake, int numberOfFaces, int numberOfFolds, boolean isSmooshed, double length, double width, double height){
    this.colorOfCake = colorOfCake;
    this.numberOfFaces = numberOfFaces;
    this.numberOfFolds = numberOfFolds;
    this.isSmooshed = isSmooshed;
    dimensions[0] = length;
    dimensions[1] = width;
    dimensions[2] = height;

}

public OrigamiCake(){
    this.colorOfCake = "White";
    this.numberOfFaces = 0;
    this.numberOfFolds = 0;
    this.isSmooshed = false;
    dimensions[0] = 0;
    dimensions[1] = 0;
    dimensions[2] = 0;

}


/**@param colorOfCake Color of the cake */
public void setAllParams(String colorOfCake, int numberOfFaces, int numberOfFolds, boolean isSmooshed, double length, double width, double height){
    this.colorOfCake = colorOfCake;
    this.numberOfFaces = numberOfFaces;
    this.numberOfFolds = numberOfFolds;
    this.isSmooshed = isSmooshed;
    dimensions[0] = length;
    dimensions[1] = width;
    dimensions[2] = height;
}

// Color
public String getColorOfCake(){
return colorOfCake;
}
public void setColorOfCake(String colorOfCake){
    this.colorOfCake = colorOfCake;
}

// Toppings
public ArrayList getToppings(){
    return toppings;
}
public void setToppings(ArrayList toppings){
    this.toppings = toppings;
}
public void addTopping(String newTopping){
    toppings.add(newTopping);
}
public void removeTopping(String remTopping){
    toppings.remove(remTopping);
}

// Faces
public int getNumberOfFaces(){
    return numberOfFaces;
}
public void setNumberOfFaces(int numberOfFaces){
    this.numberOfFaces = numberOfFaces;
}
public void incrementNumberOfFaces(int incFace){
    numberOfFaces += incFace;
}

// Folds
public int getNumberOfFolds(){
    return numberOfFolds;
}
public void setNumberOfFolds(int numberOfFolds){
    this.numberOfFolds = numberOfFolds;
}
public void incrementNumberOfFolds(int incFolds){
    numberOfFaces += incFolds;
}

// isSmooshed
public boolean getIsSmooshed(){
    return isSmooshed;
}
public void setIsSmooshed(boolean isSmooshed){
    this.isSmooshed = isSmooshed;
}

public double[] getDimensions(){
    return dimensions;
}

public void setDimensions(double length, double width, double height){
    dimensions[0] = length;
    dimensions[1] = width;
    dimensions[2] = height;
}

/**
 * This method converts an OrigamiCake object into a formatted string
 * that displays the color, the number of faces, the number of folds, and the volume (in cm^2 to the nearest 100th) of the OrigamiCake. 
 * Conditional will automatically format number of face(s) and number of fold(s), removing
 * the "s" if only a single face or fold is present.  
 * @return A string describing the cake's color, its number of faces, its number of folds, 
 *         and the volume (in cm^2 to nearest 100th) of the OrigamiCake */
@Override
public String toString() {
    // Uppercase version of color
    String toStringReturn = getColorOfCake().substring(0, 1).toUpperCase() + getColorOfCake().substring(1);
    double volume = this.getDimensions()[0] * this.getDimensions()[1] * this.getDimensions()[2];
    double roundedVolume = Math.round(volume * 100) / 100.0;

    if (numberOfFaces == 1 && numberOfFolds == 1) 
        toStringReturn += " cupcake with " + this.getNumberOfFaces() + " face and " + this.getNumberOfFolds() + 
        " fold, with a volume of " + roundedVolume + " cm^2 :)";
    else if (numberOfFaces == 1)
        toStringReturn += " cupcake with " + this.getNumberOfFaces() + " face and " + this.getNumberOfFolds() + 
        " folds, with a volume of " + roundedVolume + " cm^2 :)";
    else if (numberOfFolds == 1)
        toStringReturn += " cupcake with " + this.getNumberOfFaces() + " faces and " + this.getNumberOfFolds() + 
        " fold, with a volume of " + roundedVolume + " cm^2 :)";
    else 
        toStringReturn += " cupcake with " + this.getNumberOfFaces() + " faces and " + this.getNumberOfFolds() + 
        " folds, with a volume of " + roundedVolume + " cm^2 :)";

    return toStringReturn;
}


/**
 * This method compares two OrigamiCake objects, 
 * one being the object, the other is an OrigamiCake object to be passed in as a parameter, 
 * and compares if the dimensions of the 2 objects are within a designated tolerance of each other, given by the function
 * (Math.abs(a - b) <= (a + b) /  2 * 0.08), where a are the dimensions of the first object, and b are the dimensions of the second. 
 * This function checks if the absolute difference of the 2 dimensions is less than 5% the average between the 2 dimensions, 
 * and allows the tolerance to scale relatively with the size of the OrigamiCake 
 * (For example, (1 & 1.8 returns false, but 10 & 10.8 returns true)).
 * In addition, if the color, number of faces, number of folds, and is/isn't smooshed are equal,
 * it returns a boolean depending on if it is within tolerance, and if all other conditions are met. 
 * @param cake An OrigamiCake object to be compared to see if it is equal to the original object
 * @return Returns a boolean that represents if or if not two OrigamiCake objects are within dimensional tolerance of each other, 
 *         and if all other attributes are equal
 */
public boolean equals(OrigamiCake cake) {
    double[] dimensionsA = this.getDimensions();
    double[] dimensionsB = cake.getDimensions();

    // Checks equality of attributes and dimensions within tolerance
    if (dimensionsA.length == dimensionsB.length &&
     this.getColorOfCake() == cake.getColorOfCake() &&
      this.getNumberOfFaces() == cake.getNumberOfFaces() &&
       this.getNumberOfFolds() == cake.getNumberOfFaces() &&
       this.getIsSmooshed() == cake.getIsSmooshed()) {
        for (int i = 0; i < dimensionsA.length; i++) {
            if (!((Math.abs(dimensionsA[i] - dimensionsB[i]) <= (dimensionsA[i] + dimensionsB[i]) /  2 * 0.08)))
                return false;
        }
    } else {
        return false;
    }

    return true;
}

/**
 * Creates an exact copy of an OrigamiCake object, returns the exact copy. 
 * The copied object will duplicate the original OrigamiCake's color, number of faces, number of folds, whether it is smooshed, and dimensions, 
 * and they will be stored in a new OrigamiCake object that is then returned. 
 * @return OrigamiCake object that copies the color, number of faces, number of folds, is/isn't smooshed, and dimensions of the original object
 */
public OrigamiCake copyCake() {
    return new OrigamiCake(
    this.getColorOfCake(), 
    this.getNumberOfFaces(), 
    this.getNumberOfFolds(), 
    this.getIsSmooshed(),
    this.getDimensions()[0], 
    this.getDimensions()[1], 
    this.getDimensions()[2]);
}

/**
 * Creates a random OrigamiCake objects with randomized attributes. 
 * A random color will be assigned to the OrigamiCake, the number of faces will
 * be randomized from 1 to 20, the number of folds will be randomized from 1 to 30, whether or not the cake is smooshed (true/false), 
 * the dimensions will each be randomized from 1cm to 10cm. Random generations utilize the 
 * Math.random() function to generate random numbers for each attribute. Random colors are randomly picked
 * from a list of 30 colors, by utilizing the Math.random() function to select a random index. The true/false of isSmooshed is generated
 * by utilizing Math.random() from 0 to 1, and checking for equality with 0. 
 * @param color The color of the random cake as a string
 * @return An OrigamiCake object with a given color and randomized number of faces, number of folds, and dimensions
 */
public static OrigamiCake makeRandomCake(String color) {
    OrigamiCake randomCake = new OrigamiCake(color,
    (int)(Math.random()*20+1),
    (int)(Math.random()*30+1),
    (int)(Math.random()*2) == 0,
    (Math.random()*10+1),
    (Math.random()*10+1),
    (Math.random()*10+1));
    return randomCake;
}

/**
 * Creates a random OrigamiCake objects with randomized attributes. 
 * A random color will be assigned to the OrigamiCake, the number of faces will
 * be randomized from 1 to 20, the number of folds will be randomized from 1 to 30, whether or not the cake is smooshed (true/false), 
 * the dimensions will each be randomized from 1cm to 10cm. Random generations utilize the 
 * Math.random() function to generate random numbers for each attribute. Random colors are randomly picked
 * from a list of 30 colors, by utilizing the Math.random() function to select a random index. The true/false of isSmooshed is generated
 * by utilizing Math.random() from 0 to 1, and checking for equality with 0. 
 * @return An OrigamiCake object with a randomized color, number of faces, number of folds, and dimensions
 */
public static OrigamiCake makeRandomCake() {
    final String[] COLORS = {"White", "Yellow", "Blue", "Red", "Green", "Black", "Brown", "Azure", "Ivory", "Teal", "Silver",
     "Purple", "Navy-blue", "Pea-green", "Gray", "Orange", "Maroon", "Charcoal", "Aquamarine", "Coral", "Fuchsia", "Wheat",
      "Lime", "Crimson", "Khaki", "Hot-pink", "Magenta", "Olden", "Plum", "Olive", "Cyan"};

    String randColor = COLORS[(int) (Math.random() * COLORS.length)];
    OrigamiCake randomCake = new OrigamiCake(randColor,
    (int)(Math.random()*20+1),
    (int)(Math.random()*30+1),
    (int)(Math.random()*2) == 0,
    (Math.random()*10+1),
    (Math.random()*10+1),
    (Math.random()*10+1));
    return randomCake;
}

/**
 * This method recieves 2 OrigamiCake objects, one given as the attached object, and one given as a parameter, 
 * and returns the object with the larger volume, where volume is the product of the length, width and height.
 * If both objects have the same volume, the attached object will be returned. 
 * @param secondCake The second OrigamiCake object to be passed in for comparison of volumes
 * @return The OrigamiCake object with the larger volume will be returned 
 */
public OrigamiCake biggerCake(OrigamiCake secondCake) {
    // Calculate volumes
    double firstVol = this.getDimensions()[0] * this.getDimensions()[1] * this.getDimensions()[2];
    double secondVol = secondCake.getDimensions()[0] * secondCake.getDimensions()[1] * secondCake.getDimensions()[2];
    
    if (firstVol >= secondVol) 
        return this;
    return secondCake;
}


}