INSERT INTO station (name, line, latitude, longitude)
VALUES ('T-Centralen', 'blå', 59.3302, 18.0595);

INSERT INTO exit_point (name, latitude, longitude, train_position, station_id)
VALUES
    ('Sergels torg', 59.3326, 18.0649, 'fram', 1),
    ('Vasagatan', 59.3308, 18.0566, 'bak', 1),
    ('Pendeltåg', 59.3293, 18.0572, 'mitten', 1);
