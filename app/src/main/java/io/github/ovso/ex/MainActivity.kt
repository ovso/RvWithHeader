package io.github.ovso.ex

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.ConcatAdapter
import dagger.hilt.android.AndroidEntryPoint
import io.github.ovso.ex.databinding.ActivityMainBinding
import javax.inject.Inject

private const val TAG = "MainActivity"

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    @Inject
    lateinit var dataSource: DataSource

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        Log.d(TAG, "dataSource: $dataSource")
        val flowerList = dataSource.getFlowerList()
        val headerAdapter = HeaderAdapter()
        val flowersAdapter = FlowersAdapter()
        headerAdapter.submitList(listOf(Triple("FlowerFinder", "10", "Flowers")))
        flowersAdapter.submitList(flowerList.toMutableList()) {
            Log.d(TAG, "FlowersAdapter callback")
        }

        val concatAdapter = ConcatAdapter(headerAdapter, flowersAdapter)
        binding.rvMain.adapter = concatAdapter
    }

}