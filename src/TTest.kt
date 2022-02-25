import Arrays.Item

class TTest {


}

fun main() {
    val arrayListOfArrayLists: ArrayList<ArrayList<Item>> = ArrayList<ArrayList<Item>>()
    val c = ArrayList<String>()
    c.add("ملابس رجالي")
    c.add("ملابس حريمي")
    c.add("ملابس اطفال")
    c.add("جزم")
    c.add("كراسي")
    c.add("كمبيوتر")
    c.add("موبيل")
    c.add("اقلام مدرسيه")
    val items: ArrayList<Item> = ArrayList<Item>()
    items.add(Item("1", "ملابس رجالي"))
    items.add(Item("1", "جزم"))
    items.add(Item("2", "ملابس حريمي"))
    items.add(Item("1", "كراسي"))
    items.add(Item("2", "جزم"))
    items.add(Item("1", "كمبيوتر"))
    items.add(Item("2", "كراسي"))
    items.add(Item("1", "موبيل"))
    items.add(Item("3", "كراسي"))
    items.add(Item("3", "ملابس رجالي"))
    items.add(Item("2", "موبيل"))
    items.add(Item("2", "كمبيوتر"))
    items.add(Item("4", "ملابس"))
    items.add(Item("3", "كمبيوتر"))
    items.add(Item("4", "كراسي"))
    items.add(Item("2", "جزم"))
    items.add(Item("5", "ملابس حريمي"))
    items.add(Item("255", "ملابس اطفال"))
    items.add(Item("3", "كمبيوتر"))
    items.add(Item("586", "ملابس اطفال"))
    items.add(Item("1", "اقلام مدرسيه"))
    items.add(Item("2", "اقلام مدرسيه"))
    items.add(Item("3", "اقلام مدرسيه"))
    items.add(Item("4", "اقلام مدرسيه"))
    items.add(Item("5", "اقلام مدرسيه"))
    /*for (i in c.indices) {
        val itemArrayList: ArrayList<Item> = ArrayList<Item>()
        for (item in items) {
            // c.get(i).contains(item.getType())
            // c.get(i).equals(item.getType())
            if (item.getType() == c[i]) { // equals
                itemArrayList.add(item)
            }
        }
        arrayListOfArrayLists.add(itemArrayList)
    }*/

//        for (ArrayList<Item> items1 : arrayListArrayList) {
//            ArrayList<Item> classification = new ArrayList<>();
//            for (int i = 0;i<items1.size();i++) {
//                if (items1.get(i).getType().equals(items.get(i))) {
//                    classification.add(items1.get(i));
//                    arrayListArrayListclasification.add(classification);
//                }
//            }
//        }
    println("//////////////////////////////////////////////////////////////////////////////////")

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
    println("//////////////////////////////////////////////////////////////////////////////////")
    for (list in arrayListOfArrayLists) {
        println(list)
    }


//        String anem = "Abd Elrhman Zokla\n+201210717452";
//        String [] n =anem.split("\n");
//        System.out.println(n[0] );
    for (i in 0..10) {

    }

    val d = 0
    when (d) {
        0 -> println(".kn,jn,")
        1 -> println(".kn,.njln,")
        2 -> println(".kn,ljnnkjnkjn.,")
        else -> println("nkhbhb,hjbjn")
    }


//        String anem = "Abd Elrhman Zokla\n+201210717452";
//        String [] n =anem.split("\n");
//        System.out.println(n[0] );
}