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
