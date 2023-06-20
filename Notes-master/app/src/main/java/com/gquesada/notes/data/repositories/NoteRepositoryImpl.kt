package com.gquesada.notes.data.repositories

import com.gquesada.notes.data.datasources.LocalNoteDataSource
import com.gquesada.notes.data.mappers.NoteMapper.toNote
import com.gquesada.notes.data.models.LocalNote
import com.gquesada.notes.domain.models.NoteModel
import com.gquesada.notes.domain.repositories.NoteRepository

class NoteRepositoryImpl(
    private val localNoteDataSource: LocalNoteDataSource
) : NoteRepository {

    override fun getAllNotes(): List<NoteModel> =
        localNoteDataSource.getAllNotes()
            .map { item -> item.toNote() }


    override fun addNote(localNote: LocalNote) {
        localNoteDataSource.addNote(localNote)
    }

    override fun lastIDNote() : Int {
        return localNoteDataSource.lastIDNote()
    }

    override fun lastIDTag() : Int {
        return localNoteDataSource.lastIDTag()
    }

    override fun deleteNote(id: Int){
        localNoteDataSource.deleteNote(id)
    }

}