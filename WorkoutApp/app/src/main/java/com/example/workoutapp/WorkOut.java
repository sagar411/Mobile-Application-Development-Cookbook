package com.example.workoutapp;

public class WorkOut {
    private String name;
    private String description;

    public static final WorkOut[] workouts = {
            new WorkOut("The Limb Loosener", " 5 handstand PUSH-UPS \n 10 1-legged squats"),
            new WorkOut("Core Agony", "10 pull-ups \n 100 push-ups \n 100 Squats "),
            new WorkOut(" General warm up", " Identifying the components of an effective and safe warm up, \n critical.")

    };

    private WorkOut(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }


    public String getDescription() {
        return description;
    }


    @Override
    public String toString() {
        return this.name;
    }
}
