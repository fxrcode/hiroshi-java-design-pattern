package hiroshiDP.adapter.sample.extendAdapt;

public class Banner {
    private String string;
    public Banner(String string) {
        this.string = string;
    }
    public void showWithParan() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
