create table product (
    id integer AUTO_INCREMENT PRIMARY KEY,
    name varchar(120) NOT NULL,
    description varchar(255) NOT NULL,
    price decimal(10,2)
);