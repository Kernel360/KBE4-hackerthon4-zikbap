USE `zikbap`;

SET GLOBAL local_infile = 1;

INSERT INTO users (email, password, nickname, gender, age, role, created_at, modified_at, deleted_at, deleted)
VALUES
    ('prozikbapler1@example.com', 'password1', '프로직밥러1', 'M', 25, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler2@example.com', 'password2', '프로직밥러2', 'F', 30, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler3@example.com', 'password3', '프로직밥러3', 'M', 22, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler4@example.com', 'password4', '프로직밥러4', 'F', 24, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler5@example.com', 'password5', '프로직밥러5', 'M', 28, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler6@example.com', 'password6', '프로직밥러6', 'F', 25, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler7@example.com', 'password7', '프로직밥러7', 'M', 30, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler8@example.com', 'password8', '프로직밥러8', 'F', 22, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler9@example.com', 'password9', '프로직밥러9', 'M', 24, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler10@example.com', 'password10', '프로직밥러10', 'F', 28, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler11@example.com', 'password11', '프로직밥러11', 'M', 25, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler12@example.com', 'password12', '프로직밥러12', 'F', 30, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler13@example.com', 'password13', '프로직밥러13', 'M', 22, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler14@example.com', 'password14', '프로직밥러14', 'F', 24, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler15@example.com', 'password15', '프로직밥러15', 'M', 28, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler16@example.com', 'password16', '프로직밥러16', 'F', 25, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler17@example.com', 'password17', '프로직밥러17', 'M', 30, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler18@example.com', 'password18', '프로직밥러18', 'F', 22, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler19@example.com', 'password19', '프로직밥러19', 'M', 24, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler20@example.com', 'password20', '프로직밥러20', 'F', 28, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler21@example.com', 'password21', '프로직밥러21', 'M', 25, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler22@example.com', 'password22', '프로직밥러22', 'F', 30, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler23@example.com', 'password23', '프로직밥러23', 'M', 22, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler24@example.com', 'password24', '프로직밥러24', 'F', 24, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler25@example.com', 'password25', '프로직밥러25', 'M', 28, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler26@example.com', 'password26', '프로직밥러26', 'F', 25, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler27@example.com', 'password27', '프로직밥러27', 'M', 30, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler28@example.com', 'password28', '프로직밥러28', 'F', 22, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler29@example.com', 'password29', '프로직밥러29', 'M', 24, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler30@example.com', 'password30', '프로직밥러30', 'F', 28, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler31@example.com', 'password31', '프로직밥러31', 'M', 25, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler32@example.com', 'password32', '프로직밥러32', 'F', 30, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler33@example.com', 'password33', '프로직밥러33', 'M', 22, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler34@example.com', 'password34', '프로직밥러34', 'F', 24, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler35@example.com', 'password35', '프로직밥러35', 'M', 28, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler36@example.com', 'password36', '프로직밥러36', 'F', 25, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler37@example.com', 'password37', '프로직밥러37', 'M', 30, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler38@example.com', 'password38', '프로직밥러38', 'F', 22, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler39@example.com', 'password39', '프로직밥러39', 'M', 24, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler40@example.com', 'password40', '프로직밥러40', 'F', 28, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler41@example.com', 'password41', '프로직밥러41', 'M', 25, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler42@example.com', 'password42', '프로직밥러42', 'F', 30, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler43@example.com', 'password43', '프로직밥러43', 'M', 22, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler44@example.com', 'password44', '프로직밥러44', 'F', 24, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler45@example.com', 'password45', '프로직밥러45', 'M', 28, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler46@example.com', 'password46', '프로직밥러46', 'F', 25, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler47@example.com', 'password47', '프로직밥러47', 'M', 30, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler48@example.com', 'password48', '프로직밥러48', 'F', 22, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler49@example.com', 'password49', '프로직밥러49', 'M', 24, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler50@example.com', 'password50', '프로직밥러50', 'F', 28, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler51@example.com', 'password51', '프로직밥러51', 'M', 25, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler52@example.com', 'password52', '프로직밥러52', 'F', 30, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler53@example.com', 'password53', '프로직밥러53', 'M', 22, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler54@example.com', 'password54', '프로직밥러54', 'F', 24, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler55@example.com', 'password55', '프로직밥러55', 'M', 28, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler56@example.com', 'password56', '프로직밥러56', 'F', 25, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler57@example.com', 'password57', '프로직밥러57', 'M', 30, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler58@example.com', 'password58', '프로직밥러58', 'F', 22, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler59@example.com', 'password59', '프로직밥러59', 'M', 24, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler60@example.com', 'password60', '프로직밥러60', 'F', 28, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler61@example.com', 'password61', '프로직밥러61', 'M', 25, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler62@example.com', 'password62', '프로직밥러62', 'F', 30, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler63@example.com', 'password63', '프로직밥러63', 'M', 22, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler64@example.com', 'password64', '프로직밥러64', 'F', 24, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler65@example.com', 'password65', '프로직밥러65', 'M', 28, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler66@example.com', 'password66', '프로직밥러66', 'F', 25, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler67@example.com', 'password67', '프로직밥러67', 'M', 30, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler68@example.com', 'password68', '프로직밥러68', 'F', 22, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler69@example.com', 'password69', '프로직밥러69', 'M', 24, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler70@example.com', 'password70', '프로직밥러70', 'F', 28, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler71@example.com', 'password71', '프로직밥러71', 'M', 25, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler72@example.com', 'password72', '프로직밥러72', 'F', 30, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler73@example.com', 'password73', '프로직밥러73', 'M', 22, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler74@example.com', 'password74', '프로직밥러74', 'F', 24, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler75@example.com', 'password75', '프로직밥러75', 'M', 28, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler76@example.com', 'password76', '프로직밥러76', 'F', 25, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler77@example.com', 'password77', '프로직밥러77', 'M', 30, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler78@example.com', 'password78', '프로직밥러78', 'F', 22, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler79@example.com', 'password79', '프로직밥러79', 'M', 24, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler80@example.com', 'password80', '프로직밥러80', 'F', 28, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler81@example.com', 'password81', '프로직밥러81', 'M', 25, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler82@example.com', 'password82', '프로직밥러82', 'F', 30, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler83@example.com', 'password83', '프로직밥러83', 'M', 22, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler84@example.com', 'password84', '프로직밥러84', 'F', 24, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler85@example.com', 'password85', '프로직밥러85', 'M', 28, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler86@example.com', 'password86', '프로직밥러86', 'F', 25, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler87@example.com', 'password87', '프로직밥러87', 'M', 30, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler88@example.com', 'password88', '프로직밥러88', 'F', 22, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler89@example.com', 'password89', '프로직밥러89', 'M', 24, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler90@example.com', 'password90', '프로직밥러90', 'F', 28, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler91@example.com', 'password91', '프로직밥러91', 'M', 25, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler92@example.com', 'password92', '프로직밥러92', 'F', 30, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler93@example.com', 'password93', '프로직밥러93', 'M', 22, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler94@example.com', 'password94', '프로직밥러94', 'F', 24, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler95@example.com', 'password95', '프로직밥러95', 'M', 28, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler96@example.com', 'password96', '프로직밥러96', 'F', 25, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler97@example.com', 'password97', '프로직밥러97', 'M', 30, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler98@example.com', 'password98', '프로직밥러98', 'F', 22, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler99@example.com', 'password99', '프로직밥러99', 'M', 24, 'user', NOW(), NULL, NULL, 0),
    ('prozikbapler100@example.com', 'password100', '프로직밥러100', 'F', 28, 'user', NOW(), NULL, NULL, 0);

