package com.gquesada.notes.domain.usecases

import android.util.Log
import com.gquesada.notes.data.datasources.LocalNoteDataSource
import com.gquesada.notes.data.models.LocalNote
import com.gquesada.notes.data.models.LocalTag
import com.gquesada.notes.data.repositories.NoteRepositoryImpl
import com.gquesada.notes.domain.repositories.NoteRepository
import java.util.Calendar

class AddNotesUseCase () {

    private val dataSource = LocalNoteDataSource()
    private val repository: NoteRepository = NoteRepositoryImpl(dataSource)
    private val noteRepository: NoteRepository = repository


    fun execute(title: String, label: String, description: String) {


        val lastID = noteRepository.lastIDNote().toString()
        Log.d("AddNotesUseCase", "LAST ID Note: $lastID")
        val lastTAG = noteRepository.lastIDTag().toString()
        Log.d("AddNotesUseCase", "LAST ID TAG: $lastTAG")

        val idNote = noteRepository.lastIDNote() + 1
        val title = title
        val description = description
        val date = getCurrentDate()

        val idTag = noteRepository.lastIDTag() + 1
        val tag = label
        val localTag = LocalTag(idTag,tag)

        // Imprimir los datos en la consola
        Log.d("AddNotesUseCase", "Title: $title")
        Log.d("AddNotesUseCase", "Tag: $tag")
        Log.d("AddNotesUseCase", "Description: $description")




        // Aca se mete los valores a la BD Local
        noteRepository.addNote(localNote = LocalNote(idNote,title,description,localTag, date))







    }

    fun getCurrentDate(): Int {
        val currentDate = Calendar.getInstance()
        val year = currentDate.get(Calendar.YEAR)
        val month = currentDate.get(Calendar.MONTH) + 1  // Los meses se indexan desde 0, por lo que se suma 1
        val day = currentDate.get(Calendar.DAY_OF_MONTH)

        return year * 10000 + month * 100 + day
    }



}