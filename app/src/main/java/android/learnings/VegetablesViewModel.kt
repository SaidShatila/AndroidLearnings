package android.learnings



import android.learnings.vegtables.data.DemoHelper
import me.tatarka.bindingcollectionadapter2.itembindings.OnItemBindClass


class VegetablesViewModel {
    val vegetables = DemoHelper.getVegetablesList().mapNotNull {
        when (it) {
            is Vegetable -> VegetableViewModel(it)
            is Fruit -> FruitViewModel(it)
            else -> null
        }
    }

    val itemBinding = OnItemBindClass<Any>()
        .map(VegetableViewModel::class.java, BR.viewModel, R.layout.vegetables_item_view)
        .map(FruitViewModel::class.java,BR.viewModel,R.layout.fruit_item_view)
}