INSERT INTO categories (category_id, name) VALUES (1, '한식');
INSERT INTO categories (category_id, name) VALUES (2, '중식');
INSERT INTO categories (category_id, name) VALUES (3, '일식');
INSERT INTO categories (category_id, name) VALUES (4, '양식');

SET @restaurant_id_counter = 0;
LOAD DATA LOCAL INFILE '/src/main/resources/kindsikdang.csv'
    INTO TABLE restaurants
    FIELDS TERMINATED BY ',' ENCLOSED BY '"'
    LINES TERMINATED BY '\r\n'
    IGNORE 1 LINES
    (@업종명, @업소명, @주요품목, @주요품목2, @가격, @가격2, @전화번호, @주소)
    SET restaurant_id = @restaurant_id_counter := @restaurant_id_counter + 1,
        restaurant_name = @업소명,
        location_category = CASE
                                WHEN LOCATE('중구', @주소) > 0 THEN '사대문'
                                WHEN LOCATE('영등포구', @주소) > 0 THEN '여의도'
                                WHEN LOCATE('강남구', @주소) > 0 THEN '강남'
                                ELSE '기타'
            END,  -- Set location_category based on @주소
        location_detail = @주소,
        rating = 0.0,
        review_count = 0,
        phone_number = REPLACE(@전화번호, '-', ''),  -- Parse @전화번호 to remove '-'
        created_at = NOW(),
        modified_at = NULL,
        deleted_at = NULL,
        deleted = 0,
        category_id = CASE
                          WHEN LOCATE('한식', @업종명) > 0 THEN 1
                          WHEN LOCATE('중식', @업종명) > 0 THEN 2
                          WHEN LOCATE('일식', @업종명) > 0 THEN 3
                          WHEN LOCATE('양식', @업종명) > 0 THEN 4
                          ELSE 5
            END;

