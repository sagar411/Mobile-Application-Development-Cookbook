package com.example.workoutapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class WorkoutDetailFragment extends Fragment {

    private  long workoutId;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_workout_detail, container, false);
    }
    public void  setWorkout(long id){
        this.workoutId =id;
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if(view!= null){
            TextView title =(TextView) view.findViewById(R.id.textTitle);
            WorkOut workOut = WorkOut.workouts[(int) workoutId];
            title.setText(workOut.getName());

            TextView description = (TextView) view.findViewById(R.id.textdescription);
            title.setText(workOut.getDescription());
        }
    }
}