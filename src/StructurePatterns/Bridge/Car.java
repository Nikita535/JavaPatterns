package StructurePatterns.Bridge;

public abstract class Car {
    Mark mark;
    public Car(Mark m){
        mark=m;
    }
    abstract  void showDetails();
}
