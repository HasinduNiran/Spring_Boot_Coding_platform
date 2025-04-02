# Spring Boot MongoDB CRUD Application

## Requirements

- Java JDK 17
- Maven 3.6+ 
- MongoDB (or MongoDB Atlas account)

## Maven Installation

### Windows
1. Download Maven from [Maven's official website](https://maven.apache.org/download.cgi)
2. Extract the archive to a directory of your choice (e.g., `C:\Program Files\Maven`)
3. Add Maven to your system PATH:
   - Open System Properties (Right-click My Computer and select Properties)
   - Click Advanced System Settings
   - Click Environment Variables
   - Under System Variables, find PATH, click Edit
   - Add the path to Maven's bin directory (e.g., `C:\Program Files\Maven\bin`)
4. Verify installation by opening a new command prompt and typing: `mvn -version`

### Alternative: Use Maven Wrapper
If you don't want to install Maven, you can use the Maven Wrapper which is included in the project:
```
./mvnw clean package    # For Linux/Mac
mvnw.cmd clean package  # For Windows
```

## Tech Stack

- Spring Boot 3.1.4
- Spring Data MongoDB
- Lombok
- Spring Validation

## How to Run

1. Clone the repository
2. Update the MongoDB connection string in `src/main/resources/application.properties`
3. Run using Maven:
   ```
   mvn spring-boot:run
   ```
4. Access the API at http://localhost:8080/api/products

## API Endpoints

- GET `/api/products` - Get all products
- GET `/api/products/{id}` - Get a product by ID
- POST `/api/products` - Create a new product
- PUT `/api/products/{id}` - Update a product
- DELETE `/api/products/{id}` - Delete a product
- GET `/api/products/category/{category}` - Get products by category
- GET `/api/products/search?name={name}` - Search products by name

## Sample Product JSON

```json
{
  "name": "Laptop",
  "description": "High-performance gaming laptop",
  "price": 1299.99,
  "category": "Electronics"
}
```
