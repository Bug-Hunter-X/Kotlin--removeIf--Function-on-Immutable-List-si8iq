# Kotlin `removeIf` on Immutable List

This example demonstrates a common error in Kotlin related to the `removeIf` function.  The `removeIf` function modifies the list in place and is only applicable to mutable lists (created with `mutableListOf`).  Using `removeIf` on an immutable list (created with `listOf`) results in a compilation error because immutable lists cannot be modified.