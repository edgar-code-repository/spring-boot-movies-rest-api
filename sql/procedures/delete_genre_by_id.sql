CREATE PROCEDURE delete_genre_by_id (IN id INT)
BEGIN
    delete from tbl_genre where genre_id = id;
END