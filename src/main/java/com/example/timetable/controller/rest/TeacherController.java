package com.example.timetable.controller.rest;

import com.example.timetable.model.Teacher;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@RestController
public class TeacherController {
    private List<Teacher> teacher = new ArrayList<>(
            Arrays.asList(
                    new Teacher("1", "Jana", "Chemistry"),
                    new Teacher("2", "Halina", "Ukrainian"),
                    new Teacher("3", "Ashot", "English"),
                    new Teacher("4", "Valera", "Matma")
            )
    );

    @RequestMapping("/teach")
    List<Teacher> getAll(){
        return teacher;
    }
}
