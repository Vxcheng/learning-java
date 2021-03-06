package bad_demo1;
public class Client {

    public static void main(String[] args) {
        Father father = new Father();
        father.fun(1, 2);

        // 父类存在的地方，可以用子类替代
        // 子类Son替代父类Father
        System.out.println("子类替代父类后的运行结果");
                Son son = new Son();
                son.fun(1, 2);
    }
}