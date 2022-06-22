package CreationalPatterns.Singletone;

//самая подходящая реализаия для мп
public class Singletone1 {
    private static volatile Singletone1 instance;

    private Singletone1() {
        System.out.println("Объект создан");
    }


    public static Singletone1 getInstance(){
        if (instance == null) {
            synchronized (Singletone1.class) {
                if (instance == null) {
                    instance = new Singletone1();
                }
            }
        }
        return instance;
    }

}
