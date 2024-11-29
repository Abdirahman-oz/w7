Student Management API
This is a Spring Boot application that provides a RESTful API for managing students, including creating, reading, updating, and deleting student records. The data is stored in an H2 in-memory database, with Hibernate managing the ORM.

Features
Create a new student
Fetch all students
Fetch a student by ID
Update student details
Delete a student by ID
Requirements
JDK 11+
Maven
Spring Boot
H2 Database (in-memory)
Setup and Installation
1. Clone the repository
bash
Copy code
git clone https://github.com/your-repo/student-management-api.git
cd student-management-api
2. Build the application
You can build the application using Maven:

bash
Copy code
mvn clean install
3. Run the application
To run the application, execute the following command:

bash
Copy code
mvn spring-boot:run
The application will start on http://localhost:8080.

Endpoints
The following API endpoints are available:

1. Get all students
http
Copy code
GET /api/students
Returns a list of all students.

2. Get a student by ID
http
Copy code
GET /api/students/{id}
Example:

http
Copy code
GET /api/students/1
Returns the student with the specified id.

3. Create a new student
http
Copy code
POST /api/students
Example request body:

json
Copy code
{
    "name": "John Doe",
    "age": 21,
    "email": "johndoe@example.com"
}
Creates a new student record.

4. Update an existing student
http
Copy code
PUT /api/students/{id}
Example request body:

json
Copy code
{
    "name": "John Doe",
    "age": 22,
    "email": "john.doe@example.com"
}
Updates the student with the specified id.

5. Delete a student
http
Copy code
DELETE /api/students/{id}
Deletes the student with the specified id.

Database Configuration
This application uses an H2 in-memory database. The database configuration is provided in the application.properties file:

properties
Copy code
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=root
spring.datasource.password=password

spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=create

spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
The H2 console is available at http://localhost:8080/h2-console.

Technology Stack
Spring Boot: For building the REST API.
Spring Data JPA: For data persistence and interaction with the H2 database.
H2 Database: In-memory database used for testing and development.
License
This project is licensed under the MIT License.
