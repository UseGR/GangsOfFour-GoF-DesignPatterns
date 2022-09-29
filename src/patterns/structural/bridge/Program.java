package patterns.structural.bridge;

public abstract class Program {
    protected Developer developer;

    public Program(Developer developer) {
        this.developer = developer;
    }

    abstract void developProgram();
}
