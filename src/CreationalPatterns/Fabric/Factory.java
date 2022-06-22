package CreationalPatterns.Fabric;

public class Factory {
    public Car create(String typeOfCar){
        return switch (typeOfCar) {
            case "Toyota" -> new Toyota();
            case "Ford" -> new Ford();
            default -> null;
        };
    }
}
