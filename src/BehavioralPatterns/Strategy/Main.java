package BehavioralPatterns.Strategy;

public class Main {
    public static void main(String[] args) {
        Developer developer=new Developer();

        developer.changeActivity(new Sleeping());
        developer.executeActivity();

        developer.changeActivity(new Coding());
        developer.executeActivity();

        developer.changeActivity(new Reading());
        developer.executeActivity();

    }
}
