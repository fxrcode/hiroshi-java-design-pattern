package hiroshiDP.singleton.sample;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if (obj1.equals(obj2)) {
            System.out.println("same instance");
        } else {
            System.out.println("Not same instance");
        }
        System.out.println("End.");
    }
}
