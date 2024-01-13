package com.muez.rating.controller;

import com.muez.rating.entities.Rating;
import com.muez.rating.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {

    @Autowired
    private RatingService ratingService;


    //create
    @PostMapping
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating){
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.create(rating));
    }

    //getAllRating
    @GetMapping
    public ResponseEntity<List<Rating>> getAllRating(){
        return ResponseEntity.ok(ratingService.getAllRatings());
    }

//    getAllByHotelId
    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>> getAllbyHotelId(@PathVariable String hotelId){
        return ResponseEntity.ok(ratingService.getAllRatingByHotelId(hotelId));
    }

    //getAllByUserId
    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>> getAllByUserId(@PathVariable String userId){
        return ResponseEntity.ok(ratingService.getAllRatingByUserId(userId));
    }
}
