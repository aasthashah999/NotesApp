package com.example.notesapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.notesapp.R;
import com.example.notesapp.models.Note;
import com.example.notesapp.models.adapter;

import java.util.ArrayList;

public class homeFragment extends Fragment {
    public ArrayList<Note> notes;
    public adapter adapter;
    public RecyclerView rvNote;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.homefragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvNote = view.findViewById(R.id.rvNotes);
        notes = new ArrayList<>();
        rvNote.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new adapter(notes);
        rvNote.setAdapter(adapter);


    }
}
