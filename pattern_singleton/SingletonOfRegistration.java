
public class SingletonOfRegistration {  
    private static class SingletonHolder {  
    private static final SingletonOfRegistration INSTANCE = new SingletonOfRegistration();  
    }  
    private SingletonOfRegistration (){}  
    public static final SingletonOfRegistration getInstance() {  
    return SingletonHolder.INSTANCE;  
    }  
}