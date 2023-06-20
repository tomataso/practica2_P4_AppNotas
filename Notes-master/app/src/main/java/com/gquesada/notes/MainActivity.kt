package com.gquesada.notes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.gquesada.notes.ui.notes.NoteAddFragment
import com.gquesada.notes.ui.notes.NoteListFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigateToFragment(NoteListFragment(),NoteAddFragment())
    }

    private fun navigateToFragment(noteListfragment: Fragment, noteAddFragment: NoteAddFragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container1, noteListfragment)
            .replace(R.id.fragment_container2, noteAddFragment)
            .commit()


        Log.d("Pruebas", "Esto es una PRUUUUUUUUUUUUUUUUUEBA")


    }






}