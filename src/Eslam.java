public class Eslam implements AbsJ {


    public static void main(String[] args) {


        Eslam e = new Eslam();
        System.out.println(e.Sum(50,8));

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