DELETE FROM restaurants WHERE location_category = '기타';

-- Generate random reviews data for a total of 100 reviews
INSERT INTO reviews (restaurant_id, user_id, content, rating, created_at, modified_at, deleted_at, deleted)
VALUES
    ((SELECT restaurant_id FROM RESTAURANTS ORDER BY FLOOR(RAND() * 101) LIMIT 1), (SELECT user_id FROM users ORDER BY RAND() LIMIT 1), '맛있어요! 다음에 또 올께요~ ^^', ROUND(RAND() * 4 + 1, 0), NOW(), NULL, NULL, 0),
    ((SELECT restaurant_id FROM RESTAURANTS ORDER BY FLOOR(RAND() * 101) LIMIT 1), (SELECT user_id FROM users ORDER BY RAND() LIMIT 1), '맛있어요! 다음에 또 올께요~ ^^', ROUND(RAND() * 4 + 1, 0), NOW(), NULL, NULL, 0),
    ((SELECT restaurant_id FROM RESTAURANTS ORDER BY FLOOR(RAND() * 101) LIMIT 1), (SELECT user_id FROM users ORDER BY RAND() LIMIT 1), '맛있어요! 다음에 또 올께요~ ^^', ROUND(RAND() * 4 + 1, 0), NOW(), NULL, NULL, 0),
    ((SELECT restaurant_id FROM RESTAURANTS ORDER BY FLOOR(RAND() * 101) LIMIT 1), (SELECT user_id FROM users ORDER BY RAND() LIMIT 1), '맛있어요! 다음에 또 올께요~ ^^', ROUND(RAND() * 4 + 1, 0), NOW(), NULL, NULL, 0),
    ((SELECT restaurant_id FROM RESTAURANTS ORDER BY FLOOR(RAND() * 101) LIMIT 1), (SELECT user_id FROM users ORDER BY RAND() LIMIT 1), '맛있어요! 다음에 또 올께요~ ^^', ROUND(RAND() * 4 + 1, 0), NOW(), NULL, NULL, 0),
    ((SELECT restaurant_id FROM RESTAURANTS ORDER BY FLOOR(RAND() * 101) LIMIT 1), (SELECT user_id FROM users ORDER BY RAND() LIMIT 1), '맛있어요! 다음에 또 올께요~ ^^', ROUND(RAND() * 4 + 1, 0), NOW(), NULL, NULL, 0),
    ((SELECT restaurant_id FROM RESTAURANTS ORDER BY FLOOR(RAND() * 101) LIMIT 1), (SELECT user_id FROM users ORDER BY RAND() LIMIT 1), '맛있어요! 다음에 또 올께요~ ^^', ROUND(RAND() * 4 + 1, 0), NOW(), NULL, NULL, 0),
    ((SELECT restaurant_id FROM RESTAURANTS ORDER BY FLOOR(RAND() * 101) LIMIT 1), (SELECT user_id FROM users ORDER BY RAND() LIMIT 1), '맛있어요! 다음에 또 올께요~ ^^', ROUND(RAND() * 4 + 1, 0), NOW(), NULL, NULL, 0),
    ((SELECT restaurant_id FROM RESTAURANTS ORDER BY FLOOR(RAND() * 101) LIMIT 1), (SELECT user_id FROM users ORDER BY RAND() LIMIT 1), '맛있어요! 다음에 또 올께요~ ^^', ROUND(RAND() * 4 + 1, 0), NOW(), NULL, NULL, 0),
    ((SELECT restaurant_id FROM RESTAURANTS ORDER BY FLOOR(RAND() * 101) LIMIT 1), (SELECT user_id FROM users ORDER BY RAND() LIMIT 1), '맛있어요! 다음에 또 올께요~ ^^', ROUND(RAND() * 4 + 1, 0), NOW(), NULL, NULL, 0),
    ((SELECT restaurant_id FROM RESTAURANTS ORDER BY FLOOR(RAND() * 101) LIMIT 1), (SELECT user_id FROM users ORDER BY RAND() LIMIT 1), '맛있어요! 다음에 또 올께요~ ^^', ROUND(RAND() * 4 + 1, 0), NOW(), NULL, NULL, 0),
    ((SELECT restaurant_id FROM RESTAURANTS ORDER BY FLOOR(RAND() * 101) LIMIT 1), (SELECT user_id FROM users ORDER BY RAND() LIMIT 1), '맛있어요! 다음에 또 올께요~ ^^', ROUND(RAND() * 4 + 1, 0), NOW(), NULL, NULL, 0),
    ((SELECT restaurant_id FROM RESTAURANTS ORDER BY FLOOR(RAND() * 101) LIMIT 1), (SELECT user_id FROM users ORDER BY RAND() LIMIT 1), '맛있어요! 다음에 또 올께요~ ^^', ROUND(RAND() * 4 + 1, 0), NOW(), NULL, NULL, 0),
    ((SELECT restaurant_id FROM RESTAURANTS ORDER BY FLOOR(RAND() * 101) LIMIT 1), (SELECT user_id FROM users ORDER BY RAND() LIMIT 1), '맛있어요! 다음에 또 올께요~ ^^', ROUND(RAND() * 4 + 1, 0), NOW(), NULL, NULL, 0),
    ((SELECT restaurant_id FROM RESTAURANTS ORDER BY FLOOR(RAND() * 101) LIMIT 1), (SELECT user_id FROM users ORDER BY RAND() LIMIT 1), '맛있어요! 다음에 또 올께요~ ^^', ROUND(RAND() * 4 + 1, 0), NOW(), NULL, NULL, 0),
    ((SELECT restaurant_id FROM RESTAURANTS ORDER BY FLOOR(RAND() * 101) LIMIT 1), (SELECT user_id FROM users ORDER BY RAND() LIMIT 1), '맛있어요! 다음에 또 올께요~ ^^', ROUND(RAND() * 4 + 1, 0), NOW(), NULL, NULL, 0),
    ((SELECT restaurant_id FROM RESTAURANTS ORDER BY FLOOR(RAND() * 101) LIMIT 1), (SELECT user_id FROM users ORDER BY RAND() LIMIT 1), '맛있어요! 다음에 또 올께요~ ^^', ROUND(RAND() * 4 + 1, 0), NOW(), NULL, NULL, 0),
    ((SELECT restaurant_id FROM RESTAURANTS ORDER BY FLOOR(RAND() * 101) LIMIT 1), (SELECT user_id FROM users ORDER BY RAND() LIMIT 1), '맛있어요! 다음에 또 올께요~ ^^', ROUND(RAND() * 4 + 1, 0), NOW(), NULL, NULL, 0),
    ((SELECT restaurant_id FROM RESTAURANTS ORDER BY FLOOR(RAND() * 101) LIMIT 1), (SELECT user_id FROM users ORDER BY RAND() LIMIT 1), '맛있어요! 다음에 또 올께요~ ^^', ROUND(RAND() * 4 + 1, 0), NOW(), NULL, NULL, 0),
    ((SELECT restaurant_id FROM RESTAURANTS ORDER BY FLOOR(RAND() * 101) LIMIT 1), (SELECT user_id FROM users ORDER BY RAND() LIMIT 1), '맛있어요! 다음에 또 올께요~ ^^', ROUND(RAND() * 4 + 1, 0), NOW(), NULL, NULL, 0),
    ((SELECT restaurant_id FROM RESTAURANTS ORDER BY FLOOR(RAND() * 101) LIMIT 1), (SELECT user_id FROM users ORDER BY RAND() LIMIT 1), '맛있어요! 다음에 또 올께요~ ^^', ROUND(RAND() * 4 + 1, 0), NOW(), NULL, NULL, 0),
    ((SELECT restaurant_id FROM RESTAURANTS ORDER BY FLOOR(RAND() * 101) LIMIT 1), (SELECT user_id FROM users ORDER BY RAND() LIMIT 1), '맛있어요! 다음에 또 올께요~ ^^', ROUND(RAND() * 4 + 1, 0), NOW(), NULL, NULL, 0),
    ((SELECT restaurant_id FROM RESTAURANTS ORDER BY FLOOR(RAND() * 101) LIMIT 1), (SELECT user_id FROM users ORDER BY RAND() LIMIT 1), '맛있어요! 다음에 또 올께요~ ^^', ROUND(RAND() * 4 + 1, 0), NOW(), NULL, NULL, 0),
    ((SELECT restaurant_id FROM RESTAURANTS ORDER BY FLOOR(RAND() * 101) LIMIT 1), (SELECT user_id FROM users ORDER BY RAND() LIMIT 1), '맛있어요! 다음에 또 올께요~ ^^', ROUND(RAND() * 4 + 1, 0), NOW(), NULL, NULL, 0),
    ((SELECT restaurant_id FROM RESTAURANTS ORDER BY FLOOR(RAND() * 101) LIMIT 1), (SELECT user_id FROM users ORDER BY RAND() LIMIT 1), '맛있어요! 다음에 또 올께요~ ^^', ROUND(RAND() * 4 + 1, 0), NOW(), NULL, NULL, 0),
    ((SELECT restaurant_id FROM RESTAURANTS ORDER BY FLOOR(RAND() * 101) LIMIT 1), (SELECT user_id FROM users ORDER BY RAND() LIMIT 1), '맛있어요! 다음에 또 올께요~ ^^', ROUND(RAND() * 4 + 1, 0), NOW(), NULL, NULL, 0),
    ((SELECT restaurant_id FROM RESTAURANTS ORDER BY FLOOR(RAND() * 101) LIMIT 1), (SELECT user_id FROM users ORDER BY RAND() LIMIT 1), '맛있어요! 다음에 또 올께요~ ^^', ROUND(RAND() * 4 + 1, 0), NOW(), NULL, NULL, 0),
    ((SELECT restaurant_id FROM RESTAURANTS ORDER BY FLOOR(RAND() * 101) LIMIT 1), (SELECT user_id FROM users ORDER BY RAND() LIMIT 1), '맛있어요! 다음에 또 올께요~ ^^', ROUND(RAND() * 4 + 1, 0), NOW(), NULL, NULL, 0),
    ((SELECT restaurant_id FROM RESTAURANTS ORDER BY FLOOR(RAND() * 101) LIMIT 1), (SELECT user_id FROM users ORDER BY RAND() LIMIT 1), '맛있어요! 다음에 또 올께요~ ^^', ROUND(RAND() * 4 + 1, 0), NOW(), NULL, NULL, 0),
    ((SELECT restaurant_id FROM RESTAURANTS ORDER BY FLOOR(RAND() * 101) LIMIT 1), (SELECT user_id FROM users ORDER BY RAND() LIMIT 1), '맛있어요! 다음에 또 올께요~ ^^', ROUND(RAND() * 4 + 1, 0), NOW(), NULL, NULL, 0),
    ((SELECT restaurant_id FROM RESTAURANTS ORDER BY FLOOR(RAND() * 101) LIMIT 1), (SELECT user_id FROM users ORDER BY RAND() LIMIT 1), '맛있어요! 다음에 또 올께요~ ^^', ROUND(RAND() * 4 + 1, 0), NOW(), NULL, NULL, 0),
    ((SELECT restaurant_id FROM RESTAURANTS ORDER BY FLOOR(RAND() * 101) LIMIT 1), (SELECT user_id FROM users ORDER BY RAND() LIMIT 1), '맛있어요! 다음에 또 올께요~ ^^', ROUND(RAND() * 4 + 1, 0), NOW(), NULL, NULL, 0),
    ((SELECT restaurant_id FROM RESTAURANTS ORDER BY FLOOR(RAND() * 101) LIMIT 1), (SELECT user_id FROM users ORDER BY RAND() LIMIT 1), '맛있어요! 다음에 또 올께요~ ^^', ROUND(RAND() * 4 + 1, 0), NOW(), NULL, NULL, 0),
    ((SELECT restaurant_id FROM RESTAURANTS ORDER BY FLOOR(RAND() * 101) LIMIT 1), (SELECT user_id FROM users ORDER BY RAND() LIMIT 1), '맛있어요! 다음에 또 올께요~ ^^', ROUND(RAND() * 4 + 1, 0), NOW(), NULL, NULL, 0),
    ((SELECT restaurant_id FROM RESTAURANTS ORDER BY FLOOR(RAND() * 101) LIMIT 1), (SELECT user_id FROM users ORDER BY RAND() LIMIT 1), '맛있어요! 다음에 또 올께요~ ^^', ROUND(RAND() * 4 + 1, 0), NOW(), NULL, NULL, 0),
    ((SELECT restaurant_id FROM RESTAURANTS ORDER BY FLOOR(RAND() * 101) LIMIT 1), (SELECT user_id FROM users ORDER BY RAND() LIMIT 1), '맛있어요! 다음에 또 올께요~ ^^', ROUND(RAND() * 4 + 1, 0), NOW(), NULL, NULL, 0),
    ((SELECT restaurant_id FROM RESTAURANTS ORDER BY FLOOR(RAND() * 101) LIMIT 1), (SELECT user_id FROM users ORDER BY RAND() LIMIT 1), '맛있어요! 다음에 또 올께요~ ^^', ROUND(RAND() * 4 + 1, 0), NOW(), NULL, NULL, 0),
    ((SELECT restaurant_id FROM RESTAURANTS ORDER BY FLOOR(RAND() * 101) LIMIT 1), (SELECT user_id FROM users ORDER BY RAND() LIMIT 1), '맛있어요! 다음에 또 올께요~ ^^', ROUND(RAND() * 4 + 1, 0), NOW(), NULL, NULL, 0),
    ((SELECT restaurant_id FROM RESTAURANTS ORDER BY FLOOR(RAND() * 101) LIMIT 1), (SELECT user_id FROM users ORDER BY RAND() LIMIT 1), '맛있어요! 다음에 또 올께요~ ^^', ROUND(RAND() * 4 + 1, 0), NOW(), NULL, NULL, 0),
    ((SELECT restaurant_id FROM RESTAURANTS ORDER BY FLOOR(RAND() * 101) LIMIT 1), (SELECT user_id FROM users ORDER BY RAND() LIMIT 1), '맛있어요! 다음에 또 올께요~ ^^', ROUND(RAND() * 4 + 1, 0), NOW(), NULL, NULL, 0);

