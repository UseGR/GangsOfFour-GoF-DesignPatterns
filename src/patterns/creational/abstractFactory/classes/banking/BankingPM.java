package patterns.creational.abstractFactory.classes.banking;

import patterns.creational.abstractFactory.interfaces.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project");
    }
}
