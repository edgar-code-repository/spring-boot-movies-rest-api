CREATE PROCEDURE insert_movie (OUT movieId INT, IN title VARCHAR(255), IN year int, IN poster VARCHAR(255), IN plot VARCHAR(255), IN genreId INT)
BEGIN
    insert tbl_movie(title, year, poster, plot, genre_id) values (title, year, poster, plot, genreId);
    set movieId = last_insert_id();

    select movieId;

END