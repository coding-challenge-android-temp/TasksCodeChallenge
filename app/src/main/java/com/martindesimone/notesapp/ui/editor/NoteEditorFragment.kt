package com.martindesimone.notesapp.ui.editor

import android.app.Application
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar
import com.martindesimone.notesapp.R
import com.martindesimone.notesapp.databinding.FragmentNoteEditorBinding
import com.martindesimone.notesapp.repository.TasksRepository

class NoteEditorFragment : Fragment() {

    private lateinit var binding: FragmentNoteEditorBinding
    private lateinit var repository: TasksRepository
    private lateinit var application: Application
    private lateinit var viewModel: NoteEditorViewModel
    private var dialogView: View? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNoteEditorBinding.inflate(inflater)
        initUI()
        return binding.root
    }

    private fun initUI() {
        @Suppress("UNUSED_VARIABLE")
        application = requireNotNull(this.activity).application

        repository = TasksRepository(application.applicationContext)
        val viewModelFactory = NoteViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory).get((NoteEditorViewModel::class.java))

        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        initObservers()

        binding.navigationUp.setOnClickListener {
            this.findNavController().navigateUp()
        }

        viewModel.taskName.value = requireArguments().getString("taskName", "");
        viewModel.taskNote.value = requireArguments().getString("taskNote", "");
        viewModel.taskDone.value = requireArguments().getBoolean("taskDone", false);

        viewModel.isEdit.value = requireArguments().getString("taskId", "").isNotEmpty()
        viewModel.isNewTask.value = requireArguments().getString("taskId", "").isEmpty()

        binding.saveNoteBtn.setOnClickListener {
            it.hideKeyboard()
            if (binding.titleEditText.text?.trim()?.isEmpty()!! || binding.titleEditText.text?.trim()?.isEmpty()!!) {
                Snackbar.make(binding.noteEditorLayout, getString(R.string.data_required), Snackbar.LENGTH_SHORT).show()
            } else {
                val name = binding.titleEditText.text.toString()
                val text = binding.contentEditText.text.toString()

                viewModel.saveNote(name, text)
            }
        }

        binding.deleteNoteButton.setOnClickListener {
            showMessageConfirmDelete()
        }
    }

    private fun initObservers() {
        viewModel.navigateToList.observe(viewLifecycleOwner, Observer {
            if (it) {
                this.findNavController().navigateUp()
                viewModel.navigateToListDone()
            }
        })

    }

    private fun showMessageConfirmDelete() {
        MaterialAlertDialogBuilder(requireContext())
            .setTitle(resources.getString(R.string.title_delete_note_message))
            .setMessage(resources.getString(R.string.content_delete_note_message))
            .setNeutralButton(resources.getString(R.string.cancel)) { dialog, which ->
                dialog.dismiss()
            }
            .setPositiveButton(resources.getString(R.string.accept)) { dialog, which ->
                val taskId = requireArguments().getString("taskId", "")
                viewModel.deleteNote(taskId = taskId!!)
                dialog.dismiss()
            }
            .show()
    }

    private fun View.hideKeyboard() {
        val inputManager = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputManager.hideSoftInputFromWindow(windowToken, 0)
    }

    override fun getView(): View? {
        return dialogView
    }
}