package com.muez.rating.repository;

import com.muez.rating.entities.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface RatingRepository extends MongoRepository<Rating,String> {
    List<Rating> findByUserId(String userID);
    List<Rating> findByHotelId(String userID);
}
