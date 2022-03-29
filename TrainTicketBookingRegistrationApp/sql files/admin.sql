CREATE tablet admin_login
(
admin_id INT AUTO_INCREMENT PRIMARY KEY,
admin_emailId VARCHAR(100)NOT NULL UNIQUE
);
INSERT INTO admin_login(admin_emailId,PASSWORD)VALUES('deviika1611@gmail.com','devika123');
DROP TABLE admin_login;
SELECT*FROM admin_login;