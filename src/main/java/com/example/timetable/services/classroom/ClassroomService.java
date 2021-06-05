package com.example.timetable.services.classroom;

import com.example.timetable.model.Classroom;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ClassroomService {
    private List<Classroom> classrooms;

    @PostConstruct
    void init(){
        classrooms = new ArrayList<>(
                Arrays.asList(
                        new Classroom("1", "Laboratory", 20),
                        new Classroom("1", "WC", 30),
                        new Classroom("1", "Assembly Hall", 40),
                        new Classroom("1", "Gym", 50)
                )
        );
    }

    public List<Classroom> getAll() {
        return classrooms;
    }
}

