package patterns.structural.proxy;

public class Test {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://github.com/rus/realproject");
        project.run();
    }
}
