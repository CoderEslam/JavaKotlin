public class EbramA extends abstartTest {


    public static void main(String[] args) {
        EbramA ebramA = new EbramA();
        System.out.println(ebramA.Div(50,5));
        System.out.println(ebramA.Mul(50,5));
        System.out.println(ebramA.Sum(10,5));
        System.out.println(ebramA.Sub(10,5));

    }

    @Override
    public int Sum(int n1, int n2) {
        return n1+n2;
    }

    @Override
    public int Sub(int n1, int n2) {
        return n1-n2;
    }
}
