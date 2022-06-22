package CreationalPatterns.Fabric;

public class Main {
    public static void main(String[] args) {
        Factory factory =new Factory();
        Car toyota = factory.create("Toyota");
        Car ford =factory.create("Ford");
        toyota.drive();
        ford.drive();
    }
}
