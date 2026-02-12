# Spring Boot User Management API

A simple **User Management REST API** built using **Spring Boot**, **Spring Data JPA**, and **MySQL**.  
This project demonstrates clean backend architecture with DTOs, mappers, and layered design.

---

## 🚀 Features

- Create a new user
- Get user by ID
- Get all users
- Update user details
- MySQL database integration
- DTO–Entity mapping for clean API design

---

## 🛠 Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA (Hibernate)
- MySQL
- Maven
- Postman (for API testing)

---

## 📂 Project Structure

springboot-usermanagement
│
├── controller # REST controllers
├── service # Business logic
├── repository # JPA repositories
├── entity # JPA entities
├── dto # Data Transfer Objects
├── mapper # DTO ↔ Entity mapping
├── exception # Custom exceptions
└── SpringbootUsermanagementApplication.java


---

## ⚙️ Configuration

Update your **application.properties** (or `application.yml`) with your MySQL credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/user_management
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
Make sure MySQL is running and the database exists.

🔗 API Endpoints
➕ Create User
POST /api/users

{
  "firstName": "Vinamra",
  "lastName": "Gupta",
  "email": "vinamra@gmail.com"
}
📄 Get All Users
GET /api/users

🔍 Get User by ID
GET /api/users/{id}

✏️ Update User
PUT /api/users/{id}

{
  "firstName": "Updated",
  "lastName": "Name",
  "email": "updated@gmail.com"
}
🧪 Testing
APIs tested using Postman

Responses return appropriate HTTP status codes

📌 Learning Outcomes
Spring Boot REST fundamentals

Layered architecture (Controller → Service → Repository)

DTO usage and mapping

Exception handling basics

Database integration with JPA

👤 Author
Vinamra Gupta
Backend Developer (Spring Boot)
GitHub: https://github.com/VinamraGupta01

📜 License
This project is for learning and educational purposes.


---

## ✅ What to do next

1️⃣ Create a file named **README.md** in your repo  
2️⃣ Paste the above content  
3️⃣ Commit & push:
```bash
git add README.md
git commit -m "Add project README"
git push
