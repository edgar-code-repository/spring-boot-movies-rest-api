CREATE PROCEDURE update_movie_by_id (IN movieId INT, IN title VARCHAR(255), IN year int, IN poster VARCHAR(255), IN plot VARCHAR(255), IN genreId INT)
BEGIN
    update tbl_movie
    set title = title, year = year, poster = poster, plot = plot, genre_id = genreId
	where movie_id = movieId;
END