package patterns.structural.facade;

public class Developer {
    public void doJobBeforeDeadline(BugTracker bugTracker) {
        if (bugTracker.isActiveSpring()) {
            System.out.println("Developer solves problems");
        } else {
            System.out.println("Developer reads Habr");
        }
    }
}
