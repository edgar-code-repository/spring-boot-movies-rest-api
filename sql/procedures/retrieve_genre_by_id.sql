CREATE PROCEDURE retrieve_genre_by_id (IN id INT)
BEGIN
	select genre_id as genreId, name from tbl_genre where genre_id = id;
END
