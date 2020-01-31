CREATE PROCEDURE insert_genre (OUT genreId INT, IN name VARCHAR(150))
BEGIN
    declare genreId INT default 0;

    insert tbl_genre(name) values (name);
    set genreId = last_insert_id();

    select genreId;

END