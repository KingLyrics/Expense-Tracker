# 💸 Expense Tracker Backend

A simple Spring Boot-based REST API for tracking personal expenses.  
This is the backend service only. Frontend will be added later.

---

## ✅ Current Features

- Retrieve all saved expenses (`GET /api/expenses`)

---

## 📦 Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- MySQL
- Hibernate
- Maven

---

## 🗃️ Entity: Expense

| Field       | Type        | Description                        |
|-------------|-------------|------------------------------------|
| id          | Long        | Auto-generated unique ID           |
| description | String      | Short note about the expense       |
| amount      | Double      | Amount spent                       |
| category    | Enum        | Expense type (e.g. GROCERIES, RENT)|
| date        | LocalDate   | Date the expense occurred          |

---

## 🛠️ Getting Started

### 📍 Prerequisites

- Java 17+
- Maven
- MySQL running on `localhost:3306`
- Database named `ExpenseDB`

### 🔧 Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/expense-tracker.git
   cd expense-tracker
