package abstraction

abstract class Pizza {
    abstract fun prepare()
    abstract fun decorate()
    abstract fun bake()
    abstract fun cutAndBox()

    fun doSomething() {
        print("Do something")
    }
}