package patterns.behavioral.observer;

public class Test {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();
        jobSite.addVacancy("First Java position");
        jobSite.addVacancy("Second Java position");

        Observer firstSubscriber = new Subcsriber("Rustem Galeev");
        Observer secondSubscriber = new Subcsriber("Peter Romanenko");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Third Java position");


        jobSite.removeVacancy("First Java position");
    }
}
