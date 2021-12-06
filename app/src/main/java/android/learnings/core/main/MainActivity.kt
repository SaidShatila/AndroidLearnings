package android.learnings.core.main

import android.learnings.VegetablesViewModel
import android.learnings.core.coroutines.LearningCoroutines
import android.learnings.core.dialogs.DialogConfirm
import android.learnings.databinding.ActivityMainBinding
import android.learnings.vegtables.VegetablesListAdapter
import android.learnings.vegtables.data.DemoHelper
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private val adapter = VegetablesListAdapter(onClick = {
        DialogConfirm().show(supportFragmentManager, "")
    })

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater).apply {
//            viewModel = VegetablesViewModel()
        }

//        lifecycleScope.launch {
//            LearningCoroutines.longDelay()
//            binding.root.visibility = View.GONE
//            Toast.makeText(this@MainActivity, "Waiting is over!!", Toast.LENGTH_SHORT).show()
//
//        }

        binding.root.visibility = View.VISIBLE
        binding.rv.adapter = adapter
        binding.rv.layoutManager = LinearLayoutManager(this)
        adapter.submitList(DemoHelper.getVegetablesList())
        setContentView(binding.root)
    }

}