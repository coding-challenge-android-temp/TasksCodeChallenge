package com.martindesimone.notesapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.martindesimone.AllTasksQuery
import com.martindesimone.notesapp.databinding.ItemNoteBinding

class NoteAdapter (private val onClickListener: OnClickListener): ListAdapter<AllTasksQuery.AllTask, NoteAdapter.NoteViewHolder>(DiffCallback) {

    var tasks = mutableListOf<AllTasksQuery.AllTask>()

    class NoteViewHolder(private var binding: ItemNoteBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(task: AllTasksQuery.AllTask) {
            binding.task = task
            binding.executePendingBindings()
        }
    }

    override fun submitList(list: MutableList<AllTasksQuery.AllTask>?) {
        if (list != null) {
            tasks = list
        }
        super.submitList(list?.let { ArrayList(list) })
    }

    companion object DiffCallback : DiffUtil.ItemCallback<AllTasksQuery.AllTask>() {
        override fun areItemsTheSame(oldItem: AllTasksQuery.AllTask, newItem: AllTasksQuery.AllTask): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: AllTasksQuery.AllTask, newItem: AllTasksQuery.AllTask): Boolean {
            return oldItem.id() == newItem.id()
        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): NoteAdapter.NoteViewHolder {
        return NoteViewHolder(ItemNoteBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: NoteAdapter.NoteViewHolder, position: Int) {
        val rickAndMorty = getItem(position)
        holder.itemView.setOnClickListener {
            onClickListener.onClick(rickAndMorty)
        }
        holder.bind(rickAndMorty)
    }

    class OnClickListener(val clickListener: (rickAndMorty: AllTasksQuery.AllTask) -> Unit) {
        fun onClick(rickAndMorty: AllTasksQuery.AllTask) = clickListener(rickAndMorty)
    }
}