package hiroshiDP.adapter.sample.delegateAdapt;

public class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(Banner banner) {
        this.banner = banner;
    }

    @Override
    public void printWeak() {
        banner.showWithParan();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
