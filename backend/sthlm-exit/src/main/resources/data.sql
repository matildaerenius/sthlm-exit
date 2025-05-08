
DELETE FROM exit_point;
DELETE FROM station;


INSERT INTO station (id, name, line, latitude, longitude)
VALUES (1, 'T-Centralen', 'blå', 59.3302, 18.0595);


INSERT INTO exit_point (id, name, latitude, longitude, train_position, station_id)
VALUES
    (1, 'Sergels torg', 59.3326, 18.0649, 'fram', 1),
    (2, 'Vasagatan', 59.3308, 18.0566, 'bak', 1),
    (3, 'Pendeltåg', 59.3293, 18.0572, 'mitten', 1);
