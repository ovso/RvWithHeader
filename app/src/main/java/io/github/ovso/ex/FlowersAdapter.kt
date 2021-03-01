package io.github.ovso.ex

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import io.github.ovso.ex.databinding.ItemFlowerBinding

class FlowersAdapter : ListAdapter<String, FlowersAdapter.FlowersViewHolder>(
    object : DiffUtil.ItemCallback<String>() {
        override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
            return areItemsTheSame(oldItem, newItem)
        }
    }
) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlowersViewHolder {
        return FlowersViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: FlowersViewHolder, position: Int) {
        holder.onBindViewHolder(getItem(position))
    }

    class FlowersViewHolder private constructor(
        private val binding: ItemFlowerBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun onBindViewHolder(name: String) {
            binding.tvItemName.text = name
        }

        companion object {
            fun create(parent: ViewGroup): FlowersViewHolder {
                return FlowersViewHolder(
                    ItemFlowerBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }
        }
    }

}


