package CreationalPatterns.Prototype;

public class Main {
    public static void main(String[] args) {
        Person original = new Person(10,"Nikita",10000);
        System.out.println(original);

        Person copy =(Person) original.copy();
        System.out.println(copy);


    }
}
