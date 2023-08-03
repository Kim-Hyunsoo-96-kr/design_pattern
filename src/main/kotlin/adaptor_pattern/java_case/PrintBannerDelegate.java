package adaptor_pattern.java_case;

public class PrintBannerDelegate extends PrintDelegate {
    private Banner banner;

    public PrintBannerDelegate(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
