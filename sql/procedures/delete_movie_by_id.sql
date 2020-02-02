CREATE PROCEDURE delete_movie_by_id (IN id INT)
BEGIN
    delete from tbl_movie where movie_id = id;
END