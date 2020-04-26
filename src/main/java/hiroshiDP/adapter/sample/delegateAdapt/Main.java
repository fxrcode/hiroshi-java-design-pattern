package hiroshiDP.adapter.sample.delegateAdapt;

import hiroshiDP.adapter.sample.extendAdapt.Print;
import hiroshiDP.adapter.sample.extendAdapt.PrintBanner;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
