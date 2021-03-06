public class SingletonOfLazyUnsafe {
    private static SingletonOfLazyUnsafe instance;  
    private SingletonOfLazyUnsafe (){}  
  
    public static SingletonOfLazyUnsafe getInstance() {  
    if (instance == null) {  
        instance = new SingletonOfLazyUnsafe();  
    }  
    return instance;  
    }  
}
