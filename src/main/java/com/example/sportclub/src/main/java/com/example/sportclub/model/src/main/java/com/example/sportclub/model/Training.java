package com.example.sportclub.model;

public class Training {

    private String title;
    private String date;
    private String time;
    private Trainer trainer;

    public Training(String title, String date, String time, Trainer trainer) {
        this.title = title;
        this.date = date;
        this.time = time;
        this.trainer = trainer;
    }

    public String getTitle() {
        return title;
    }

    public Trainer getTrainer() {
        return trainer;
    }
}
