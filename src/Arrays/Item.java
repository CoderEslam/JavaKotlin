package Arrays;

import java.util.Comparator;

public class Item implements Comparable<Item> {


    private String chiledCategory;
    private String heatCategory;
    private String name;

    public Item(String chiledCategory, String heatCategory, String name, String rate) {
        this.chiledCategory = chiledCategory;
        this.heatCategory = heatCategory;
        this.name = name;
        this.rate = rate;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    private String rate;

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


    public static Comparator<Item> itemComparator = new Comparator<Item>() {
        @Override
        public int compare(Item o1, Item o2) {
            return Integer.parseInt(o2.getName())-Integer.parseInt(o1.getName());
        }
    };

    public static Comparator<Item> itemComparatorCh = new Comparator<Item>() {
        @Override
        public int compare(Item o1, Item o2) {
            return Integer.parseInt(o1.getRate())-Integer.parseInt(o2.getRate());
        }
    };

    @Override
    public int compareTo(Item o) {
        int i = Integer.parseInt(o.getName());
        return Integer.parseInt(this.name) - i;
    }

    @Override
    public String toString() {
        return "Item{" +
                "chiledCategory='" + chiledCategory + '\'' +
                ", heatCategory='" + heatCategory + '\'' +
                ", name='" + name + '\'' +
                ", rate='" + rate + '\'' +
                '}';
    }
}
