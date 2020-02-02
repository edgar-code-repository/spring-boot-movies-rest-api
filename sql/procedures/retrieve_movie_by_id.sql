CREATE PROCEDURE retrieve_movie_by_id (IN id INT)
BEGIN
	select  *
	from tbl_movie where movie_id = id;
END