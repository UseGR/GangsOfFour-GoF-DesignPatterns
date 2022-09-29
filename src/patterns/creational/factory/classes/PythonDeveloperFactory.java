package patterns.creational.factory.classes;

import patterns.creational.factory.interfaces.Developer;
import patterns.creational.factory.interfaces.DeveloperFactory;

public class PythonDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer create() {
        return new PythonDeveloper();
    }
}
