class Counter {
	def biggerThan(items, threshold) {
		items.grep{ it > threshold }.size()
	}
}