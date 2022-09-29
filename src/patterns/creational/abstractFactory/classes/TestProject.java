package patterns.creational.abstractFactory.classes;

import patterns.creational.abstractFactory.classes.banking.BankingTeamFactory;
import patterns.creational.abstractFactory.classes.website.WebsiteTeamFactory;
import patterns.creational.abstractFactory.interfaces.Developer;
import patterns.creational.abstractFactory.interfaces.ProjectManager;
import patterns.creational.abstractFactory.interfaces.ProjectTeamFactory;
import patterns.creational.abstractFactory.interfaces.Tester;

public class TestProject {

    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = getProjectTeamFactory("site");
        try {
            Developer developer = projectTeamFactory.getDeveloper();
            Tester tester = projectTeamFactory.getTester();
            ProjectManager manager = projectTeamFactory.getProjectManager();

            developer.writeCode();
            tester.testCode();
            manager.manageProject();
        } catch (NullPointerException e) {
            System.out.println("Project wasn't created");
        }
    }

    public static ProjectTeamFactory getProjectTeamFactory(String project) {
        switch (project.toLowerCase()) {
            case "banking" -> {
                return new BankingTeamFactory();
            }
            case "site" -> {
                return new WebsiteTeamFactory();
            }
            default -> {
                try {
                    throw new RuntimeException("Invalid project");
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                    return null;
                }
            }
        }
    }
}
