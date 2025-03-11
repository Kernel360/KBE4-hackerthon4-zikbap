DROP DATABASE IF EXISTS `zikbap`;
CREATE DATABASE `zikbap`;
USE `zikbap`;
DROP TABLE IF EXISTS restaurants;
DROP TABLE IF EXISTS bookmarks;
DROP TABLE IF EXISTS reviews;
DROP TABLE IF EXISTS menus;
DROP TABLE IF EXISTS categories;
DROP TABLE IF EXISTS restaurants_img;
DROP TABLE IF EXISTS users;

CREATE TABLE `users` (
    `user_id` BIGINT NOT NULL AUTO_INCREMENT,
    `email` VARCHAR(320) NOT NULL UNIQUE KEY,
    `password` VARCHAR(255) NOT NULL,
    `nickname` VARCHAR(8) NOT NULL UNIQUE KEY,
    `gender` ENUM('M', 'F') NOT NULL,
    `age` TINYINT NOT NULL,
    `role` ENUM('admin', 'owner', 'user') NOT NULL,
    `created_at` DATETIME NOT NULL,
    `modified_at` DATETIME NULL,
    `deleted_at` DATETIME NULL,
    `deleted` TINYINT(1) NOT NULL,
    PRIMARY KEY (`user_id`)
);

CREATE TABLE `categories` (
    `category_id` BIGINT NOT NULL,
    `name` VARCHAR(10) NULL,
    PRIMARY KEY (`category_id`)
);

CREATE TABLE restaurants (
    restaurant_id BIGINT NOT NULL AUTO_INCREMENT,
    restaurant_name VARCHAR(32) NOT NULL,
    location_category VARCHAR(10) NOT NULL,
    location_detail VARCHAR(128) NOT NULL,
    rating FLOAT NOT NULL,
    review_count INT NOT NULL,
    phone_number VARCHAR(11) NOT NULL,
    created_at DATETIME NOT NULL,
    modified_at DATETIME NULL,
    deleted_at DATETIME NULL,
    deleted TINYINT(1) NOT NULL,
    category_id BIGINT NOT NULL,
    PRIMARY KEY (restaurant_id),
	FOREIGN KEY (category_id) REFERENCES categories (category_id)
);

CREATE TABLE `bookmarks` (
	`bookmark_id`	BIGINT	NOT NULL AUTO_INCREMENT,
	`user_id`	BIGINT	NOT NULL,
	`restaurant_id`	BIGINT	NOT NULL,
	PRIMARY KEY (`bookmark_id`),
	FOREIGN KEY (`restaurant_id`) REFERENCES `restaurants` (`restaurant_id`),
	FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`)
);

CREATE TABLE `reviews` (
	`review_id`	BIGINT	NOT NULL AUTO_INCREMENT,
	`restaurant_id`	BIGINT	NOT NULL,
	`user_id`	BIGINT	NOT NULL,
	`content`	VARCHAR(200)	NOT NULL,
	`rating`	FLOAT	NOT NULL,
	`created_at`	DATETIME	NOT NULL,
	`modified_at`	DATETIME	NULL,
	`deleted_at`	DATETIME	NULL,
	`deleted`	TINYINT(1)	NOT NULL,
	PRIMARY KEY (`review_id`),
	FOREIGN KEY (`restaurant_id`) REFERENCES `restaurants` (`restaurant_id`),
	FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`)
);

CREATE TABLE `menus` (
	`menu_id`	BIGINT	NOT NULL AUTO_INCREMENT,
	`name`	VARCHAR(8)	NOT NULL,
	`price`	INT	NOT NULL,
	`description`	VARCHAR(32)	NULL,
	`image_url`	VARCHAR(200)	NOT NULL,
	`signature`	TINYINT(1)	NOT NULL,
	`restaurant_id`	BIGINT	NOT NULL,
	PRIMARY KEY (`menu_id`),
	FOREIGN KEY (`restaurant_id`) REFERENCES `restaurants` (`restaurant_id`)
);

CREATE TABLE `restaurants_img` (
	`restaurant_img_id`	BIGINT	NOT NULL AUTO_INCREMENT,
	`img_url`	VARCHAR(200)	NOT NULL,
	`restaurant_id`	BIGINT	NOT NULL,
	PRIMARY KEY (`restaurant_img_id`),
	FOREIGN KEY (`restaurant_id`) REFERENCES `restaurants` (`restaurant_id`)
);