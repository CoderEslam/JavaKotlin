package Arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Collect extends Thread {

    private static ArrayList<ArrayList<ArrayList<Item>>> arrayListOfArrayLists = new ArrayList<>();


    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 20; i++) {
            System.out.println("Threads  =" + i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {


        ArrayList<String> headCategory = new ArrayList<>();
        headCategory.add("ملابس");
        headCategory.add("جزم");
        headCategory.add("كراسي");
        headCategory.add("كمبيوتر");


        ArrayList<String> chileCatgory = new ArrayList<>();
        chileCatgory.add("ملابس رجالي");
        chileCatgory.add("ملابس حريمي");
        chileCatgory.add("ملابس اطفال");
        chileCatgory.add("جزم اطفال");
        chileCatgory.add("جزم رجالي");
        chileCatgory.add("جزم حريمي");
        chileCatgory.add("كراسي كبيره");
        chileCatgory.add("كراسي صغيره");
        chileCatgory.add("كمبيوتر منزلي");
        chileCatgory.add("كمبيوتر محمول");


        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("ملابس رجالي", "ملابس", "1"));
        items.add(new Item("ملابس حريمي", "ملابس", "2"));
        items.add(new Item("ملابس اطفال", "ملابس", "3"));
        items.add(new Item("ملابس رجالي", "ملابس", "4"));
        items.add(new Item("ملابس حريمي", "ملابس", "5"));
        items.add(new Item("ملابس اطفال", "ملابس", "6"));
        items.add(new Item("جزم اطفال", "جزم", "7"));
        items.add(new Item("ملابس رجالي", "ملابس", "8"));
        items.add(new Item("جزم اطفال", "جزم", "9"));
        items.add(new Item("ملابس رجالي", "ملابس", "10"));
        items.add(new Item("ملابس حريمي", "ملابس", "11"));
        items.add(new Item("جزم رجالي", "جزم", "12"));
        items.add(new Item("جزم اطفال", "جزم", "13"));
        items.add(new Item("ملابس حريمي", "ملابس", "14"));
        items.add(new Item("جزم حريمي", "جزم", "15"));
        items.add(new Item("ملابس اطفال", "ملابس", "16"));
        items.add(new Item("جزم حريمي", "جزم", "17"));
        items.add(new Item("جزم حريمي", "جزم", "18"));
        items.add(new Item("ملابس اطفال", "ملابس", "19"));
        items.add(new Item("كراسي كبيره", "كراسي", "20"));
        items.add(new Item("جزم حريمي", "جزم", "21"));
        items.add(new Item("كمبيوتر منزلي", "كمبيوتر", "22"));
        items.add(new Item("كمبيوتر محمول", "كمبيوتر", "23"));
        items.add(new Item("كراسي كبيره", "كراسي", "24"));
        items.add(new Item("كراسي صغيره", "كراسي", "25"));
        items.add(new Item("كراسي صغيره", "كراسي", "26"));

        for (int i = 0; i < headCategory.size(); i++) {
            ArrayList<ArrayList<Item>> arrayListArrayList = new ArrayList<>();
            for (int j = 0; j < chileCatgory.size(); j++) {
                ArrayList<Item> al = new ArrayList<>();
                for (Item item : items) {
                    if (item.getHeatCategory().equals(headCategory.get(i))) {
                        if (item.getChiledCategory().equals(chileCatgory.get(j))) {
                            al.add(item);
                        }
                    }
                }
                arrayListArrayList.add(al);
            }
            arrayListOfArrayLists.add(arrayListArrayList);
        }


//        for (int i = 0; i < c.size(); i++) {
//            ArrayList<Item> itemArrayList = new ArrayList<>();
//            for (Item item : items) {
//                // c.get(i).contains(item.getType())
//                // c.get(i).equals(item.getType())
//                if (item.getType().equals(c.get(i))) { // equals
//                    itemArrayList.add(item);
//                }
//            }
//            arrayListOfArrayLists.add(itemArrayList);
//        }

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

//        for (int j = 0; j < arrayListArrayList.size(); j++) {
//            for (int i = 0; i < arrayListArrayList.get(j).size(); i++) {
//                ArrayList<Item> Col = new ArrayList<>();
//                for (String item : c) {
//                    if (arrayListArrayList.get(j).get(i).getType().equals(item)) {
//                        Col.add(arrayListArrayList.get(j).get(i));
//                        arrayListArrayListclasification.add(Col);
////                        System.out.println(" Item = " + item);
//                    }
//                }
//            }
//        }

        System.out.println("//////////////////////////////////////////////////////////////////////////////////");

        for (ArrayList<ArrayList<Item>> list : arrayListOfArrayLists) {
            for (ArrayList<Item> i : list) {
                if (!i.isEmpty()) {
                    System.out.println(i);
                }
//                for (Item ii : i) {
//
//                }
            }
        }


        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "ljsnclfad");
        map.put("name2", "ljsndygmkyhclfad");
        map.put("name3", "ljsnclfznfgsnfad");
        map.put("name4", "ljsncldndztsbnfad");

        ArrayList<String> list = new ArrayList(map.values());
        Collection<Object> arrayList = map.values();
        System.out.println(list);

//        String anem = "Abd Elrhman Zokla\n+201210717452";
//        String [] n =anem.split("\n");
//        System.out.println(n[0] );


//        for (int i = 0; i <= 10; i++) {
//
//        }

//        int d = 0;
//        switch (d) {
//            case 0:
//                System.out.println(".kn,jn,");
//                break;
//            case 1:
//                System.out.println(".kn,.njln,");
//                break;
//            case 2:
//                System.out.println(".kn,ljnnkjnkjn.,");
//                break;
//            default:
//                System.out.println("nkhbhb,hjbjn");
//        }

        Collect collect = new Collect();
        collect.start();
        Collect collect1 = new Collect();
        try {
            collect1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        collect1.start();



    }


}
