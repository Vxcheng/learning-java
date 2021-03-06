// 双检锁/双重校验锁（DCL，即 double-checked locking）
public class SingletonOfDCL {  
    private volatile static SingletonOfDCL singleton;  
    private SingletonOfDCL (){}  
    public static SingletonOfDCL getSingleton() {  
    if (singleton == null) {  
        synchronized (SingletonOfDCL.class) {  
        if (singleton == null) {  
            singleton = new SingletonOfDCL();  
        }  
        }  
    }  
    return singleton;  
    }  

    public void showMessage(){
        System.out.println("Hello World!");
     }
}