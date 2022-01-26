import com.sun.istack.internal.NotNull;

public class test {

    public test() {
    }

    @Override
    public String toString() {
        return "test{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;

    public test(@NotNull String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {


        for (int i = 124652 ; i <= 124906 ;i++ ){

            System.out.println(i + "        " +Integer.valueOf(++i));


        }

        for (int i = 124995 ; i <= 125004 ;i++ ){

            System.out.println(i + "        " +Integer.valueOf(++i));


        }

    }
}
