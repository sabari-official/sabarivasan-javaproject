# 🎓 Student Management System (JDBC & Java Swing)

A complete Java database application demonstrating **JDBC CRUD operations** through both console interfaces and an interactive **Java Swing GUI** connected to MySQL.

---

### 👨‍💻 Student Information
| Field | Details |
| :--- | :--- |
| **Name** | **Sabarivasan E** |
| **Department** | **IV Year - Artificial Intelligence and Data Science (AI & DS)** |
| **Institution** | **Chettinad College of Engineering and Technology** |

---

## 📌 Project Overview

This repository is organized into two primary progressive modules:
- **Level 3:** Console-driven Database Management using Core JDBC (`Statement` & `PreparedStatement`).
- **Level 4:** Graphical User Interface (GUI) developed using Java Swing with secure login and full CRUD dashboard.

---

## 🗄️ Database Configuration

The application interfaces with a local MySQL database:

- **Database Name:** `chettinad`
- **Table Name:** `student`

### SQL Schema
```sql
CREATE DATABASE IF NOT EXISTS chettinad;
USE chettinad;

CREATE TABLE IF NOT EXISTS student (
    regno INT PRIMARY KEY,
    sname VARCHAR(100),
    mark FLOAT
);
```

---

## ⚙️ Module Breakdown & Working

### 🔹 Level 3: Console JDBC Operations (`level3`)
Contains standalone CLI programs demonstrating standard database interactions:

| File | Purpose | Key Mechanism |
| :--- | :--- | :--- |
| [`Database1.java`](level3/Database1.java) | **Insert with Validation** | Uses `PreparedStatement` to query `SELECT COUNT(*)` to check if a roll number already exists before safely inserting. |
| [`Database2.java`](level3/Database2.java) | **Direct Insert** | Uses `Statement.executeUpdate()` to insert a new student entry directly. |
| [`Database3.java`](level3/Database3.java) | **Delete Record** | Deletes a student entry based on the provided roll number. |
| [`Database4.java`](level3/Database4.java) | **Update Record** | Modifies the name and marks of an existing student by their roll number. |

#### How to Run Level 3:
```powershell
# From the project root (D:\java)
javac -cp ".;mysql-connector-j-8.3.0.jar" level3\*.java

# Execute any module:
java -cp ".;mysql-connector-j-8.3.0.jar" level3.Database1
java -cp ".;mysql-connector-j-8.3.0.jar" level3.Database2
java -cp ".;mysql-connector-j-8.3.0.jar" level3.Database3
java -cp ".;mysql-connector-j-8.3.0.jar" level3.Database4
```

---

### 🔹 Level 4: Swing GUI Application (`level4`)
A full desktop GUI application featuring a secure entry gate and an interactive management window:

1. **[`LoginForm.java`](level4/LoginForm.java)**:
   - Provides an authentication dialog with username and password masking.
   - **Default Credentials:**
     - **Username:** `sabari`
     - **Password:** `sabari@1212`
   - On successful validation, it disposes of the login window and opens the student dashboard.

2. **[`SimpleGui.java`](level4/SimpleGui.java)**:
   - Interactive GUI window designed with `JFrame`, `JLabel`, `JTextField`, and `JButton`.
   - **Supported Actions:**
     - **Search / Find:** Retrieves student name and mark by Register Number.
     - **Insert / Save:** Saves new student record into MySQL.
     - **Delete / Remove:** Deletes record matching the Register Number.
     - **Update / Edit:** Updates student name and marks.
     - **Clear:** Resets all input text fields.

#### How to Run Level 4:
```powershell
# From the project root (D:\java)
javac -cp ".;mysql-connector-j-8.3.0.jar" level4\*.java

# Launch the Application via Login Gate:
java -cp ".;mysql-connector-j-8.3.0.jar" level4.LoginForm
```

---

## 📂 Repository Structure

```text
├── level3/
│   ├── Database1.java       # Insert with duplicate verification
│   ├── Database2.java       # Standard insert
│   ├── Database3.java       # Delete by regno
│   └── Database4.java       # Update by regno
├── level4/
│   ├── LoginForm.java       # Swing authentication screen
│   └── SimpleGui.java       # Swing student CRUD dashboard
├── .gitignore               # Excludes binaries (*.class, *.jar, .reentry, .vscode)
└── README.md                # Project documentation
```

---

## 🛠️ Requirements & Setup
- **Java SE Development Kit (JDK):** Version 8 or higher (tested on Java 21+)
- **MySQL Database Server:** Running on `localhost:3306`
- **JDBC Driver:** `mysql-connector-j` (version 8.x)