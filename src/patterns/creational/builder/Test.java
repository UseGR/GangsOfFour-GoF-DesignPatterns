package patterns.creational.builder;

public class Test {
    public static void main(String[] args) {
        Director director = new Director(new CommercialBuilder());
        Website website = director.buildWebsite();

        System.out.println(website);
    }
}
