
class Counter(initValue: Int, min: Int, max: Int) {
    var value : Int = initValue
        private set

    var max : Int = max
        private set

    var min : Int = min
        private set

    init {
        check(min <= max) { "invalid parameter" }
    }

    fun increment() {
        if (value == max) return
        value++
    }

    fun decrement() {
        if (value == min) return
        value--
    }
}