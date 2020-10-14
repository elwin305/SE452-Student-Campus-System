package group6.project.student_campus_system;


import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "instructorReview_collection")
public class instructorReview {
    @Id
    private Integer reviewID;
    private Integer instructorID;
    private String instructorName;
    private String courseName;
    private Double difficulty;
    private String reviewer;
    private String reviewDate;
}