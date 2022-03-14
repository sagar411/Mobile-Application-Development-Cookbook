package com.example.workoutapp;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class WorkoutListFragment extends ListFragment {





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        String [] names = new String[WorkOut.workouts.length];
        for (int i=0; i<names.length;i++){
            names[i] = WorkOut.workouts[i].getName();

        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
          inflater.getContext(), android.R.layout.simple_list_item_1,names

        );
        setListAdapter(adapter);

        return super.onCreateView(inflater,container,savedInstanceState);
    }

    static  interface Listener{
        void itemClicked(long id);
    }
    private Listener listener;

    @Override
    public void onAttach( Context context) {
        super.onAttach(context);
        this.listener = (Listener) context;
    }

    @Override
    public void onListItemClick( ListView listView,  View itemView, int position, long id) {
       if(listener!= null){
           listener.itemClicked(id);
       }
    }
}

