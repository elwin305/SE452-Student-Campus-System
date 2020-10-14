package mongo6.example.group6mongo;

import java.util.List;
import java.sql.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static org.springframework.data.mongodb.core.aggregation.ConvertOperators.ToDate.toDate;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}


	private static final Logger log = LoggerFactory.getLogger(Main.class);

	@Bean
	public CommandLineRunner saveCourseReview(insturctorReviewRepository repo) {
		return (args) -> {
			repo.deleteAll();

			insturctorReview review1 = new insturctorReview();
			review1.setReviewID(1);
			review1.setInsturctorID(1);
			review1.setInstructorName("Ken Yu");
			review1.setCourseName("452");
			review1.setDifficulty(4.0);
			review1.setReviewer("James");
			review1.setReviewDate("2018/07/24");
			repo.save(review1);

			insturctorReview review2 = new insturctorReview();
			review2.setReviewID(2);
			review2.setInsturctorID(1);
			review2.setInstructorName("Ken Yu");
			review2.setCourseName("452");
			review2.setDifficulty(5.0);
			review2.setReviewer("Ella");
			review2.setReviewDate("2019/02/20");
			repo.save(review2);

			insturctorReview review3 = new insturctorReview();
			review3.setReviewID(3);
			review3.setInsturctorID(3);
			review3.setInstructorName("Clark Elliott");
			review3.setCourseName("471");
			review3.setDifficulty(3.0);
			review3.setReviewer("Austin");
			review3.setReviewDate("2017/04/08");
			repo.save(review3);

			insturctorReview review4 = new insturctorReview();
			review4.setReviewID(4);
			review4.setInsturctorID(2);
			review4.setInstructorName("Joesph Phillips");
			review4.setCourseName("371");
			review4.setDifficulty(4.5);
			review4.setReviewer("Ashley");
			review4.setReviewDate("2019/09/18");
			repo.save(review4);

			insturctorReview review5 = new insturctorReview();
			review5.setReviewID(5);
			review5.setInsturctorID(2);
			review5.setInstructorName("Joesph Phillips");
			review5.setCourseName("371");
			review5.setDifficulty(4.3);
			review5.setReviewer("River");
			review5.setReviewDate("2020/03/15");
			repo.save(review5);

			insturctorReview review6 = new insturctorReview();
			review6.setReviewID(6);
			review6.setInsturctorID(3);
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
	public CommandLineRunner showAllReview(insturctorReviewRepository repo) {
		return (args) -> {
			List<insturctorReview> reviews = repo.findAll();
			for (insturctorReview review : reviews) {
				log.info(review.toString());
			}
			log.info("------------------------------------------------------");

		};
	}

	//Crud operation
	@Bean
	public CommandLineRunner deleteById(insturctorReviewRepository repo) {
		return (args) -> {
			log.info("Before delete: " + repo.count());
			repo.deleteById(5);
			log.info("After delete: " + repo.count());
			log.info("------------------------------------------------------");

		};
	}

	//Crud operation
	@Bean
	public CommandLineRunner findById(insturctorReviewRepository repo) {
		return (args) -> {
			log.info("Find review with ID = 5: " + repo.findById(1));


		};
	}








}
