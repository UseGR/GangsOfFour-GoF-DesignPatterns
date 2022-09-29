package patterns.structural.bridge;

public class Test {
    public static void main(String[] args) {
        Program[] programs = {
                new BankSystem(new CppDeveloper()),
                new StockExchange(new JavaDeveloper())
        };

        for (Program program : programs) {
            program.developProgram();
        }
    }
}
