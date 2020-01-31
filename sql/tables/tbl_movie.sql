CREATE TABLE tbl_movie (
    movie_id int NOT NULL AUTO_INCREMENT,
    title varchar(255) NOT NULL,
    year int NOT NULL,
    poster varchar(255) NOT NULL,
    plot text NOT NULL,
    genre_id int NOT NULL,
    CONSTRAINT tbl_movie_pk PRIMARY KEY (movie_id),
    CONSTRAINT tbl_genre_fk FOREIGN KEY (genre_id) REFERENCES tbl_genre (genre_id)
);