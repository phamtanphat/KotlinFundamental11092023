package abstraction

class PizzaCheese: Pizza() {
    override fun prepare() {
        println("PizzaCheese: prepare")
    }

    override fun decorate() {
        println("PizzaCheese: decorate")
    }

    override fun bake() {
        println("PizzaCheese: bake")
    }

    override fun cutAndBox() {
        println("PizzaCheese: cutAndBox")
    }
}