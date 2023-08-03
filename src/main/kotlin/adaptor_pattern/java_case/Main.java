package adaptor_pattern.java_case;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();

        PrintDelegate pd = new PrintBannerDelegate("Hello Delegate");
        pd.printWeak();
        pd.printStrong();
    }
}
