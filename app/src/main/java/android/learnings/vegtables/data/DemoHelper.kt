package android.learnings.vegtables.data

import android.learnings.Fruit
import android.learnings.Vegetable

object DemoHelper {
    fun getVegetablesList(): MutableList<Vegetable> = mutableListOf(
        Vegetable(
            title = "Apple",
            weight = 0.2F,
            color = "white"
        ), Vegetable(
            title = "Orange",
            weight = 0.5F,
            color = "orange"
        ), Vegetable(
            title = "Guava",
            weight = 0.3F,
            color = "green"
        )
    )
}