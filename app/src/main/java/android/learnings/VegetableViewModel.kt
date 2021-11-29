package android.learnings

data class VegetableViewModel(val vegetable: Vegetable) {
    val weightString = vegetable.weight.toString()
}

data class FruitViewModel(val fruit:Fruit)