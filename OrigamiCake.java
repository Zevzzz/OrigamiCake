import java.util.ArrayList;

public class OrigamiCake extends OrigamiCakes{

private String colorOfCake;
private ArrayList toppings; 
private int numberOfFaces;
private int numberOfFolds;
private double[] dimensions = {0, 0, 0}; 

/**
 * @param colorOfCake Main color of cupcake. 
 * @param numberOfFaces Number of total drawn faces. 
 * @param numberOfFolds Number of total folds required to create cupcake. 
 * @param length Longest horizonal length of cupcake in centimeters (cm)
 * @param width Longest thickness of cupcake in centimeters (cm)
 * @param height Longest vertical height of cupcake in centimeters (cm)
 */

public OrigamiCake(String colorOfCake, int numberOfFaces, int numberOfFolds, double length, double width, double height){
    this.colorOfCake = colorOfCake;
    this.numberOfFaces = numberOfFaces;
    this.numberOfFolds = numberOfFolds;
    dimensions[0] = length;
    dimensions[1] = width;
    dimensions[2] = height;

}


/**@param colorOfCake Color of the cake */
public void setAllParams(String colorOfCake, int numberOfFaces, int numberOfFolds, double length, double width, double height){
    this.colorOfCake = colorOfCake;
    this.numberOfFaces = numberOfFaces;
    this.numberOfFolds = numberOfFolds;
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


public double[] getDimensions(){
    return dimensions;
}

public void setDimensions(double length, double width, double height){
    dimensions[0] = length;
    dimensions[1] = width;
    dimensions[2] = height;
}

@Override
public String toString() {
    String toStringReturn = getColorOfCake().substring(0, 1).toUpperCase() + getColorOfCake().substring(1);
    if (numberOfFaces == 1 && numberOfFolds == 1) 
        toStringReturn += " cupcake with " + numberOfFaces + " face and " + numberOfFolds + " fold. :)";
    else if (numberOfFaces == 1)
        toStringReturn += " cupcake with " + numberOfFaces + " face and " + numberOfFolds + " folds. :)";
    else if (numberOfFolds == 1)
        toStringReturn += " cupcake with " + numberOfFaces + " faces and " + numberOfFolds + " fold. :)";
    else 
        toStringReturn += " cupcake with " + numberOfFaces + " faces and " + numberOfFolds + " folds. :)";

    return toStringReturn;
}


public static boolean isInTolerance(double a, double b) {
    return (Math.abs(a - b) <= (a + b) /  2 * 0.1);
}

@Override
public boolean equals(OrigamiCake cake) {
    double[] dimensionsA = this.getDimensions();
    double[] dimensionsB = cake.getDimensions();

    if (dimensionsA.length == dimensionsB.length &&
     this.getColorOfCake() == cake.getColorOfCake() &&
      this.getNumberOfFaces() == cake.getNumberOfFaces() &&
       this.getNumberOfFolds() == cake.getNumberOfFaces()) {
        for (int i = 0; i < dimensionsA.length; i++) {
            if (!isInTolerance(dimensionsA[i], dimensionsB[i]))
                return false;
        }
    }
    else {
        return false;
    }
    return true;


}



}