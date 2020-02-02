package com.example.movies.mapper;

import com.example.movies.model.Genre;
import com.example.movies.model.Movie;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MovieMapper {

    public List<Movie> getMoviesByGenre(int genreId);

    public void addMovie(Movie movie);

    public Movie getMovieById(int movieId);

    public void updateMovie(Movie movie);

    public void deleteMovie(int id);

}
