package com.gquesada.notes.ui.notes.adapters

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gquesada.notes.R
import com.gquesada.notes.ui.notes.viewmodels.NoteAddViewModel

class fragment_note_add : Fragment() {

    companion object {
        fun newInstance() = fragment_note_add()
    }

    private lateinit var viewModel: NoteAddViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_note_add, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(NoteAddViewModel::class.java)
        // TODO: Use the ViewModel
    }

}