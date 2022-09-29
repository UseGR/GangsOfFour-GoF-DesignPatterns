package patterns.behavioral.template;

public class Test {
    public static void main(String[] args) {
        WebsiteTemplate welcomePage = new WelcomePage();
        WebsiteTemplate newsPage = new NewsPage();

        welcomePage.showPage();
        System.out.println("\n=======================\n");
        newsPage.showPage();
    }
}
