package StructurePatterns.Composite;

public class Main {
    public static void main(String[] args) {
        Shape square1 = new Square();
        Shape square2 = new Square();
        Shape square3 = new Square();

        Shape triangle1 = new Triangle();
        Shape triangle2 = new Triangle();
        Shape triangle3 = new Triangle();

        Shape circle1 = new Circle();
        Shape circle2 = new Circle();
        Shape circle3 = new Circle();

        Composite composite = new Composite();
        Composite composite1 = new Composite();
        Composite composite2 = new Composite();

        composite1.addComponent(square1);
        composite1.addComponent(triangle1);
        composite1.addComponent(circle1);

        composite2.addComponent(square2);
        composite2.addComponent(triangle2);
        composite2.addComponent(circle2);

        composite.addComponent(composite1);
        composite.addComponent(composite2);

        composite.draw();

    }
}
