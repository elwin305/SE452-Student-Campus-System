package edu.depaul.cdm.demo.student.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        ConnectJDBC con = new ConnectJDBC();
        con.getCoursesData();
    }
}
