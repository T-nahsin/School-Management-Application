#  School Management Backend (WIP)

This is the backend system for a **School Management Application**, built using **Spring Boot** and **MongoDB Atlas**.  
Currently, the `Student` entity has been implemented.

---

## ✅ Current Status

- 🔧 Backend framework: Spring Boot
- 🗃️ Database: MongoDB Atlas (Cloud NoSQL)
- 💡 Implemented:
    - `Student` entity
- ⏳ In Progress:
    - API endpoints
    - Other entities: Teacher, Attendance, etc.
    - Authentication and user roles

---

##  Tech Stack

| Component  | Technology        |
|------------|-------------------|
| Language   | Java 21           |
| Framework  | Spring Boot 3.4.2 |
| Database   | MongoDB Atlas     |
| Build Tool | Maven             |
| IDE        | IntelliJ IDEA     |

---

##  MongoDB Configuration

In `src/main/resources/application.properties`, use a **non-SRV URI** to avoid DNS resolution issues:

```properties
spring.data.mongodb.uri=mongodb://<username>:<password>@host1:port1,host2:port2,host3:port3/databaseName?ssl=true&replicaSet=replicaName&authSource=admin
