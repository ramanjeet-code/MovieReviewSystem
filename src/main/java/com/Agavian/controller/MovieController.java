package com.Agavian.controller;

import com.Agavian.Entity.Movie;
import com.Agavian.Entity.Reviews;
import com.Agavian.service.MovieService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "Movie", description = "Endpoints for managing Movie")
public class MovieController {

    private MovieService movieService;
    @Autowired
    MovieController(MovieService movieService){
     this.movieService=movieService;
 }

    @GetMapping("/Movies")
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }
    @PostMapping("/addMovie")
    public ResponseEntity<Movie> addMovie(@RequestBody Movie movie){
   System.out.println(movie.getTitle());
  return  ResponseEntity.ok( movieService.addMovie(movie));
    }
    @PostMapping("/{movieId}/reviews")
    public ResponseEntity<Reviews> addReview(@PathVariable int movieId, @RequestBody Reviews review) {
        return ResponseEntity.ok( movieService.addReview(movieId, review));
    }
}
