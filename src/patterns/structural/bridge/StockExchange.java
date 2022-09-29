package patterns.structural.bridge;

public class StockExchange extends Program{
    public StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    void developProgram() {
        System.out.println("Stock exchange development in progress");
        developer.writeCode();
    }
}
