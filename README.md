# Student Library Management System 📚

A Spring Boot-based RESTful web application for managing a student library. This system allows operations like issuing books, returning books, managing students, and tracking inventory. Built with layered architecture and designed for maintainability and scalability.

---

## 🔧 Features

- Add/Delete/Update student and book records
- Issue and return books
- Track overdue or active loans
- RESTful API endpoints for each operation
- Clean separation of Controller, Service, and Repository layers

---

## 🛠️ Tech Stack

- **Backend**: Java, Spring Boot
- **Database**: MySQL
- **Build Tool**: Maven
- **Testing**: JUnit, Mockito
- **IDE**: IntelliJ / VS Code
- **Tools**: Postman, Git

---

## 🚀 How to Run Locally

1. **Clone the repository**
```bash
git clone https://github.com/borrolla/student-library-management-system.git
cd student-library-management-system
```

2. **Configure DB connection**
Update your `application.properties` with local MySQL credentials.

3. **Run the application**
```bash
./mvnw spring-boot:run
```

4. **Access API**
Visit: `http://localhost:8080`  
Use Postman or browser to test endpoints.

---

## 🚀 Features
- Student management (Add, Update, Delete, Get)
- Book management
- Author management
- Issue and return of books
- API testing with Postman
- Persistent storage with MySQL

---

## ⚙️ Tech Stack
- **Backend:** Spring Boot (Java)
- **Database:** MySQL
- **API Testing:** Postman
- **Build Tool:** Maven

## 📁 Project Structure

```
src
├── main
│   └── java
│       └── com.demo.example.student_library_management_system
│           ├── controller
│           ├── service
│           ├── repository
│           └── model
├── resources
│   └── application.properties
```

---
## Screenshots
### ER Diagram
![ER Diagram](screenshotcustomQuery_bystuemail.png)
### MySQL Author List
![MySQL Author List](screenshotmysql_authorList)
### Student Card Status
![Student Card Status](screenshotstudent_card_satus.png)
### Student List Saved
![Student List Saved](screenshotstudentlist_saved.png)
### Student List DB Table
![Student List DB Table](screenshotstudent_list_db_table.png)

### Student Transaction
![Student Transaction](screenshotstudent_transaction.png)

### Postman Author Save
![Postman Author Save](screenshot2025-08-25200259.png)

### Student Update Details
![Student Update Details](screenshotbook_save.png)

### Custom Query by Student Email
![Custom Query by Student Email](screenshotcustomquery_bystuemail.png)

### Find All Students
![Find All Students](screenshotfindall_student.png)

### Get Student by Page No
![Get Student by Page No](screenshotget_student_by_pageno.png)






## 🔗 Useful Commands

- `mvn clean install` – build the project
- `mvn spring-boot:run` – run the application
- `mvn test` – run unit tests

---

## 📬 Contact

Made with 💻 by Sravan Kumar Borrolla  
📧 sravankumarborrolla39@email.com  
🔗 [LinkedIn](https://linkedin.com/in/sravankumarborolla)
