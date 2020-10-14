package edu.depaul.cdm.demo.student.demo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


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