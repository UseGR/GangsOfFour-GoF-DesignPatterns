package patterns.creational.builder;

public class Director {
    WebsiteBuilder websiteBuilder;

    public Director() {
    }

    public Director(WebsiteBuilder websiteBuilder) {
        this.websiteBuilder = websiteBuilder;
    }

    public void setWebsiteBuilder(WebsiteBuilder websiteBuilder) {
        this.websiteBuilder = websiteBuilder;
    }

    Website buildWebsite() {
        websiteBuilder.createWebsite();
        websiteBuilder.buildName();
        websiteBuilder.buildCms();
        websiteBuilder.buildPrice();
        return websiteBuilder.getWebsite();
    }
}
