                                                      Student Management API

This is a Spring Boot application that provides a RESTful API for managing students. 
The application allows you to create, read, update, and delete student records. 
Data is stored in an H2 in-memory database, and Hibernate is used to handle the ORM.


Features
•	Create a new student
•	Fetch all students
•	Fetch a student by ID
•	Update student details
•	Delete a student by ID


Requirements
•	JDK 11+
•	Maven
•	Spring Boot
•	H2 Database (in-memory)


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
