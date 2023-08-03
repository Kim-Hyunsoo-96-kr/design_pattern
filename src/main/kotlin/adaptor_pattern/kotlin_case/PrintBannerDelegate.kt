package adaptor_pattern.kotlin_case

class PrintBannerDelegate(private val string:String):PrintDelegate() {
    private val banner = Banner(string)

    override fun printWeak() {
        banner.showWithParen()
    }

    override fun printStrong() {
        banner.showWithAster()
    }
}