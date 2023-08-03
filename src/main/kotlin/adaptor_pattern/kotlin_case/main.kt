package adaptor_pattern.kotlin_case

fun main() {
    val p = PrintBanner("Hello")
    p.printWeak()
    p.printStrong()

    val pd = PrintBannerDelegate("Hello Delegate")
    pd.printWeak()
    pd.printStrong()
}