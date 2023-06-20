package com.gquesada.notes.ui.notes.viewmodels

import androidx.lifecycle.ViewModel
import com.gquesada.notes.data.datasources.LocalNoteDataSource
import com.gquesada.notes.data.repositories.NoteRepositoryImpl
import com.gquesada.notes.domain.repositories.NoteRepository
import com.gquesada.notes.domain.usecases.AddNotesUseCase
import com.gquesada.notes.domain.usecases.GetNotesUseCase

class NoteAddViewModel : ViewModel() {
    private val dataSource = LocalNoteDataSource()
    private val repository: NoteRepository = NoteRepositoryImpl(dataSource)
   //private val getNotesUseCase = GetNotesUseCase()

    private val addNotesUseCase = AddNotesUseCase()
}