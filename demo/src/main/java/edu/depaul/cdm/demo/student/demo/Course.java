package edu.depaul.cdm.demo.student.demo;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Course {

    private String studentID, teacherID, grade, state, quarter, tuition;
    private Timestamp start, end;

    private boolean editCourse(){
        return false;
    }

}
