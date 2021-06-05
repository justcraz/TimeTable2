package com.example.timetable.controller.rest;

import com.example.timetable.model.Student;
import com.example.timetable.services.group.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    GroupService service;

    private List<Student> student;


    @PostConstruct
    void init(){
        student = new ArrayList<>(
                Arrays.asList(
                        new Student("1" , "Sasha" , service.getGroupById("4")),
                        new Student("2" , "Vasia" , service.getGroupById("2")),
                        new Student("3" , "Jamshut" , service.getGroupById("3")),
                        new Student("4" , "Ashot" , service.getGroupById("1"))
                )
        );
    }

    @RequestMapping("/student")
    List<Student> getAll(){
        return student;
    }
}