CREATE PROCEDURE update_genre_by_id (IN id INT, IN name VARCHAR(150))
BEGIN
    update tbl_genre set name = name
	where genre_id = id;
END