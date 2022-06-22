package CreationalPatterns.Builder;


public class Main {
    public static void main(String[] args) {
        PersonBuilder personBuilder1 = new PersonBuilderImpl().setName("Nikita").setAge(10).setSalary(1000);
        System.out.println(personBuilder1.toString());

        System.out.println();

        PersonBuilder personBuilder2 = new PersonBuilderImpl().setAge(19).setName("Pasha").setSalary(15000);
        System.out.println(personBuilder2.toString());
    }
}
