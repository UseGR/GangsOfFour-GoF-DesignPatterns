package patterns.creational.factory.classes;

import patterns.creational.factory.interfaces.Developer;

public class PythonDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Python developer writes Python code...");
    }
}
