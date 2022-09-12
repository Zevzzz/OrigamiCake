import java.util.ArrayList;

public class OrigamiCake extends OrigamiCakes{

private String colorOfCake;
private ArrayList toppings; 
private int numberOfFaces;
private int numberOfFolds;
private double[] dimensions = {0, 0, 0}; 

/**
 * @param colorOfCake Main color of cupcake. 
 * @param numberOfFaces Number of total faces, where a face is an area who's color differs from that of those around it. 
 * @param numberOfFolds Number of total folds required to create cupcake. 
 * @param length Longest horizonal length of cupcake at its longest
 * @param width 
 * @param height 
 */

public OrigamiCake(String colorOfCake, int numberOfFaces, int numberOfFolds, double length, double width, double height){
    this.colorOfCake = colorOfCake;
    this.numberOfFaces = numberOfFaces;
    this.numberOfFolds = numberOfFolds;
    dimensions[0] = length;
    dimensions[1] = width;
    dimensions[2] = height;

}



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
    this.numberOfFolds = numberOfFaces;
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


}