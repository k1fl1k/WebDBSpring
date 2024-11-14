
-- Додавання категорій
INSERT INTO CATEGORY (id, name) VALUES (1, 'Electronics');
INSERT INTO CATEGORY (id, name) VALUES (2, 'Books');
INSERT INTO CATEGORY (id, name) VALUES (3, 'Clothing');

-- Додавання продуктів
INSERT INTO PRODUCT (id, name, price, category_id, image_url) VALUES (1, 'Smartphone', 699.99, 1, 'smartphone.jpg');
INSERT INTO PRODUCT (id, name, price, category_id, image_url) VALUES (2, 'Laptop', 999.99, 1, 'laptop.jpg');
INSERT INTO PRODUCT (id, name, price, category_id, image_url) VALUES (3, 'Novel Book', 19.99, 2, 'novel.jpg');
INSERT INTO PRODUCT (id, name, price, category_id, image_url) VALUES (4, 'T-shirt', 14.99, 3, 'tshirt.jpg');
INSERT INTO PRODUCT (id, name, price, category_id, image_url) VALUES (5, 'Jeans', 39.99, 3, 'jeans.jpg');
