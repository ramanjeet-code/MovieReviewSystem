package com.Agavian.controller;

import com.Agavian.Entity.Reviews;
import com.Agavian.service.MovieService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Reviews", description = "Endpoints for managing reviews")
public class ReviewController {
    private MovieService movieService;
   @Autowired
    ReviewController(MovieService movieServic){
 this.movieService=movieServic;

}
    @PutMapping("/{reviewId}")
    public ResponseEntity<Reviews> updateReview(@PathVariable int reviewId, @RequestBody Reviews review) {
        return ResponseEntity.ok(movieService.updateReview(reviewId, review));
    }
}
