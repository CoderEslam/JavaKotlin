package Arrays;

public class Item {


    private String chiledCategory;
    private String heatCategory;
    private String name;

    public Item(String chiledCategory, String heatCategory, String name) {
        this.chiledCategory = chiledCategory;
        this.heatCategory = heatCategory;
        this.name = name;
    }

    public Item(String heatCategory, String name) {
        this.heatCategory = heatCategory;
        this.name = name;
    }


    public String getChiledCategory() {
        return chiledCategory;
    }

    public void setChiledCategory(String chiledCategory) {
        this.chiledCategory = chiledCategory;
    }

    public String getHeatCategory() {
        return heatCategory;
    }

    public void setHeatCategory(String heatCategory) {
        this.heatCategory = heatCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "chiledCategory='" + chiledCategory + '\'' +
                ", heatCategory='" + heatCategory + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
