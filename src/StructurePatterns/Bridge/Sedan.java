package StructurePatterns.Bridge;

public class Sedan extends Car{
    public Sedan(Mark m) {
        super(m);
    }

    @Override
    void showDetails() {
        System.out.println("Sedan");
        mark.setMark();
    }
}
