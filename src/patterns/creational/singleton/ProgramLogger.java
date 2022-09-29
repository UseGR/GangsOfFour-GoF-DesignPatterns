package patterns.creational.singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logFile = "This is log file. \n\n";

    public static synchronized ProgramLogger getProgramLogger() {
        if (programLogger == null) {
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }

    private ProgramLogger() {
    }

    public void addInfo(String info) {
        logFile += info + "\n";
    }

    public void showInfo() {
        System.out.println(logFile);
    }
}
