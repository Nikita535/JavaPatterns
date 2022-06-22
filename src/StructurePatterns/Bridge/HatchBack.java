package StructurePatterns.Bridge;

public class HatchBack extends Car{
    public HatchBack(Mark m) {
        super(m);
    }

    @Override
    void showDetails() {
        System.out.println("HatchBack");
        mark.setMark();
    }
}
