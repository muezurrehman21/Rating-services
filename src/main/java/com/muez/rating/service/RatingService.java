package com.muez.rating.service;

import com.muez.rating.entities.Rating;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RatingService {

    //create
    Rating create(Rating rating);

    //getAllRating
    List<Rating> getAllRatings();

    //getAllByUserID
    List<Rating> getAllRatingByUserId(String userID);

    //getAllByhotelId
    List<Rating> getAllRatingByHotelId(String hotelID);
}
