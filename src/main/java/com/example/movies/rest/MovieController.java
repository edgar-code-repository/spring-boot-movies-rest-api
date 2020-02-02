package com.example.movies.rest;

import com.example.movies.mapper.MovieMapper;
import com.example.movies.model.Movie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {

    static final Logger logger = LoggerFactory.getLogger(MovieController.class);

    @Autowired
    private MovieMapper movieMapper;

    @GetMapping("/genres/{genreId}/movies")
    public List<Movie> getMoviesByGenre(@PathVariable int genreId) {
        logger.debug("[MovieController][getMoviesByGenre][START]");

        List<Movie> movies = null;
        movies = movieMapper.getMoviesByGenre(genreId);

        if (movies == null) {
            logger.debug("[MovieController][getMoviesByGenre][movies list is null]");
        }
        else {
            logger.debug("[MovieController][getMoviesByGenre][movies list size: " + movies.size() + "]");
        }

        logger.debug("[MovieController][getMoviesByGenre][END]");
        return movies;
    }

    @GetMapping("/genres/{genreId}/movies/{movieId}")
    public Movie getMovieById(@PathVariable int movieId) {
        logger.debug("[MovieController][getMovieById][START]");
        logger.debug("[MovieController][getMovieById][movieId: " + movieId + "]");

        Movie movie = null;
        movie = movieMapper.getMovieById(movieId);

        logger.debug("[MovieController][getMovieById][movie retrieved: " + movie.toString() + "]");
        logger.debug("[MovieController][getMovieById][END]");
        return movie;
    }

    @PostMapping("/genres/{genreId}/movies")
    public Movie addMovie(@PathVariable int genreId, @RequestBody Movie movie) {
        logger.debug("[MovieController][addMovie][START]");
        logger.debug("[MovieController][addMovie][genreId: " + genreId + "]");
        logger.debug("[MovieController][addMovie][movie parameter: " + movie.toString() + "]");

        movie.setGenreId(genreId);
        movieMapper.addMovie(movie);

        logger.debug("[MovieController][addGenre][movie created: " + movie.toString() + "]");
        logger.debug("[MovieController][addMovie][END]");
        return movie;
    }

    @PutMapping("/genres/{genreId}/movies/{movieId}")
    public Movie updateMovie(@PathVariable int genreId, @RequestBody Movie movie) {
        logger.debug("[MovieController][updateMovie][START]");
        logger.debug("[MovieController][updateMovie][movie parameter: " + movie.toString() + "]");

        movie.setGenreId(genreId);
        movieMapper.updateMovie(movie);

        logger.debug("[MovieController][updateMovie][END]");
        return movie;
    }

    @DeleteMapping("/genres/{genreId}/movies/{movieId}")
    public void deleteMovie(@PathVariable int movieId) {
        logger.debug("[MovieController][updateMovie][START]");
        logger.debug("[MovieController][updateMovie][movieId: " + movieId + "]");

        movieMapper.deleteMovie(movieId);

        logger.debug("[MovieController][updateMovie][END]");
    }

}
