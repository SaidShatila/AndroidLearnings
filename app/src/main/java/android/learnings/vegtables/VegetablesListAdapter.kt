package android.learnings.vegtables

import android.learnings.Vegetable
import android.learnings.databinding.VegetablesItemViewBinding
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class VegetablesListAdapter(private val onClick: () -> Unit) :
    ListAdapter<Vegetable, VegetablesListAdapter.VegetablesViewHolder>(VegetablesListDiff()) {

    class VegetablesViewHolder(
        private val binding: VegetablesItemViewBinding,
        val onClick: () -> Unit
    ) :
        RecyclerView.ViewHolder(binding.root) {
        init {
            binding.root.setOnClickListener {
                onClick()
            }
        }

        fun bind(vegetable: Vegetable) {
            with(binding) {
                title.text = vegetable.title
                weight.text = vegetable.weight.toString()
                color.text = vegetable.color
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VegetablesViewHolder {
        val binding =
            VegetablesItemViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return VegetablesViewHolder(binding, onClick)
    }

    override fun onBindViewHolder(holder: VegetablesViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class VegetablesListDiff() : DiffUtil.ItemCallback<Vegetable>() {

        override fun areItemsTheSame(oldItem: Vegetable, newItem: Vegetable): Boolean {
            return oldItem.title == newItem.title
        }

        override fun areContentsTheSame(oldItem: Vegetable, newItem: Vegetable): Boolean {
            return oldItem == newItem
        }
    }
}