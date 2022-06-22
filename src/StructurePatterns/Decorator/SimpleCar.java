package StructurePatterns.Decorator;


public class SimpleCar implements Car{
    private final int speed=50;
    private final int weight=1000;

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }
}