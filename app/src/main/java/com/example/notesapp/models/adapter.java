package com.example.notesapp.models;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.notesapp.R;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.ViewHolder> {

    public ArrayList<Note> notes;
    Context context;

    public adapter(ArrayList<Note> notes1){
        notes = notes1;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View note = inflater.inflate(R.layout.item_view, parent, false);
        final ViewHolder viewHolder = new ViewHolder(note);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Note note = notes.get(position);
        holder.note.setText(note.getString());

    }

    @Override
    public int getItemCount() {
        return notes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView note;
        public ViewHolder(View itemView){
            super(itemView);
            note = itemView.findViewById(R.id.etNote);
        }


    }
}
