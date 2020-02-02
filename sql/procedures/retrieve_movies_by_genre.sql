CREATE PROCEDURE retrieve_movies_by_genre (IN id INT)
BEGIN
	select  movie_id as movieId,
	        title,
	        year,
	        poster,
	        plot,
	        genre_id as genreId
	from tbl_movie where genre_id = id;
END