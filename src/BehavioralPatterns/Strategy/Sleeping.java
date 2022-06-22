package BehavioralPatterns.Strategy;

public class Sleeping implements Activity{
    @Override
    public void doSomething() {
        System.out.println("Sleeping...");
    }
}
