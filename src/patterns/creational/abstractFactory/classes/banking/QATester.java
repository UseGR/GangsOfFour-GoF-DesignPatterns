package patterns.creational.abstractFactory.classes.banking;

import patterns.creational.abstractFactory.interfaces.Tester;

public class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QA tester tests banking code");
    }
}
