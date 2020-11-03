package tests

class CounterTest extends GroovyTestCase {
	private counter
	void setUp() {
		counter = new Counter()
	}
	void testCounterWorks() {
		assertEquals(2, counter.biggerThan([5, 10, 15], 7))
	}
}