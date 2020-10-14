package mongo6.example.group6mongo;

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
public class insturctorReview {
    @Id
    private Integer reviewID;
    private Integer insturctorID;
    private String instructorName;
    private String courseName;
    private Double difficulty;
    private String reviewer;
    private String reviewDate;
}