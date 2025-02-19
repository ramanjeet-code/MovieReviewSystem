# MovieReviewSystem

## 📌 About the Project
MovieReviewSystem is a Spring Boot application that allows users to add and review movies. It provides RESTful APIs for managing movies and their reviews.

## 🚀 Features
- Add new movies
- Retrieve a list of movies
- Add reviews to movies
- Swagger UI integration for API documentation

## 🛠️ Technologies Used
- **Java 17**
- **Spring Boot** (Spring Web, Spring Data JPA)
- **Hibernate** (ORM for database interactions)
- **MySQL** (Database)
- **Swagger** (API Documentation)
- **Postman** (API Testing)
- **Git & GitHub** (Version Control)

## 📂 Project Structure
```
MovieReviewSystem/
├── src/main/java/com/Agavian/
│   ├── controller/     # REST Controllers
│   ├── entity/         # Entity Classes (Movie, Reviews)
│   ├── service/        # Business Logic
│   ├── repository/     # JPA Repositories
│   ├── MovieReviewSystemApplication.java  # Main entry point
├── src/main/resources/
│   ├── application.properties # Database configurations
├── pom.xml          # Maven dependencies
├── README.md        # Project documentation
```

## 🔧 Setup & Installation
### 1️⃣ Clone the repository
```sh
git clone https://github.com/ramanjeet-code/MovieReviewSystem.git
cd MovieReviewSystem
```
### 2️⃣ Configure Database
Update `src/main/resources/application.properties` with your MySQL database details:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/moviedb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

### 3️⃣ Build and Run the Application
```sh
mvn spring-boot:run
```
The application will start at `http://localhost:8080/`

### 4️⃣ Access Swagger API Docs
Open Swagger UI in your browser:
```
http://localhost:8080/swagger-ui/index.html
```

## 🎯 API Endpoints
| Method | Endpoint             | Description            |
|--------|----------------------|------------------------|
| GET    | `/Movies`            | Get all movies        |
| POST   | `/addMovie`          | Add a new movie       |
| POST   | `/{movieId}/reviews` | Add a review to movie |

## 📝 Author
**Ramanjeet Singh**  
📧 [Email](gentalman1945@gmail.com)  
🔗 [GitHub](https://github.com/ramanjeet-code)  

## 📜 License
This project is licensed under the MIT License.
