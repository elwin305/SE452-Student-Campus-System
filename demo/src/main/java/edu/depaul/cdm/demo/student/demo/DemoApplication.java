package edu.depaul.cdm.demo.student.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        ConnectJDBC con = new ConnectJDBC();
        con.getCoursesData();
    }


    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

    @Bean
    public CommandLineRunner saveCourseReview(instructorReviewRepository repo) {
        return (args) -> {
            repo.deleteAll();

            instructorReview review1 = new instructorReview();
            review1.setReviewID(1);
            review1.setInstructorID(1);
            review1.setInstructorName("Ken Yu");
            review1.setCourseName("452");
            review1.setDifficulty(4.0);
            review1.setReviewer("James");
            review1.setReviewDate("2018/07/24");
            repo.save(review1);

            instructorReview review2 = new instructorReview();
            review2.setReviewID(2);
            review2.setInstructorID(1);
            review2.setInstructorName("Ken Yu");
            review2.setCourseName("452");
            review2.setDifficulty(5.0);
            review2.setReviewer("Ella");
            review2.setReviewDate("2019/02/20");
            repo.save(review2);

            instructorReview review3 = new instructorReview();
            review3.setReviewID(3);
            review3.setInstructorID(3);
            review3.setInstructorName("Clark Elliott");
            review3.setCourseName("471");
            review3.setDifficulty(3.0);
            review3.setReviewer("Austin");
            review3.setReviewDate("2017/04/08");
            repo.save(review3);

            instructorReview review4 = new instructorReview();
            review4.setReviewID(4);
            review4.setInstructorID(2);
            review4.setInstructorName("Joesph Phillips");
            review4.setCourseName("371");
            review4.setDifficulty(4.5);
            review4.setReviewer("Ashley");
            review4.setReviewDate("2019/09/18");
            repo.save(review4);

            instructorReview review5 = new instructorReview();
            review5.setReviewID(5);
            review5.setInstructorID(2);
            review5.setInstructorName("Joesph Phillips");
            review5.setCourseName("371");
            review5.setDifficulty(4.3);
            review5.setReviewer("River");
            review5.setReviewDate("2020/03/15");
            repo.save(review5);

            instructorReview review6 = new instructorReview();
            review6.setReviewID(6);
            review6.setInstructorID(3);
            review6.setInstructorName("Clark Elliott");
            review6.setCourseName("471");
            review6.setDifficulty(4.7);
            review6.setReviewer("Joy");
            review6.setReviewDate("2017/06/18");
            repo.save(review6);
        };
    }


    //Crud operation
    @Bean
    public CommandLineRunner showAllReview(instructorReviewRepository repo) {
        return (args) -> {
            List<instructorReview> reviews = repo.findAll();
            for (instructorReview review : reviews) {
                log.info(review.toString());
            }
            log.info("------------------------------------------------------");

        };
    }

    //Crud operation
    @Bean
    public CommandLineRunner deleteById(instructorReviewRepository repo) {
        return (args) -> {
            log.info("Before delete: " + repo.count());
            repo.deleteById(5);
            log.info("After delete: " + repo.count());
            log.info("------------------------------------------------------");

        };
    }

    //Crud operation
    @Bean
    public CommandLineRunner findById(instructorReviewRepository repo) {
        return (args) -> {
            log.info("Find review with ID = 5: " + repo.findById(1));


        };
    }
}



