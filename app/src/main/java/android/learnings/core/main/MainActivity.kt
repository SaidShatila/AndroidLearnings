package android.learnings.core.main

import android.learnings.VegetablesViewModel
import android.learnings.core.coroutines.LearningCoroutines
import android.learnings.databinding.ActivityMainBinding
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater).apply {
            viewModel = VegetablesViewModel()
        }
        lifecycleScope.launch {
            LearningCoroutines.longDelay()
            Toast.makeText(this@MainActivity, "Waiting is over!!", Toast.LENGTH_SHORT).show()
        }
        setContentView(binding.root)
    }

}