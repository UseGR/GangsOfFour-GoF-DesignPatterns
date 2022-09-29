package patterns.behavioral.chainOfResponsibility;

public class Test {
    public static void main(String[] args) {
        Notifier report = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier email = new EmailNotifier(Priority.IMPORTANT);
        Notifier sms = new SMSNotifier(Priority.ASAP);

        report.setNextNotifier(email);
        email.setNextNotifier(sms);

        report.notifyManager("Everything is ok", Priority.ROUTINE);
        report.notifyManager("Something went wrong", Priority.IMPORTANT);
        report.notifyManager("We've had a problem", Priority.ASAP);

    }
}
