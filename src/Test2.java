import java.util.ArrayList;

public class Test2 {

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

    }

}
