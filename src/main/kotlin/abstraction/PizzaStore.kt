package abstraction

class PizzaStore {

    fun orderPizza(pizza: Pizza) {
        pizza.prepare()
        pizza.decorate()
        pizza.bake()
        pizza.cutAndBox()
    }
}