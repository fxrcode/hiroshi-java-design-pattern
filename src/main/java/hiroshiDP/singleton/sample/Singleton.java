package hiroshiDP.singleton.sample;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("Constructed the unique instance");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
