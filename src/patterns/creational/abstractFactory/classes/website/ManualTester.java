package patterns.creational.abstractFactory.classes.website;

import patterns.creational.abstractFactory.interfaces.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website");
    }
}
