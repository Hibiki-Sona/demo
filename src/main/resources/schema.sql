CREATE TABLE users(id INT AUTO_INCREMENT,name VARCHAR(64) UNIQUE NOT NULL,gender CHAR(1),age VARCHAR(5),PRIMARY KEY (id))

CREATE TABLE books(id INT AUTO_INCREMENT,title VARCHAR(64) NOT NULL UNIQUE,category VARCHAR(32),number INT,uid INT)