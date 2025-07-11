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

 HEAD
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
##Screenshots

![ER Diagram](screenshot_er_diagram.png)

![MySQL Author List](screenshot_mysql_authorlist.png)

![Student Card Status](screenshot_mysql_authorlist.png)

![Student List Saved](screenshot_student_list_save.png)

![Transaction Screenshot](screenshot_student_transaction.png)

![Book Save](screenshot_book_save.png)

![Custom Query by Email](screenshot_customquery_bystuemail.png)

![Find All Students](screenshot_findall_student.png)

![Get Student by PageNo](screenshot_get_student_by_pageno.png)

![Postman Author Save](screenshot_postman_author_save.png)

![Postman_student_update_By_email](screenshot_student_update_deatails.png)

--

## 🔗 Useful Commands

- `mvn clean install` – build the project
- `mvn spring-boot:run` – run the application
- `mvn test` – run unit tests

---

## 📬 Contact

Made with 💻 by Sravan Kumar Borrolla  
📧 sravankumarborrolla39@email.com  
🔗 [LinkedIn](https://linkedin.com/in/sravankumarborolla)
