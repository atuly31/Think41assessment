CREATE DATABASE Think41;
USE Think41;

CREATE TABLE products (
                          id BIGINT PRIMARY KEY,
                          cost DECIMAL(10,5),
                          category VARCHAR(100),
                          name VARCHAR(255),
                          brand VARCHAR(255),
                          retail_price DECIMAL(10,2),
                          department VARCHAR(50),
                          sku VARCHAR(50),
                          distribution_center_id INT
);

LOAD DATA INFILE 'C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/products.csv'
INTO TABLE products
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS
(id, cost, category, name, brand, retail_price, department, sku, distribution_center_id);

select * from products;
create Table departments (
                             id INT auto_increment primary key,
                             name varchar (100)  Unique not null
);


insert Into departments (name)
select distinct department from products;


Alter table products add column department_id INT;

SET SQL_SAFE_UPDATES = 0;

update products p
    join departments d on p.department = d.name
    Set p.department_id = d.id;

Alter Table products drop  column department;

Alter Table products
    Add constraint fk_department
        foreign key (department_id)
            references departments(id)
