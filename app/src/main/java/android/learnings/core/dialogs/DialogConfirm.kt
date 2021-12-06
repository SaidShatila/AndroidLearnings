package android.learnings.core.dialogs

import android.learnings.databinding.DialogConfirmBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class DialogConfirm() : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = DialogConfirmBinding.inflate(inflater, container, false)
        return binding.apply {
            val viewModel = DialogConfirmViewModel {
                Toast.makeText(context, "Press confirmed", Toast.LENGTH_SHORT).show()
                dismiss()
            }
            DialogConfirmBinder(this).bind(viewModel)
        }.root
    }

}