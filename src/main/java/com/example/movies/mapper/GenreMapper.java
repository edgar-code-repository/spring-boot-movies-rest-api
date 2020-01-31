package com.example.movies.mapper;

import com.example.movies.model.Genre;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GenreMapper {

    public List<Genre> getGenres();

    public Genre getGenreById(int id);

    public void addGenre(Genre genre);

    public void updateGenre(Genre genre);

    public void deleteGenre(int id);

}
