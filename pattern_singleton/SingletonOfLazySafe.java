
public class SingletonOfLazySafe {  
    private static SingletonOfLazySafe instance;  
    private SingletonOfLazySafe (){}  
    public static synchronized SingletonOfLazySafe getInstance() {  
    if (instance == null) {  
        instance = new SingletonOfLazySafe();  
    }  
    return instance;  
    }  
}