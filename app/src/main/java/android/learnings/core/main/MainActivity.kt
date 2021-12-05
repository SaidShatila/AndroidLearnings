package android.learnings.core.main

import android.learnings.VegetablesViewModel
import android.learnings.core.coroutines.LearningCoroutines
import android.learnings.databinding.ActivityMainBinding
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater).apply {
            viewModel = VegetablesViewModel()
        }

        lifecycleScope.launch {
            LearningCoroutines.longDelay()
                binding.root.visibility = View.GONE
                Toast.makeText(this@MainActivity, "Waiting is over!!", Toast.LENGTH_SHORT).show()

        }

        binding.root.visibility = View.VISIBLE

        setContentView(binding.root)
    }

}