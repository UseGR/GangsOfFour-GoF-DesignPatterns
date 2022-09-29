package patterns.creational.factory.classes;

import patterns.creational.factory.interfaces.Developer;
import patterns.creational.factory.interfaces.DeveloperFactory;

public class Test {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createBySpecialty("javfa");
        try {
            Developer developer = developerFactory.create();
            developer.writeCode();
        } catch (NullPointerException e) {
            System.out.println("Unknown developer");
        }
    }

    public static DeveloperFactory createBySpecialty(String specialty) {
        switch (specialty.toLowerCase()) {
            case "java" -> {
                return new JavaDeveloperFactory();
            }
            case "kotlin" -> {
                return new KotlinDeveloperFactory();
            }
            case "python" -> {
                return new PythonDeveloperFactory();
            }
            default -> {
                try {
                    throw new RuntimeException("There is no " + specialty + " developer");
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                    return null;
                }
            }
        }
    }
}