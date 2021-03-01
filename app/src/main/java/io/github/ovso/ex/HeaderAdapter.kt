package io.github.ovso.ex

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import io.github.ovso.ex.databinding.ItemHeaderBinding

class HeaderAdapter : ListAdapter<Triple<String, String, String>, HeaderAdapter.HeaderViewHolder>(
    object : DiffUtil.ItemCallback<Triple<String, String, String>>() {
        override fun areItemsTheSame(
            oldItem: Triple<String, String, String>,
            newItem: Triple<String, String, String>
        ): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(
            oldItem: Triple<String, String, String>,
            newItem: Triple<String, String, String>
        ): Boolean {
            return areItemsTheSame(oldItem, newItem)
        }
    }
) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeaderViewHolder {
        return HeaderViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: HeaderViewHolder, position: Int) {
        holder.onBindViewHolder(getItem(position))
    }

    class HeaderViewHolder private constructor(
        private val binding: ItemHeaderBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun onBindViewHolder(flowerInfo: Triple<String, String, String>) {
            with(binding) {
                tvHeaderTitle.text = flowerInfo.first
                tvHeaderNumber.text = flowerInfo.second
                tvHeaderText.text = flowerInfo.third
            }
        }

        companion object {
            fun create(parent: ViewGroup): HeaderViewHolder {
                return HeaderViewHolder(
                    ItemHeaderBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }
        }
    }

}


