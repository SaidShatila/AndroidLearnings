package android.learnings.core.dialogs

import android.learnings.databinding.DialogConfirmBinding

class DialogConfirmBinder(private val binding: DialogConfirmBinding) {
     fun bind(
        viewModel: DialogConfirmViewModel
    ) {
        binding.pressme.setOnClickListener {
            viewModel.onPositiveButtonClicked()
        }
    }
}