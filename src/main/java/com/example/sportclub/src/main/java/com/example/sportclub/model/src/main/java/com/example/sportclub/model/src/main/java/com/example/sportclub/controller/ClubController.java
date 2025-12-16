package com.example.sportclub.controller;

import com.example.sportclub.model.Trainer;
import com.example.sportclub.model.Training;
import java.util.ArrayList;
import java.util.List;

public class ClubController {

    public List<Trainer> getTrainers() {
        List<Trainer> trainers = new ArrayList<>();
        trainers.add(new Trainer(1L, "Иванов И.И.", "Фитнес", "89990001122"));
        trainers.add(new Trainer(2L, "Петров П.П.", "Бокс", "89991112233"));
        return trainers;
    }

    public List<Training> getSchedule() {
        List<Training> list = new ArrayList<>();
        Trainer t = new Trainer(1L, "Иванов И.И.", "Фитнес", "89990001122");
        list.add(new Training("Фитнес", "2025-05-20", "18:00", t));
        return list;
    }
}
