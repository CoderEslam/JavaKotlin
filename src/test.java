import com.sun.istack.internal.NotNull;

public class test {

    @Override
    public String toString() {
        return "test{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private String name;
    private int age;

    public test(@NotNull String name, int age) {
        this.name = name;
        this.age = age;
    }
}
