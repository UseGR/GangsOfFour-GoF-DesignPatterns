package patterns.creational.singleton;

public class Test {
    public static void main(String[] args) {
        ProgramLogger programLogger = ProgramLogger.getProgramLogger();


        programLogger.addInfo("Hello");
        programLogger.addInfo("My logger");

        programLogger.showInfo();
    }
}
