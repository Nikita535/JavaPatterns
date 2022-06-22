package CreationalPatterns.Singletone;

public class Main {
    public static void main(String[] args) {
       Object object1 = (Singletone1) Singletone1.getInstance();
       Object object2 = (Singletone1) Singletone1.getInstance();
       //объект создается 1 раз

    }
}
