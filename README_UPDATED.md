# Student Library Management System 📚

A Spring Boot-based RESTful web application for managing a student library. This system allows operations like issuing books, returning books, managing students, and tracking inventory. Built with a clean layered and modular architecture to ensure scalability, reusability, and real-world design.

---

## 🔧 Features

- Add, update, delete student and book records
- Issue and return books with transaction history
- Use of pagination to fetch student data efficiently
- Built with microservice-style layered structure (Controller, Service, Repository, DTO, Models)
- Hibernate ORM with entity relationships: One-to-One, One-to-Many, Many-to-One
- Custom enums for CardStatus, BookGenre, TransactionType (BORROW/RETURN)
- Uses `@JsonBackReference` and `@JsonManagedReference` to manage bidirectional serialization
- RESTful API endpoints with Spring MVC
- Proper separation of concerns using DTOs and model mapping

---

## 🛠️ Tech Stack

- **Backend**: Java, Spring Boot
- **ORM & DB**: Hibernate, JPA, MySQL
- **Build Tool**: Maven
- **Testing**: JUnit, Mockito
- **Tools**: Postman, Git, IntelliJ/VS Code

---

## 🚀 How to Run Locally

1. **Clone the repository**
```bash
git clone https://github.com/borrolla/student-library-management-system.git
cd student-library-management-system
```

2. **Configure DB connection**
Update your `application.properties` with your local MySQL credentials.

3. **Run the application**
```bash
./mvnw spring-boot:run
```

4. **Access API**
Visit: `http://localhost:8080`

---

## 📡 Sample API Usage – Pagination

Fetch paginated student records:
```
GET /students?page=0&size=5
```

Example response:
```json
{
  "content": [
    { "id": 1, "name": "John Doe", "email": "john@email.com" }
  ],
  "pageable": { "pageNumber": 0, "pageSize": 5 },
  "totalPages": 10,
  "totalElements": 50
}
```

---

## 🧱 Project Structure

```
src
├── controller         # REST Controllers
├── service            # Business Logic
├── repository         # JPA Repositories
├── dto                # Data Transfer Objects
├── model              # Entity Classes with @Entity, @Table
├── enums              # Enums for CardStatus, TransactionType, etc.
└── application.properties
```

---

## 🗃️ Entity Relationships

- `Student` ↔️ `LibraryCard` → One-to-One
- `LibraryCard` ↔️ `Book` → One-to-Many
- `Transaction` ↔️ `Book`/`Card` → Many-to-One
- Used `@JsonManagedReference` and `@JsonBackReference` to prevent infinite recursion
- Annotated with `@Entity`, `@Table(name = "student")`, etc.

---

## 🔗 Useful Commands

- `mvn clean install` – build the project
- `mvn spring-boot:run` – run the application
- `mvn test` – run unit tests

---

## 📬 Contact

Made with 💻 by Sravan Kumar Borrolla  
📧 sravankumarborrolla39@email.com  
🔗 [LinkedIn](https://linkedin.com/in/sravankumarborrolla)
