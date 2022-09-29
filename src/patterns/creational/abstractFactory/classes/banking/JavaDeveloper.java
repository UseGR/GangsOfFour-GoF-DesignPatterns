package patterns.creational.abstractFactory.classes.banking;

import patterns.creational.abstractFactory.interfaces.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code");
    }
}
