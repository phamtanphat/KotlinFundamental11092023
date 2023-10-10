package abstraction

class PizzaMeat: Pizza() {
    override fun prepare() {
        println("PizzaMeat: prepare")
    }

    override fun decorate() {
        println("PizzaMeat: decorate")
    }

    override fun bake() {
        println("PizzaMeat: bake")
    }

    override fun cutAndBox() {
        println("PizzaMeat: cutAndBox")
    }
}