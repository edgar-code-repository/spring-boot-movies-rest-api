package com.example.movies.rest;

import com.example.movies.mapper.GenreMapper;
import com.example.movies.model.Genre;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GenreController {

    static final Logger logger = LoggerFactory.getLogger(GenreController.class);

    @Autowired
    private GenreMapper genreMapper;

    @GetMapping("/genres")
    public List<Genre> getAllGenres() {
        logger.debug("[GenreController][getAllGenres][START]");

        List<Genre> genres = null;
        genres = genreMapper.getGenres();

        if (genres == null) {
            logger.debug("[GenreController][getAllGenres][genres list is null]");
        }
        else {
            logger.debug("[GenreController][getAllGenres][genres size: " + genres.size() + "]");
        }

        logger.debug("[GenreController][getAllGenres][END]");
        return genres;
    }

    @GetMapping("/genres/{id}")
    public Genre getGenreById(@PathVariable("id") Integer id) {
        logger.debug("[GenreController][getGenreById][START]");
        logger.debug("[GenreController][getGenreById][id: " + id + "]");

        Genre genre = null;
        genre = genreMapper.getGenreById(id);

        if (genre == null) {
            logger.debug("[GenreController][getGenreById][genre is null]");
        }
        else {
            logger.debug("[GenreController][getGenreById][genre: " + genre.toString() + "]");
        }

        logger.debug("[GenreController][getGenreById][END]");
        return genre;
    }

    @PostMapping("/genres")
    public Genre addGenre(@RequestBody Genre genre) {
        logger.debug("[GenreController][addGenre][START]");
        logger.debug("[GenreController][addGenre][genre parameter: " + genre.toString() + "]");

        genreMapper.addGenre(genre);

        logger.debug("[GenreController][addGenre][genre created: " + genre.toString() + "]");
        logger.debug("[GenreController][addGenre][END]");
        return genre;
    }

    @PutMapping("/genres/{id}")
    public Genre updateGenre(@RequestBody Genre genre, @PathVariable("id") Integer id) {
        logger.debug("[GenreController][updateGenre][START]");
        logger.debug("[GenreController][updateGenre][id: " + id + "]");
        logger.debug("[GenreController][updateGenre][name: " + genre.getName() + "]");

        genre.setGenreId(id);
        genreMapper.updateGenre(genre);

        Genre genreUpdated = genreMapper.getGenreById(id);

        logger.debug("[GenreController][updateGenre][genre updated: " + genreUpdated.toString() + "]");
        logger.debug("[GenreController][updateGenre][END]");
        return genreUpdated;
    }

    @DeleteMapping("/genres/{id}")
    public void deleteGenre(@PathVariable("id") Integer id) {
        logger.debug("[GenreController][deleteGenre][START]");
        logger.debug("[GenreController][deleteGenre][id: " + id + "]");

        genreMapper.deleteGenre(id);

        logger.debug("[GenreController][deleteGenre][END]");
    }

}
