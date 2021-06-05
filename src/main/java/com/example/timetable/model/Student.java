package com.example.timetable.model;

import lombok.AllArgsConstructor;
import lombok.Data;


public class Student {
    private String id;
    private String name;
    private Group group;

    public Student() {
    }

    public Student(String id, String name, Group group) {
        this.id = id;
        this.name = name;
        this.group = group;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
