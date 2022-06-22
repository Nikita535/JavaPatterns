package StructurePatterns.Bridge;

public class Main {
    public static void main(String[] args) {
        Car car=new Sedan(new Ford());
        car.showDetails();
    }
}