SET @menu_id_counter = 0;
LOAD DATA LOCAL INFILE 'src/main/resources/kindsikdang.csv'
    INTO TABLE menus
    FIELDS TERMINATED BY ',' ENCLOSED BY '"'
    LINES TERMINATED BY '\r\n'
    IGNORE 1 LINES
    (@업종명, @업소명, @주요품목, @주요품목2, @가격, @가격2, @전화번호, @주소)
    SET menu_id = @menu_id_counter := @menu_id_counter + 1,
        name = @주요품목,
        price = @가격,
        description = '백종원도 인정한 그맛',
        image_url = CASE
                        WHEN LOCATE('한식', @업종명) > 0 THEN 'https://i.namu.wiki/i/30cIGmFUmFPtP8m2Ypoh5idWM6IXBygc7dJjpYi3P8ZXhCnixw-aSx4u4qTBbWojL_J3UEH2bkiH7V90iNKSeeZyrXq0AqfMMcZAAFyjFcNvgmGIn8FB115e3JZ2sEEprY4_bMCn6hIQBEDUmZ8ACA.jpg'
                        WHEN LOCATE('중식', @업종명) > 0 THEN 'https://i.namu.wiki/i/G3CQ0pG84tvepCNRYlWC6k9U5-i8OeAfZ5DO928-uP8lHuh8QFZcCfULUSQbSE6PpK840-wZdZoiWG0sbQ5DuR_dTEwhpHYtdrngsPJWPiqXp9tt91JL8m_MkmsCZGRoKv9LE-_jasTHNJvHZNMFeg.webp'
                        WHEN LOCATE('일식', @업종명) > 0 THEN 'https://i.namu.wiki/i/pyK7dKzqwEe-1ZdGESPyVnxhxRM9vBwFdD_-ZuV2YWmRWpvxLU-EMhJZ2lXbgCn9xZtdse9nxKtmXebrb0UWlaWXbf-PDp0EFCJEp7-alWCAP_Mdq4zsPpCpWCPeJYx1PhyHb_KGizSxhlucs8uWug.webp'
                        WHEN LOCATE('양식', @업종명) > 0 THEN 'https://i.namu.wiki/i/nqefwbTr99m-MwjLwZNM1HHV-5FM6Fp8m5UhT_Yoj7LYygkxvJ2a5flqTCeN9efPuuWF2P1qLthG6YC3bsR_-Mt_-KWV0FVVlrY3HjGmpyxIrSxkK0iwhWIFdOQVR7IjrO5JlsGTkZnhwZesL3jxGw.webp'
                        ELSE  ''
            END,
        signature = 1,
        restaurant_id = (SELECT restaurant_id FROM restaurants WHERE restaurant_name = @업소명);

