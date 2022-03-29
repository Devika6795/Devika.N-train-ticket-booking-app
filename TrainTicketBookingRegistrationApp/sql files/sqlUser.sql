DROP TABLE train_ticket_booking_app_registration;
CREATE TABLE train_ticket_booking_app_registration
(
s_no INT AUTO_INCREMENT PRIMARY KEY,
full_name  VARCHAR(50)NOT NULL,
email_id VARCHAR(50)NOT NULL UNIQUE,
PASSWORD VARCHAR(50)NOT null,
phone_number BIGINT NOT NULL UNIQUE
);
SELECT*FROM train_ticket_booking_app_registration;
INSERT INTO train_ticket_booking_app_registration(full_name,email_id,PASSWORD,phone_number)VALUES('hema','hema@gmail.com','2vtdjh58726','9940889046');
INSERT INTO train_ticket_booking_app_registration(full_name,email_id,PASSWORD,phone_number)VALUES('kavin','kavin12@gmail.com','2xhjh58726','9940995046');
INSERT INTO train_ticket_booking_app_registration(full_name,email_id,PASSWORD,phone_number)VALUES('priya','priya@gmail.com','2xhjh2986','9909995046');











