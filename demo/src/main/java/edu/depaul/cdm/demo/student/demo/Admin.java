package edu.depaul.cdm.demo.student.demo;

import lombok.Data;

@Data
public class Admin {

    private String name, family_name, ssn, address, state, position;

    private boolean editCourse(){
        return false;
    }
    private boolean teachersTakeCourse(String tid, Integer cid){
        return true;
    }
    private boolean teachersDropCourse(String tid, Integer cid){
        return true;
    }
    private boolean editGrade(){
        return false;
    }
    private boolean studentsTakeCourse(String sid, Integer cid){
        return true;
    }
    private boolean studentsDropCourse(String sid, Integer cid){
        return true;
    }
    private boolean editBill(){
        return false;
    }
}
