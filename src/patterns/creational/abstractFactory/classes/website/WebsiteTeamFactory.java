package patterns.creational.abstractFactory.classes.website;

import patterns.creational.abstractFactory.interfaces.Developer;
import patterns.creational.abstractFactory.interfaces.ProjectManager;
import patterns.creational.abstractFactory.interfaces.ProjectTeamFactory;
import patterns.creational.abstractFactory.interfaces.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
