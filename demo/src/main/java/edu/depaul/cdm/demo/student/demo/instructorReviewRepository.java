package edu.depaul.cdm.demo.student.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface instructorReviewRepository extends MongoRepository<instructorReview, Integer> {

}