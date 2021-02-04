package com.martindesimone.notesapp.ui.list

import android.app.Application
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.martindesimone.notesapp.adapter.NoteAdapter
import com.martindesimone.notesapp.databinding.FragmentListNoteBinding
import com.martindesimone.notesapp.repository.TasksRepository
import com.martindesimone.notesapp.util.hideKeyboard

class NoteListFragment : Fragment() {

    private lateinit var binding: FragmentListNoteBinding
    private lateinit var repository: TasksRepository
    private lateinit var application: Application
    private lateinit var viewModel: NoteListViewModel
    private lateinit var adapter: NoteAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListNoteBinding.inflate(inflater)
        initUI()
        return binding.root
    }

    private fun initUI() {
        @Suppress("UNUSED_VARIABLE")
        application = requireNotNull(activity).application

        repository = TasksRepository(application.applicationContext);
        val viewModelFactory = NoteListViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory).get((NoteListViewModel::class.java))

        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        initObservers()

        adapter = NoteAdapter(NoteAdapter.OnClickListener {
            viewModel.onNoteClicked(it)
        })

        binding.itemGrid.adapter = adapter
    }

    override fun onResume() {
        super.onResume()
        viewModel.refreshTasks()
    }

    private fun initObservers() {
        viewModel.navigateToEditor.observe(viewLifecycleOwner, Observer {
            if (it) {
                this.findNavController().navigate(
                    NoteListFragmentDirections
                    .actionNoteListFragmentToNoteEditorFragment("", "", "", false))
                viewModel.navigateToEditorDone()
                hideKeyboard()
            }
        })

        viewModel.navigateToNoteDetail.observe(viewLifecycleOwner, Observer {
            if (it != null) {
                this.findNavController().navigate(NoteListFragmentDirections.actionNoteListFragmentToNoteEditorFragment(it.name(), it.note() ?: "", it.id(), it.isDone))
                viewModel.onNoteNavigated()
                hideKeyboard()
            }
        })
    }
}