package patterns.creational.builder;

public class EnterpriseBuilder extends WebsiteBuilder {
    @Override
    void buildName() {
        website.setName("Enterprise site");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.PEX);
    }

    @Override
    void buildPrice() {
        website.setPrice(5000);
    }
}
