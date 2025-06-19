# 🏫 School Management Application

A RESTful backend built with **Spring Boot 3.4.6**, **Java 24**, and **MongoDB Atlas**, featuring role-based access control and an embedded attendance tracking system.

---

## 🚀 Features

- **Role-based Authentication** using Spring Security (Basic Auth — no JWT)
    - **TEACHER** can mark student attendance
    - **STUDENT** can view their attendance records
- **Attendance** is stored as an embedded list within each Student document
- Secure password storage using **BCrypt**
- Prevents duplicate usernames at registration
- REST API tested via Postman

---

## 🗂️ Project Structure

src/main/java/com/tnahsin/sma/
├── SchoolManagementApplication.java
├── config/
│ └── SecurityConfig.java
├── controller/
│ ├── AuthController.java
│ ├── TeacherController.java
│ └── StudentController.java
├── model/
│ ├── User.java
│ ├── Teacher.java
│ ├── Student.java
│ └── Attendance.java
├── repository/
│ ├── UserRepository.java
│ ├── TeacherRepository.java
│ └── StudentRepository.java
└── service/
├── CustomUserDetailsService.java
├── TeacherService.java
└── StudentService.java

yaml
Copy
Edit

---

## 🔧 Technologies Used

| Aspect           | Details                        |
|------------------|--------------------------------|
| Language         | Java 24                        |
| Framework        | Spring Boot 3.4.6              |
| Database         | MongoDB Atlas                  |
| Security         | Spring Security (Basic Auth)   |
| Auth Type        | Role-based (TEACHER/ STUDENT)  |
| Build Tool       | Maven                          |
| Testing          | Postman                        |

---

## 🔐 Security & Authentication

- **Basic Authentication** via HTTP headers
- `UserDetailsService` loads users from MongoDB (`Teacher` or `Student`)
- Passwords are stored hashed using **BCrypt**
- Endpoints are secured by roles:
    - `/teacher/**` → `ROLE_TEACHER` access
    - `/student/**` → `ROLE_STUDENT` access
    - `/auth/**` → public endpoints

---


👤 Author
T-nahsin
