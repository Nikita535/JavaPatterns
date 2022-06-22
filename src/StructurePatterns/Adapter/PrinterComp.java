package StructurePatterns.Adapter;

public class PrinterComp implements PrintInterface{

    private final Printer printer;

    public PrinterComp(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void consolePrint() {
        printer.print();
    }
}
