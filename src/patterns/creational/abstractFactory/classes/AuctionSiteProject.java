package patterns.creational.abstractFactory.classes;

import patterns.creational.abstractFactory.classes.website.WebsiteTeamFactory;
import patterns.creational.abstractFactory.interfaces.Developer;
import patterns.creational.abstractFactory.interfaces.ProjectManager;
import patterns.creational.abstractFactory.interfaces.ProjectTeamFactory;
import patterns.creational.abstractFactory.interfaces.Tester;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager manager = projectTeamFactory.getProjectManager();

        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
