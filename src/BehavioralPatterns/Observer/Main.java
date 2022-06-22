package BehavioralPatterns.Observer;

public class Main {
    public static void main(String[] args) {

        JavaDeveloperJobSite javaDeveloperJobSite=new JavaDeveloperJobSite();

        javaDeveloperJobSite.addVacancy("First vacancy");
        javaDeveloperJobSite.addVacancy("Second vacancy");

        Observer firstSubscriber=new Subscriber("Nikita");
        Observer secondSubscriber=new Subscriber("Pasha");

        javaDeveloperJobSite.addObserver(firstSubscriber);
        javaDeveloperJobSite.addObserver(secondSubscriber);

        javaDeveloperJobSite.addVacancy("Third vacancy");
        javaDeveloperJobSite.removeVacancy("First vacancy");
    }
}
