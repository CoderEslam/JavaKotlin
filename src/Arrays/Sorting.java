package Arrays;

import java.text.SimpleDateFormat;
import java.util.*;

import static Arrays.Item.itemComparator;
import static Arrays.Item.itemComparatorCh;

public class Sorting {

    public static void main(String[] args) {


//        ArrayList<Item> items = new ArrayList<>();
//        items.add(new Item("ملابس رجالي", "ملابس", "1", "25"));
//        items.add(new Item("ملابس حريمي", "ملابس", "2", "30"));
//        items.add(new Item("ملابس اطفال", "ملابس", "3", "5"));
//        items.add(new Item("ملابس رجالي", "ملابس", "4", "4"));
//        items.add(new Item("ملابس حريمي", "ملابس", "5", "8"));
//        items.add(new Item("ملابس اطفال", "ملابس", "6", "36"));
//        items.add(new Item("جزم اطفال", "جزم", "7", "4"));
//        items.add(new Item("ملابس رجالي", "ملابس", "8", "12"));
//        items.add(new Item("جزم اطفال", "جزم", "9", "89"));
//        items.add(new Item("ملابس رجالي", "ملابس", "10", "52"));
//        items.add(new Item("ملابس حريمي", "ملابس", "11", "63"));
//        items.add(new Item("جزم رجالي", "جزم", "12", "899"));
//        items.add(new Item("جزم اطفال", "جزم", "13", "47"));
//        items.add(new Item("ملابس حريمي", "ملابس", "14", "82"));
//        items.add(new Item("جزم حريمي", "جزم", "15", "13"));
//        items.add(new Item("ملابس اطفال", "ملابس", "16", "35"));
//        items.add(new Item("جزم حريمي", "جزم", "17", "69"));
//        items.add(new Item("جزم حريمي", "جزم", "18", "47"));
//        items.add(new Item("ملابس اطفال", "ملابس", "19", "82"));
//        items.add(new Item("كراسي كبيره", "كراسي", "20", "366"));
//        items.add(new Item("جزم حريمي", "جزم", "21", "2"));
//        items.add(new Item("كمبيوتر منزلي", "كمبيوتر", "22", "1"));
//        items.add(new Item("كمبيوتر محمول", "كمبيوتر", "23", "22"));
//        items.add(new Item("كراسي كبيره", "كراسي", "24", "55"));
//        items.add(new Item("كراسي صغيره", "كراسي", "25", "47"));
//        items.add(new Item("كراسي صغيره", "كراسي", "26", "42"));
//
//        Collections.sort(items, itemComparator);
//
//        System.out.println(items);

        long d = 1647385037050L;
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int m = Calendar.getInstance().get(Calendar.MONTH);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, d MM yyyy HH:mm:ss aaa");
        String s = simpleDateFormat.format(d);
        System.out.println("simpleDateFormat = " + s);
        System.out.println("===" + s.substring(5,7));
//        System.out.println(s.substring(8, 10));
//        System.out.println("Current month = " + String.valueOf(m + 1));
//        int f = Integer.parseInt("01");
//        String ff = String.valueOf(f);
        int sub = Integer.parseInt(s.substring(8, 10));
        System.out.println("Sub = " + sub);
//        System.out.println(ff.equals(String.valueOf(sub)));
//        System.out.println(s.contains(String.valueOf(year)));
        getDate(d);
    }

    public static void getDate(long date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, d MM yyyy HH:mm:ss aaa");
        String d = simpleDateFormat.format(date);
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
        String month = String.valueOf(Integer.parseInt(d.substring(8, 10)));
        System.out.println(d.contains(String.valueOf(currentYear)));
        System.out.println(month.equals(String.valueOf(currentMonth)));
    }

}
