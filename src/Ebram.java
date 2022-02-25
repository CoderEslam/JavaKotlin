public class Ebram implements AbsJ {

    public static void main(String[] args) {

        Ebram e = new Ebram();
        int d= e.Sum(10,8);
        e.P(d);
        System.out.println(e.Sum(10,20));


    }

    @Override
    public int Sum(int n1, int n2) {
        return n1+n2;
    }

    @Override
    public int Sub(int n1, int n2) {
        return n1-n2;
    }

    public void P(Object o){
        System.out.println(o);
    }
}
