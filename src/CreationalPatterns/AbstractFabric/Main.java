package CreationalPatterns.AbstractFabric;

public class Main {
    public static void main(String[] args) {
        CarsFactory factory;
        factory = new ToyotaFactory();
        factory.createSedan();

        factory = new FordFactory();
        factory.createSedan();
    }
}
