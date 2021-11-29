package android.learnings.core.main

import android.learnings.VegetablesViewModel
import android.learnings.databinding.ActivityMainBinding
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater).apply {
            viewModel = VegetablesViewModel()
        }


        setContentView(binding.root)
    }

}