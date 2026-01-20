# 🌱 Carbon Footprint Tracking Application

A full-stack **Spring Boot** based backend application to calculate, track, and analyze **carbon footprint emissions** for users.  
This project is designed as a **learning + real-world inspired project** with features like surveys, carbon calculation, weekly/monthly analytics, badges, and leaderboard.

---

## 🚀 Features

### ✅ Carbon Footprint Calculation
- Users submit a **survey** (transport, energy usage, lifestyle data)
- System calculates **total carbon emission**
- Each calculation is saved as a log

### 📊 Analytics
- View **carbon history**
- Get **weekly emission**
- Get **monthly emission**

### 🏆 Gamification
- **Badges** awarded based on emission levels
- **Leaderboard** showing users ranked by total emissions
- Encourages eco-friendly behavior

### 🎯 Goals
- Users can set carbon reduction **goals**
- Track progress towards goals

---

## 🧠 Project Architecture (Layered)

Controller → Service → Repository → Database


### 📁 Package Structure

com.site_survey

│

├── controller # REST APIs

├── service # Business logic

├── repository # Database queries (JPA)

├── entity # Database entities

├── config # App configuration

└── util # Utility classes


---

## 🛠️ Tech Stack

| Technology | Used For |
|----------|----------|
| Java 17 | Backend language |
| Spring Boot | REST API framework |
| Spring Data JPA | Database interaction |
| Hibernate | ORM |
| MySQL | Database |
| Maven | Dependency management |
| Postman | API testing |
| Git & GitHub | Version control |

---

## 📌 API Endpoints

### 🔹 Carbon APIs
| Method | Endpoint | Description |
|------|--------|-------------|
| POST | `/carbon/calculate` | Calculate & save carbon footprint |
| GET | `/carbon/history` | Get carbon history |
| GET | `/carbon/weekly` | Weekly carbon emission |
| GET | `/carbon/monthly` | Monthly carbon emission |

---

### 🔹 Leaderboard
| Method | Endpoint | Description |
|------|--------|-------------|
| GET | `/leaderboard` | User-wise total emission leaderboard |

---

### 🔹 Goals
| Method | Endpoint | Description |
|------|--------|-------------|
| POST | `/goals` | Create carbon reduction goal |
| GET | `/goals` | View goals |

---

### 🔹 Badges
| Method | Endpoint | Description |
|------|--------|-------------|
| GET | `/badges` | Get awarded badges |

---

## 🧪 Testing with Postman

1. Start the application
2. Open Postman
3. Use endpoint:


POST http://localhost:8082/carbon/calculate


### Sample Request Body
```json
{
  "username": "mayank",
  "transportMode": "Car",
  "dietType": "NonVeg",
  "energyUsage": 250
}
```
🗄️ Database Configuration
```
spring.datasource.url=jdbc:mysql://localhost:3306/carbon_db

spring.datasource.username=root

spring.datasource.password=your_password


spring.jpa.hibernate.ddl-auto=update

spring.jpa.show-sql=true
```

🧑‍💻 How to Run Locally
```

git clone https://github.com/imayank2/Carbon-Footprint-App.git

cd Carbon-Footprint-App

mvn spring-boot:run
```

Application runs on:
```
http://localhost:8082
```
🎓 Learning Outcomes

- REST API design
- Layered architecture
- JPA & Hibernate queries
- Database-driven analytics
- Clean backend structure
- Git & GitHub workflow


📌 Future Enhancements

- JWT Authentication
- Frontend (React)
- Charts & dashboards
- User profiles
- Deployment on cloud


👤 Author

Mayank Chauhan

Backend Developer | Java | Spring Boot

🔗 GitHub: https://github.com/imayank2


⭐ If you like this project, give it a star!

---
