package edu.depaul.cdm.demo.student.demo;

import java.sql.Timestamp;
import lombok.Data;

@Data
public class Students {

    private String name, family_name, ssn, address, state;
    private Timestamp start, end;

    private boolean studentsTakeCourse(String sid, Integer cid){
        return true;
    }
    private boolean studentsDropCourse(String sid, Integer cid){
        return true;
    }
    private boolean payBill(){
        return false;
    }

}
