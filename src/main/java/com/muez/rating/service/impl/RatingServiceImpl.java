package com.muez.rating.service.impl;

import com.muez.rating.entities.Rating;
import com.muez.rating.repository.RatingRepository;
import com.muez.rating.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    @Override
    public Rating create(Rating rating) {
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getAllRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getAllRatingByUserId(String userID) {
        return ratingRepository.findByUserId(userID);
    }

    @Override
    public List<Rating> getAllRatingByHotelId(String hotelID) {
        return ratingRepository.findByHotelId(hotelID);
    }
}
