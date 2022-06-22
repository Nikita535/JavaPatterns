package StructurePatterns.Adapter;

public class Main {
    public static void main(String[] args) {
        PrintInterface printInterface =new PrinterComp(new Printer());
        printInterface.consolePrint();
    }
}
