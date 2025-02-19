package com.Agavian.service;

import com.Agavian.Entity.Movie;
import com.Agavian.Entity.Reviews;
import com.Agavian.exception.ResourceNotFoundException;
import com.Agavian.repository.MovieRepository;
import com.Agavian.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private ReviewRepository reviewRepository;

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public Reviews addReview(int movieId, Reviews review) {
        Movie movie = movieRepository.findById(movieId).orElseThrow(()->new ResourceNotFoundException("Movie not found"));
        review.setMovie(movie);
        return reviewRepository.save(review);
    }

    public Reviews updateReview(int reviewId, Reviews updatedReview) {
        Reviews review = reviewRepository.findById(reviewId).orElseThrow(()-> new ResourceNotFoundException("Review not found"));
        review.setComment(updatedReview.getComment());
        review.setRating(updatedReview.getRating());
        return reviewRepository.save(review);
    }
}
