import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class CounterTest: StringSpec({
    "increment" {
        val counter = Counter(initValue = 0, min = 0, max = 100)
        counter.increment()
        counter.value shouldBe 1
    }
    "increment_when_max_is_exceeded" {
        val counter = Counter(initValue = 0, min = 0, max = 0)
        counter.increment()
        counter.value shouldBe 0
    }
    "decrement" {
        val counter = Counter(initValue = 1, min = 0, max = 100)
        counter.decrement()
        counter.value shouldBe 0
    }
    "decrement_when_min_is_exceeded" {
        val counter = Counter(initValue = 0, min = 0, max = 0)
        counter.decrement()
        counter.value shouldBe 0
    }
})