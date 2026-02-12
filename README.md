# 🚀 Spring Boot User Management REST API

A **production-style User Management REST API** built using **Spring Boot**, **Spring Data JPA**, and **MySQL**.  
This project follows **clean architecture principles**, uses **DTOs for API contracts**, and demonstrates how real backend services are structured in industry.

---

## 📌 Overview

This application exposes RESTful endpoints to manage users, including creating, reading, and updating user data.  
It is designed to showcase backend fundamentals such as layered architecture, persistence with JPA, and clean separation of concerns.

---

## ✨ Features

- RESTful API design
- Full CRUD-ready architecture
- DTO ↔ Entity mapping (no entity exposure)
- MySQL database integration
- Proper HTTP status codes
- Custom exception handling
- Clean package structure
- Easily extendable for future features

---

## 🧠 Architecture

The project follows a **layered architecture**:

```

Controller  →  Service  →  Repository  →  Database
↓
Mapper
↓
DTO

```

This ensures:
- Loose coupling
- High maintainability
- Testability
- Industry-standard backend design

---

## 🛠 Tech Stack

| Technology | Usage |
|-----------|------|
| Java | Backend language |
| Spring Boot | REST API framework |
| Spring Data JPA | ORM & persistence |
| Hibernate | JPA implementation |
| MySQL | Relational database |
| Maven | Dependency management |
| Postman | API testing |

---

## 📂 Project Structure

```

springboot-usermanagement
│
├── controller      # REST controllers (API layer)
├── service         # Business logic
├── repository      # Database access layer
├── entity          # JPA entities
├── dto             # Data Transfer Objects
├── mapper          # DTO ↔ Entity mappers
├── exception       # Custom exceptions
└── SpringbootUsermanagementApplication.java

````

---

## ⚙️ Configuration

Update `application.properties` (or `application.yml`) with your database credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/user_management
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
````

Make sure:

* MySQL is running
* Database `user_management` exists

---

## 🔗 API Endpoints

### ➕ Create User

**POST** `/api/users`

```json
{
  "firstName": "Vinamra",
  "lastName": "Gupta",
  "email": "vinamra@gmail.com"
}
```

---

### 📄 Get All Users

**GET** `/api/users`

---

### 🔍 Get User By ID

**GET** `/api/users/{id}`

---

### ✏️ Update User

**PUT** `/api/users/{id}`

```json
{
  "firstName": "Updated",
  "lastName": "Name",
  "email": "updated@gmail.com"
}
```

---

## 🧪 Testing

* APIs tested using **Postman**
* JSON-based requests and responses
* Proper HTTP status codes returned

---

## 🎯 Learning Outcomes

This project demonstrates understanding of:

* Spring Boot REST fundamentals
* DTO-based API design
* JPA & Hibernate
* MySQL integration
* Clean code and layered architecture
* Backend best practices

---

## 🚧 Future Enhancements

* Delete user API
* Input validation (`@NotNull`, `@Email`)
* Global exception handling (`@ControllerAdvice`)
* Pagination & sorting
* Swagger / OpenAPI documentation
* Authentication & authorization (Spring Security)

---

## 👤 Author

**Vinamra Gupta**
Backend Developer | Java & Spring Boot

🔗 GitHub:
[https://github.com/VinamraGupta01](https://github.com/VinamraGupta01)

---

## 📜 License

This project is intended for learning and portfolio purposes.

````

---

### ✅ Final steps (2 commands only)
```bash
git add README.md
git commit -m "Add professional README"
git push
````

