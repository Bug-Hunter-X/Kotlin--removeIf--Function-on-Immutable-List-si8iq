fun main() {
    val mutableList = mutableListOf(1, 2, 3, 4, 5)
    mutableList.removeIf { it > 2 }
    println("Mutable list after removeIf: $mutableList") // Output: Mutable list after removeIf: [1, 2]

    val immutableList = listOf(1, 2, 3, 4, 5)
    val filteredList = immutableList.filter { it <= 2 }
    println("Immutable list after filtering: $filteredList") // Output: Immutable list after filtering: [1, 2]
} 