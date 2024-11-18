# WebDBSpring Project

## Overview
This project is a Spring MVC application built to manage and display product data categorized into multiple sections. The application uses Spring Data JPA for ORM, an H2 in-memory database for storage, and RESTful API endpoints for data retrieval and manipulation. The project demonstrates the use of Java 21 and is configured without front-end templates, focusing solely on back-end API development.

## Features
- CRUD operations for **Categories** and **Products**
- RESTful API endpoints to manage categories and products
- Pagination and sorting for product listings
- Uses H2 in-memory database for data persistence
- Initialized with sample data on startup for quick testing

## Technologies
- **Java 21**
- **Spring Boot**
- **Spring MVC**
- **Spring Data JPA**
- **H2 Database**
- **Hibernate**

## Endpoints
1. **Category Endpoints**
   - `http://localhost:8080/categories` - Retrieves a list of all categories

2. **Product Endpoints**
   - `http://localhost:8080/products` - Retrives a list of all products
   - `GET /products/category/{categoryId}` - Retrieves products by a specific category

## Running the Project
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/k1fl1k/WebDBSpring.git
   cd WebDBSpring
   ```

2. **Run the Application**:
   Use the command below to start the application:
   ```bash
   ./mvnw spring-boot:run
   ```

3. **Access API Endpoints**:
   After starting the application, you can access the endpoints using tools like Postman or a browser at `http://localhost:8080`.

## Database Configuration
The application uses an in-memory H2 database that initializes with sample data for testing. To access the H2 console:
- Go to `http://localhost:8080/h2-console`
- Use the default JDBC URL: `jdbc:h2:mem:testdb`

## Sample Data
Upon startup, the database is populated with sample categories (Electronics, Books, Clothing) and related products. This data is configured in `data.sql`.

## License
This project is open-source and available under the MIT License.
