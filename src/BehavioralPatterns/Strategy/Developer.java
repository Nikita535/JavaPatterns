package BehavioralPatterns.Strategy;

public class Developer {
    Activity activity;


    public void changeActivity(Activity activity){
        this.activity=activity;
    }

    public void executeActivity(){
        activity.doSomething();
    }
}
