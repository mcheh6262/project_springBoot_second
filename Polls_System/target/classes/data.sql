DROP TABLE IF EXISTS customer;

CREATE TABLE users(
    id int NOT NULL AUTO_INCREMENT,
    first_name varchar(255) NOT NULL DEFAULT '',
    last_name varchar(255) NOT NULL DEFAULT '',
    email varchar(255) NOT NULL DEFAULT '',
    age int NOT NULL,
    address varchar(255) NOT NULL DEFAULT '',
    joining_date varchar(255) NOT NULL DEFAULT '',
    PRIMARY KEY (id)
);

INSERT INTO users (first_name, last_name, email, age, address, joining_date)
VALUES ('chedvi', 'baum', '4150155@', 32, 'Ashdod', '28/01/2012'),('tal', 'levi', '4130041@', 19, 'Tel-Aviv', '18/10/2023'),('yoav', 'cohen', 'yoavv@', 40, 'Yavne', '03/02/2022');