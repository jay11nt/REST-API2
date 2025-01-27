# REST-API 2
![crudoperation](https://img.shields.io/badge/crud_operation-2F3134?style=for-the-badge&logo=crud_operation&logoColor=white)

 🔸 Spring Boot project performing crud operation, building RESTful services.

- ### Step 1: Set Up the Spring Boot Project
 
  You can create a Spring Boot project using Spring Initializr or manually.
  
- ### Step 2: Application Properties Configuration
  
  In src/main/resources/application.properties, configure database (H2 is used here for simplicity):
  
- ### Step 3: Create Entity Classes
  
  Create the Cat and Dog entity classes with @Entity annotation to define them as database models.
  
- ### Step 4: Create Repository Interfaces
  
  Create JpaRepository interfaces for the Cat and Dog entities
  
- ### Step 5: Create Service Classes-

  Services handle the business logic and communication with repositories.

- ### Step 6: Create Controller Classes-
  
  The controller will define the RESTful endpoints
  
- ### Step 7: Running the Application-
  
  In your IDE or terminal, run the Spring Boot application 

- ### Step 8: Example HTTP Requests-
  
  You can now send HTTP requests to interact with your API.
  
   - **(POST Request): Create a Cat**
  
     Endpoint: POST /api/pets/cats

     **Request Body:**
        ```
        {
        "id": 1,
        "name": "Whiskers",
     
        "breed": "Persian"
        }
        ```
  
  - **(GET Request): Get All Cats**
    
     Endpoint: GET /api/pets/cats
    
     **Response:**
      ```
       [
        {
          "id": 1,
    
          "name": "Whiskers",
    
          "breed": "Persian"
         }
       ]
     ```
   - **(POST Request): Create a Dog**
     
     Endpoint: POST /api/pets/dogs

     **Request Body:**
      ```
      {
      "id": 1,
     
      "name": "Buddy",
     
      "breed": "Golden Retriever"
     }
      ```
    
   - **(GET Request): Get All Dogs**
    
      Endpoint: GET /api/pets/dogs
  
      **Response:**
  
       ```
            [
            {
              "id": 1,
              "name": "Buddy",
              "breed": "Golden Retriever"
            }
          ]
       ```
  
- ### Step 9: Test the H2 Database Console (Optional)
  
   If you want to view and interact with the **H2 database**:

   Open a browser and navigate to **http://localhost:8080/h2-console.**

   Use the same JDBC URL and credentials from **application.properties**
  
  
- **application.properties**  **file-**

```
# Database Configuration (For H2 in-memory database)
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true

# Hibernate DDL auto
spring.jpa.hibernate.ddl-auto=update

```
