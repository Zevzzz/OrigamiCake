import java.util.ArrayList;

public class OrigamiCake{

private String colorOfCake;
private ArrayList toppings; 
private int numberOfFaces;
private int numberOfFolds;
private double[] dimensions;

public OrigamiCake(String colorOfCake, ArrayList toppings, int numberOfFaces, int numberOfFolds, double[] dimensions){
    this.colorOfCake = colorOfCake;
    this.toppings = toppings;
    this.numberOfFaces = numberOfFaces;
    this.numberOfFolds = numberOfFolds;
    this.dimensions = dimensions;
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

public void setDimensions(double[] newDimensions){
    for (int i = 0; i < newDimensions.length; i++){
        dimensions[i] = newDimensions[i];
    }
}


}