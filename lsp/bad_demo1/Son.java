package bad_demo1;
public class Son extends Father {

    @Override
    public void fun(int a, int b) {
        System.out.println(a + "-" + b + "=" + (a - b));
    }
}