# CustomerProduct API 🚀  
Spring Boot Application for Java Technical Assessment

A Spring Boot REST API to manage Customers and Products, using MS SQL for data storage. Includes Swagger API documentation, logging, and proper error handling.

## 📖 Features  
✅ RESTful API for managing Customers and Products  
✅ Swagger API documentation  
✅ Logging with Logback  
✅ MS SQL database integration  
✅ Exception handling  
✅ Unit testing with JUnit  
✅ GitHub repository for version control  

---

## 🛠️ Tech Stack  
- **Java 17+**  
- **Spring Boot 3.3+**  
- **Spring MVC**  
- **MS SQL (JPA & Hibernate)**  
- **Swagger (Springdoc OpenAPI)**  
- **Logback for logging**  
- **JUnit for testing**  

---

## 🚀 Getting Started  

### 
1️⃣ Clone the Repository
git clone https://github.com/ayrajfss/CustomerProduct.git
cd CustomerProduct

2️⃣ Configure the Database (MS SQL)
Update src/main/resources/application.properties with your MS SQL database details:

spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=CustomerProduct
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.SQLServerDialect


3️⃣ Build & Run the Application
Using Maven:

mvn clean install
mvn spring-boot:run

📌 API Endpoints
🔹 Customers
Method	Endpoint	Description
GET	/api/customers	Get all customers
GET	/api/customers/{id}	Get a customer by ID
POST	/api/customers	Create a new customer
PUT	/api/customers/{id}	Update a customer
DELETE	/api/customers/{id}	Delete a customer

Example JSON Request (POST /api/customers):

{
  "firstName": "Ayra",
  "lastName": "Zulkifli",
  "emails": ["ayrazulkifli@gmail.com"],
  "familyMembers": ["Ali", "Aisha", "Abu"]
}


🔹 Products
Method	Endpoint	Description
GET	/api/products	Get all products
GET	/api/products/{id}	Get a product by ID
POST	/api/products	Create a new product
PUT	/api/products/{id}	Update a product
DELETE	/api/products/{id}	Delete a product

Example JSON Request (POST /api/products):

{
  "bookTitle": "Spring Boot in Action",
  "bookPrice": 49.99,
  "bookQuantity": 10
}

📜 Swagger API Documentation
Once the application is running, access Swagger UI here:
🔗 http://localhost:8080/swagger-ui/index.html

🛠️ Running Tests
To run unit tests using JUnit, execute:

mvn test

📜 License
This project is free to use and open-source.
