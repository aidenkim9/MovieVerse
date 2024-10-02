package com.example.MovieVerse.moviereview.repository;

import com.example.moviereview.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
