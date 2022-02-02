package Arrays;

import java.util.ArrayList;

public class Collect {

    private static ArrayList<ArrayList<Item>> arrayListArrayList = new ArrayList<>();
    private static ArrayList<ArrayList<Item>> arrayListArrayListclasification = new ArrayList<>();

    public static void main(String[] args) {


        ArrayList<String> c = new ArrayList<>();
        c.add("ملابس رجالي");
        c.add("ملابس حريمي");
        c.add("ملابس اطفال");
        c.add("جزم");
        c.add("كراسي");
        c.add("كمبيوتر");
        c.add("موبيل");
        c.add("ملابس");


        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("1", "ملابس رجالي"));
        items.add(new Item("1", "جزم"));
        items.add(new Item("2", "ملابس حريمي"));
        items.add(new Item("1", "كراسي"));
        items.add(new Item("2", "جزم"));
        items.add(new Item("1", "كمبيوتر"));
        items.add(new Item("2", "كراسي"));
        items.add(new Item("1", "موبيل"));
        items.add(new Item("3", "كراسي"));
        items.add(new Item("3", "ملابس رجالي"));
        items.add(new Item("2", "موبيل"));
        items.add(new Item("2", "كمبيوتر"));
        items.add(new Item("4", "ملابس"));
        items.add(new Item("3", "كمبيوتر"));
        items.add(new Item("4", "كراسي"));
        items.add(new Item("2", "جزم"));
        items.add(new Item("5", "ملابس حريمي"));
        items.add(new Item("255", "ملابس اطفال"));
        items.add(new Item("586", "ملابس اطفال"));

        for (int i = 0; i < c.size(); i++) {
            ArrayList<Item> itemArrayList = new ArrayList<>();
            for (Item item : items) {
                // c.get(i).contains(item.getType())
                // c.get(i).equals(item.getType())
                if (item.getType().contains(c.get(i))) { // equals
                    itemArrayList.add(item);
                }
            }
            arrayListArrayList.add(itemArrayList);
        }

//        for (ArrayList<Item> items1 : arrayListArrayList) {
//            ArrayList<Item> classification = new ArrayList<>();
//            for (int i = 0;i<items1.size();i++) {
//                if (items1.get(i).getType().equals(items.get(i))) {
//                    classification.add(items1.get(i));
//                    arrayListArrayListclasification.add(classification);
//                }
//            }
//        }
        System.out.println("//////////////////////////////////////////////////////////////////////////////////");

        for (int j = 0; j < arrayListArrayList.size(); j++) {
            for (int i = 0; i < arrayListArrayList.get(j).size(); i++) {
                ArrayList<Item> Col = new ArrayList<>();
                for (String item : c) {
                    if (arrayListArrayList.get(j).get(i).getType().equals(item)) {
                        Col.add(arrayListArrayList.get(j).get(i));
                        arrayListArrayListclasification.add(Col);
//                        System.out.println(" Item = " + item);
                    }
                }
            }
        }

        System.out.println("//////////////////////////////////////////////////////////////////////////////////");

//        for (ArrayList<Item> list : arrayListArrayList) {
//            System.out.println(list);
//        }

        System.out.println("//////////////////////////////////////////////////////////////////////////////////");
//        for (ArrayList<Item> list : arrayListArrayListclasification) {
            System.out.println(arrayListArrayListclasification);
//        }
    }


}
