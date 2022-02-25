public class Operators {


    public static void main(String[] args) {


        int x = 25;
        int c = 15;
//        x |= 3;
        System.out.println(x|c);
        System.out.println(x^c);
        System.out.println(x&c);

        int z = 4;//100
        int z1 = 5; //101
        System.out.println(z<<z1);
        System.out.println(z1<<z);
        int ss = 2;
        System.out.println(z>>ss);

        x |= 15;
        System.out.println(x);

        int i = 0x0000100;
        int ii = 0x0000000;
        System.out.println(0x0000000|0x00000FF);
        System.out.println(4|0x0000000);
        System.out.println(4|0x0000100);

    }

}


