package hiroshiDP.templateMethod;

public class Main {
    public static void main(String[] args) {
        AbsatractDisplay d1 = new CharDisplay('H');
        AbsatractDisplay d2 = new StringDisplay("Hello,world!");
        AbsatractDisplay d3 = new StringDisplay("嗨,老伙计♂");
        d1.display();
        d2.display();
        d3.display();
    }
}
