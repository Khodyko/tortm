INSERT INTO cream (pid, cost_measurement, cost_per_measure_coins, description, img_href, name)
VALUES
    (nextval('cream_seq'), 1, 100, 'Cream A', 'img1.jpg', 'Cream A'),
    (nextval('cream_seq'), 1, 200, 'Cream B', 'img2.jpg', 'Cream B'),
    (nextval('cream_seq'), 1, 150, 'Cream C', 'img3.jpg', 'Cream C'),
    (nextval('cream_seq'), 1, 120, 'Cream D', 'img4.jpg', 'Cream D'),
    (nextval('cream_seq'), 1, 180, 'Cream E', 'img5.jpg', 'Cream E');

INSERT INTO filling (pid, cost_measurement, cost_per_measure_coins, description, img_href, name)
VALUES
    (nextval('filling_seq'), 1, 100, 'Filling A', 'img1.jpg', 'Filling A'),
    (nextval('filling_seq'), 1, 200, 'Filling B', 'img2.jpg', 'Filling B'),
    (nextval('filling_seq'), 1, 150, 'Filling C', 'img3.jpg', 'Filling C'),
    (nextval('filling_seq'), 1, 120, 'Filling D', 'img4.jpg', 'Filling D'),
    (nextval('filling_seq'), 1, 180, 'Filling E', 'img5.jpg', 'Filling E');

INSERT INTO decor (pid, cost_measurement, cost_per_measure_coins, description, img_href, name)
VALUES
    (nextval('decor_seq'), 1, 100, 'Decor A', 'img1.jpg', 'Decor A'),
    (nextval('decor_seq'), 1, 200, 'Decor B', 'img2.jpg', 'Decor B'),
    (nextval('decor_seq'), 1, 150, 'Decor C', 'img3.jpg', 'Decor C'),
    (nextval('decor_seq'), 1, 120, 'Decor D', 'img4.jpg', 'Decor D'),
    (nextval('decor_seq'), 1, 180, 'Decor E', 'img5.jpg', 'Decor E');

INSERT INTO cake (pid, cost_measurement, cost_per_measure_coins, description, img_href, name, def_cream_pid, def_decor_pid, def_filling_pid)
VALUES
    (nextval('cake_seq'), 2, 100, 'Cake A', 'img/menu/desert-tab/dessert-1.png', 'Cake A', 1, 1, 1),
    (nextval('cake_seq'), 2, 100, 'Cake A', 'img/menu/desert-tab/dessert-2.png', 'Cake B', 1, 1, 1),
    (nextval('cake_seq'), 2, 100, 'Cake A', 'img/menu/desert-tab/dessert-3.png', 'Cake C', 1, 1, 1),
    (nextval('cake_seq'), 2, 100, 'Cake A', 'img/menu/desert-tab/dessert-5.png', 'Cake D', 1, 1, 1);

INSERT INTO cream_cake (cake_pid, cream_pid)
VALUES (1, 1);

INSERT INTO filling_cake (cake_pid, filling_pid)
VALUES (1, 1);

INSERT INTO decor_cake (cake_pid, decor_pid)
VALUES (1, 1);