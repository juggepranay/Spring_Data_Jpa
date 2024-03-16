# Spring Data JPA Relationships Example

This project demonstrates how to set up relationships between entities using Spring Data JPA in a Spring Boot application. In this example, we have entities representing Students, Teachers, Courses, and Guardians, with the following relationships:

- One-to-Many: Student to Course, Teacher to Course
- One-to-One: Student to Guardian
- Many-to-One: Course to Teacher

## Entities

### Student
- Represents a student enrolled in courses.
- Has a one-to-one relationship with a Guardian.
- Has a one-to-many relationship with Course.

### Teacher
- Represents a teacher who teaches courses.
- Has a many-to-one relationship with Course.

### Course
- Represents a course that can be taught by a Teacher and taken by Students.
- Has a many-to-one relationship with Teacher.
- Has a one-to-many relationship with Student.

### Guardian
- Represents the guardian or parent of a Student.
- Has a one-to-one relationship with a Student.

## Relationships

### One-to-Many (Student to Course)
- Each student can be enrolled in multiple courses.
- Each course can have multiple students enrolled.

### One-to-One (Student to Guardian)
- Each student has one guardian.
- Each guardian is associated with only one student.

### Many-to-One (Course to Teacher)
- Multiple courses can be taught by the same teacher.
- Each course is taught by one teacher.




## Database Configuration
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password

## Hibernate Configuration
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5Dialect
spring.jpa.hibernate.ddl-auto=update


## Required Dependencies.


<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>



## Usage

To run this project, you can:

1. Clone this repository.
2. Import it into your preferred IDE.
3. Make sure you have Maven and Java installed.
4. Configure your database connection in `application.properties`.
5. Run the application using `mvn spring-boot:run`.

## Technologies Used

- Spring Boot
- Spring Data JPA
- Java
