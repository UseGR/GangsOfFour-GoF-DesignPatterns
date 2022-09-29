package patterns.creational.abstractFactory.classes.banking;

import patterns.creational.abstractFactory.interfaces.Developer;
import patterns.creational.abstractFactory.interfaces.ProjectManager;
import patterns.creational.abstractFactory.interfaces.ProjectTeamFactory;
import patterns.creational.abstractFactory.interfaces.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
