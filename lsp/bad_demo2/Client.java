package bad_demo2;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
        System.out.print("父类的运行结果：");
        Father father=new Father();
        HashMap map=new HashMap();
        father.fun(map);
        
        //父类存在的地方，可以用子类替代
        //子类B替代父类A
        System.out.print("子类替代父类后的运行结果：");
        Sun sun=new Sun();
        sun.fun(map);
    }
}
