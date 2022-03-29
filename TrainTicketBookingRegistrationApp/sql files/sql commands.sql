DROP TABLE train_ticket_booking_app_display;
CREATE TABLE train_ticket_booking_app_display
(
train_id INT,AUTO_INCREMENT PRIMARY KEY,
train_name VARCHAR(50)NOT NULL,
train_from VARCHAR(45)NOT NULL,
train_to VARCHAR(30)NOT NULL,
train_date DATE NOT NULL,
train_timing VARCHAR(5)
);
INSERT INTO train_ticket_booking_app_display (train_name,train_from,train_to,train_date,train_timing) VALUES('chennai Express','chennai','delhi',NOW(),'7:00'),('pandiyan Express','chennai','mumbai',NOW(),'7:40'),('AC Express','chennai','Bangalore',NOW(),'8:00'),('pondicherry Express','chennai','pondicherry',NOW(),'7:10'),('kaniyakumari Express','chennai','kanyakumari',NOW(),'7:30');
SELECT*FROM train_ticket_booking_app_display; 
