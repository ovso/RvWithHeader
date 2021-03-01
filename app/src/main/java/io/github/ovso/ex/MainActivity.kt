package io.github.ovso.ex

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.ConcatAdapter
import io.github.ovso.ex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        val flowerList = Datasource(this).getFlowerList()
        val headerAdapter = HeaderAdapter()
        val flowersAdapter = FlowersAdapter()
        headerAdapter.submitList(listOf(Triple("FlowerFinder", "10", "Flowers")))
        flowersAdapter.submitList(flowerList.toMutableList()) {
            Log.d("MainActivity", "FlowersAdapter callback")
        }

        val concatAdapter = ConcatAdapter(headerAdapter, flowersAdapter)
        binding.rvMain.adapter = concatAdapter
    }

}