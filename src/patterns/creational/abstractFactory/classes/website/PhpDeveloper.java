package patterns.creational.abstractFactory.classes.website;

import patterns.creational.abstractFactory.interfaces.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code");
    }
}
