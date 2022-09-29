package patterns.structural.facade;

public class WorkFlow {
    private Developer developer = new Developer();
    private BugTracker bugTracker = new BugTracker();
    private Job job = new Job();

    public void solveProblems() {
        job.doJob();
        bugTracker.startSpring();
        developer.doJobBeforeDeadline(bugTracker);
    }
}
