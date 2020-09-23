package edu.depaul.cdm.demo.student.demo;

import lombok.Data;

@Data
public class Teachers {

    private String name, family_name, ssn, address, state, degree;

    private boolean teachersTakeCourse(String tid, Integer cid){
        return true;
    }
    private boolean teachersDropCourse(String tid, Integer cid){
        return true;
    }
    private boolean giveGrade(){
        return false;
    }
}
