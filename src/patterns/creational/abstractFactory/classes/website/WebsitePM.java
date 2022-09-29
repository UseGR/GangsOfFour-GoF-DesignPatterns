package patterns.creational.abstractFactory.classes.website;

import patterns.creational.abstractFactory.interfaces.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project");
    }
}
