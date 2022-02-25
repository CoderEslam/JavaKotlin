/*
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test2  implements AbsJ{

    public static void main(String[] args) {

        ArrayList<CData> x = new ArrayList<>();
        x.add(new CData(23,"Eslam"));
        x.add(new CData(23,"Eslam"));
        x.add(new CData(23,"Eslam"));
        x.add(new CData(23,"Eslam"));
        x.add(new CData(23,"Eslam"));
        x.add(new CData(23,"Eslam"));
        x.add(new CData(23,"Eslam"));
        x.add(new CData(23,"Eslam"));
        x.set(1,new CData(23,"Ghazy"));

//        System.out.println(x);
        for (CData i :x){
            System.out.println(i);
        }

        System.out.println(x.get(0).getName());


        Map<Integer , TTest> map = new HashMap<>();
        map.put(1,new TTest("Eslam",25));
        map.put(2,new TTest("Eslam",25));
        map.put(3,new TTest("Eslam",25));
        map.put(4,new TTest("Eslam",25));
        map.put(5,new TTest("Eslam",25));
        map.put(6,new TTest("Eslam",25));
        map.put(7,new TTest("Eslam",25));

        for (TTest t:map.values()){
            System.out.println(t);
        }

        for (int t:map.keySet()){
            System.out.println(t);
        }

        Test2 t = new Test2();
        System.out.println(t.Sum(5,10));
        System.out.println(t.Sub(5,10));
    }

    @Override
    public int Sum(int n1, int n2) {
        return n1+n2+10;
    }

    @Override
    public int Sub(int n1, int n2) {
        return n1-n2-5;
    }
}
*/
