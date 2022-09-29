package patterns.structural.bridge;

public class BankSystem extends Program {
    public BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    void developProgram() {
        System.out.println("Bank system development in progress");
        developer.writeCode();
    }
}
