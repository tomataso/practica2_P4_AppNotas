package com.gquesada.notes.ui.notes;

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.gquesada.notes.R
import android.widget.EditText
import com.gquesada.notes.domain.usecases.AddNotesUseCase

class NoteAddFragment : Fragment() {


    /*

        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
            // Inflar el diseño del fragmento
            return inflater.inflate(R.layout.fragment_note_add, container, false)
        }
*/

    private val addNotesUseCase = AddNotesUseCase()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_note_add, container, false)

        val btnSubmit = view.findViewById<Button>(R.id.btnSubmit)
        val titleEditText = view.findViewById<EditText>(R.id.note_tittle_add)
        val tagEditText = view.findViewById<EditText>(R.id.note_tag_add)
        val descriptionEditText = view.findViewById<EditText>(R.id.note_description_add)

        btnSubmit.setOnClickListener {
            val title = titleEditText.text.toString()
            val tag = tagEditText.text.toString()
            val description = descriptionEditText.text.toString()

            Log.d("NoteAddFragment", "Title: $title")
            Log.d("NoteAddFragment", "Tag: $tag")
            Log.d("NoteAddFragment", "Description: $description")

            // Manda los datos al AddNotesUseCase
            addNotesUseCase.execute(title, tag, description)
        }



        return view
    }




}
