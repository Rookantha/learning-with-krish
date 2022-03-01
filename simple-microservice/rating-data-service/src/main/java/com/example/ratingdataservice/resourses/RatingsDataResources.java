package com.example.ratingdataservice.resourses;

import com.example.ratingdataservice.model.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsDataResources {

    @RequestMapping("/{movieId}")
    public Rating getRatings(@PathVariable("movieId") String movieId){
        return new Rating(movieId,4);
    }
}
