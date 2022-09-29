package patterns.creational.prototype;

public class Test {

    public static void main(String[] args) {
        Project project = new Project(1, "Super project", "source");

        ProjectFactory projectFactory = new ProjectFactory(project);
        Project clone = projectFactory.cloneProject();

        System.out.println(project);
        System.out.println("""

                ===================
                """);
        System.out.println(clone);
    }

}
