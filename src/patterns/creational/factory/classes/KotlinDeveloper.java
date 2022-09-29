package patterns.creational.factory.classes;

import patterns.creational.factory.interfaces.Developer;

public class KotlinDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Kotlin developer writes Kotlin code...");
    }
}