SET @menu2_id_counter = 100;
LOAD DATA LOCAL INFILE 'src/main/resources/kindsikdang.csv'
    INTO TABLE menus
    FIELDS TERMINATED BY ',' ENCLOSED BY '"'
    LINES TERMINATED BY '\r\n'
    IGNORE 1 LINES
    (@업종명, @업소명, @주요품목, @주요품목2, @가격, @가격2, @전화번호, @주소)
    SET menu_id = @menu2_id_counter := @menu2_id_counter + 1,
        name = @주요품목2,
        price = @가격2,
        description = '백종원도 인정한 그맛',
        image_url = CASE
                        WHEN LOCATE('한식', @업종명) > 0 THEN 'https://i.namu.wiki/i/30cIGmFUmFPtP8m2Ypoh5idWM6IXBygc7dJjpYi3P8ZXhCnixw-aSx4u4qTBbWojL_J3UEH2bkiH7V90iNKSeeZyrXq0AqfMMcZAAFyjFcNvgmGIn8FB115e3JZ2sEEprY4_bMCn6hIQBEDUmZ8ACA.jpg'
                        WHEN LOCATE('중식', @업종명) > 0 THEN 'https://i.namu.wiki/i/G3CQ0pG84tvepCNRYlWC6k9U5-i8OeAfZ5DO928-uP8lHuh8QFZcCfULUSQbSE6PpK840-wZdZoiWG0sbQ5DuR_dTEwhpHYtdrngsPJWPiqXp9tt91JL8m_MkmsCZGRoKv9LE-_jasTHNJvHZNMFeg.webp'
                        WHEN LOCATE('일식', @업종명) > 0 THEN 'https://i.namu.wiki/i/pyK7dKzqwEe-1ZdGESPyVnxhxRM9vBwFdD_-ZuV2YWmRWpvxLU-EMhJZ2lXbgCn9xZtdse9nxKtmXebrb0UWlaWXbf-PDp0EFCJEp7-alWCAP_Mdq4zsPpCpWCPeJYx1PhyHb_KGizSxhlucs8uWug.webp'
                        WHEN LOCATE('양식', @업종명) > 0 THEN 'https://i.namu.wiki/i/nqefwbTr99m-MwjLwZNM1HHV-5FM6Fp8m5UhT_Yoj7LYygkxvJ2a5flqTCeN9efPuuWF2P1qLthG6YC3bsR_-Mt_-KWV0FVVlrY3HjGmpyxIrSxkK0iwhWIFdOQVR7IjrO5JlsGTkZnhwZesL3jxGw.webp'
                        ELSE  ''
            END,
        signature = 0,
        restaurant_id = (SELECT restaurant_id FROM restaurants WHERE restaurant_name = @업소명);

UPDATE restaurants r
    JOIN (
        SELECT restaurant_id, AVG(rating) AS avg_rating
        FROM reviews
        GROUP BY
            restaurant_id
    ) rev ON r.restaurant_id = rev.restaurant_id
SET
    r.rating = rev.avg_rating;