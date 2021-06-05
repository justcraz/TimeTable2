package com.example.timetable.services.group;

import com.example.timetable.model.Group;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class GroupService {
    private List<Group> groupList = new ArrayList<>(
            Arrays.asList(
                    new Group("1", "Jana"),
                    new Group("2", "Halina"),
                    new Group("3", "Ashot"),
                    new Group("4", "Valera")
            )
    );
    public List<Group> getGroup(){
        return groupList;
    }
    public Group getGroupById(String id) {
        return groupList.stream().filter(item -> item.getId().equals(id))
                .findFirst().get();
    }
}
