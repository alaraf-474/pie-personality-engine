
---

# PIE: Personality Insight Engine

**PIE** is a backend service built with Java and Spring Boot that provides context-aware attire recommendations based on personality profiles derived from user input. It is designed to showcase modular backend architecture and domain-driven design while addressing a practical use case: mapping behavioral traits to functional lifestyle suggestions.

---

## Features

- Behavioral profiling through structured input (income, lifestyle, mindset)
- Attire suggestion engine tailored to personality and context
- Clean, modular codebase following Spring Boot best practices
- Easily extensible for future personality models or use cases

---

## Live Deployment

**Base URL:**  
[`https://pie-personality-engine-production.up.railway.app`](https://pie-personality-engine-production.up.railway.app)

**Example Endpoint:**  
`POST /api/personality`

---

Tech Stack

Java 17 – Modern, stable, and feature-rich

Spring Boot – Production-ready application framework

Maven – Build and dependency management

Git + GitHub – Version control and collaboration

Railway – Lightweight cloud deployment



---

Project Structure

PIE/
├── controller/              # API layer
│   └── PersonalityController.java
│
├── service/                 # Business logic
│   └── PersonalityService.java
│
├── model/                   # Domain models
│   └── PersonalityProfile.java
│   └── AttireSuggestion.java
│
└── PieApplication.java      # Main application entry point


---


Java 17+

Maven


Run Locally

git clone https://github.com/alaraf-474/pie-personality-engine.git
cd pie-personality-engine
mvn spring-boot:run

The API will be available at http://localhost:8080.


---

Author

Al Araf
Backend Developer | Systems Thinker

GitHub: @alaraf-474

LinkedIn: Al Araf



---

License

This project is licensed under the MIT License. See the LICENSE file for details.

---
