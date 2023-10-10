package abstraction

class PizzaVegetable: Pizza() {
    override fun prepare() {
        println("PizzaVegetable: prepare")
    }

    override fun decorate() {
        println("PizzaVegetable: decorate")
    }

    override fun bake() {
        println("PizzaVegetable: bake")
    }

    override fun cutAndBox() {
        println("PizzaVegetable: cutAndBox")
    }
}