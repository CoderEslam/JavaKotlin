package Arrays;

public class Item {

    public Item(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String name ;
    private String type;


    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
