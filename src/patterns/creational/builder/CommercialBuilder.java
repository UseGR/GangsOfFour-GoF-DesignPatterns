package patterns.creational.builder;

public class CommercialBuilder extends WebsiteBuilder{
    @Override
    void buildName() {
        website.setName("Commercial site");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        website.setPrice(1000);
    }
}
