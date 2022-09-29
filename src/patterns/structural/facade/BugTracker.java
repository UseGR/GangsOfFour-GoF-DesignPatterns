package patterns.structural.facade;

public class BugTracker {
    private boolean activeSpring;

    public boolean isActiveSpring() {
        return activeSpring;
    }


    public void startSpring() {
        System.out.println("Spring is active");
        activeSpring = true;
    }

    public void finishSpring() {
        System.out.println("Sprint is not active");
        activeSpring = false;
    }
}
