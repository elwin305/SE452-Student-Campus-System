package edu.depaul.cdm.demo.student.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        //Here it should call for the UI to start the program with the login panel
        //The user can login as STUDENT, TEACHER and ADMIN
    }
}
