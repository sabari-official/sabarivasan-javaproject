# 🎓 Student Management System (JDBC & Java Swing)

A complete Java database application developed in **Eclipse IDE** demonstrating **JDBC CRUD operations** through both console programs and an interactive **Java Swing GUI** connected to MySQL.

---

### 👨‍💻 Student Information
| Field | Details |
| :--- | :--- |
| **Name** | **Sabarivasan E** |
| **Department** | **IV Year - Artificial Intelligence and Data Science (AI & DS)** |
| **Institution** | **Chettinad College of Engineering and Technology** |
| **Development IDE** | **Eclipse IDE for Java Developers** |

---

## 📌 Project Overview

This project is structured into two sequential modules inside Eclipse:
- **Level 3 (`level3` package):** Console-driven Database Management using Core JDBC (`Statement` & `PreparedStatement`).
- **Level 4 (`level4` package):** Desktop Graphical User Interface (GUI) built with Java Swing (`JFrame`), featuring authentication and a full CRUD management dashboard.

---

## 🗄️ Database Configuration

The application connects to a local MySQL Database:

- **Host:** `localhost:3306`
- **Database Name:** `chettinad`
- **Table Name:** `student`
- **User:** `root`
- **Password:** `Localhost@123`

### MySQL Schema
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

## 💻 How to Setup and Run in Eclipse IDE

### 1. Import Project into Eclipse
1. Open **Eclipse IDE**.
2. Go to **File** &rarr; **Open Projects from File System...** (or **New** &rarr; **Java Project**).
3. Select the project directory (`D:\java`) and click **Finish**.

### 2. Configure MySQL JDBC Driver in Build Path
1. Right-click the project folder in **Package Explorer** &rarr; **Build Path** &rarr; **Configure Build Path...**
2. In the properties window, switch to the **Libraries** tab.
3. Select **Classpath** (or Modulepath depending on your Eclipse version) and click **Add External JARs...**
4. Browse and select `mysql-connector-j-8.3.0.jar`.
5. Click **Apply and Close**.

---

## ⚙️ Module Breakdown & Execution in Eclipse

### 🔹 Level 3: Console JDBC Operations (`level3` package)

Interactive command-line programs communicating directly via JDBC:

| Class | Purpose | Key Mechanism |
| :--- | :--- | :--- |
| [`Database1.java`](level3/Database1.java) | **Insert with Validation** | Queries `SELECT COUNT(*)` with `PreparedStatement` to ensure the roll number does not already exist before inserting. |
| [`Database2.java`](level3/Database2.java) | **Direct Insert** | Inserts a new student record using `Statement.executeUpdate()`. |
| [`Database3.java`](level3/Database3.java) | **Delete Record** | Deletes a student record by roll number. |
| [`Database4.java`](level3/Database4.java) | **Update Record** | Modifies the name and marks of an existing student by roll number. |

#### Running in Eclipse:
1. In the **Package Explorer**, expand the `level3` package.
2. Right-click on any file (e.g., `Database1.java`) &rarr; **Run As** &rarr; **Java Application**.
3. Use the built-in **Console** tab at the bottom to enter inputs and view results.

---

### 🔹 Level 4: Swing GUI Application (`level4` package)

A full graphical desktop application built with Java Swing:

1. **[`LoginForm.java`](level4/LoginForm.java)**:
   - Login gate with masked password entry.
   - **Default Credentials:**
     - **Username:** `sabari`
     - **Password:** `sabari@1212`
   - Upon successful login, the login window closes and automatically opens the student management dashboard.

2. **[`SimpleGui.java`](level4/SimpleGui.java)**:
   - Interactive GUI window designed with `JFrame`, `JLabel`, `JTextField`, and `JButton`.
   - **Supported Actions:**
     - **Search / Find:** Retrieves student name and mark by Register Number.
     - **Insert / Save:** Adds a new student record into MySQL.
     - **Delete / Remove:** Deletes the record matching the Register Number.
     - **Update / Edit:** Updates the student's name and marks.
     - **Clear:** Resets all input fields.

#### Running in Eclipse:
1. In the **Package Explorer**, expand the `level4` package.
2. Right-click **`LoginForm.java`** &rarr; **Run As** &rarr; **Java Application**.
3. The GUI window will open. Enter credentials and click **Login/SignIn** to access the dashboard.
*(You can also right-click `SimpleGui.java` &rarr; **Run As** &rarr; **Java Application** to open the student form directly).*

---

## 📂 Project Structure

```text
├── level3/                  # Package: level3 (Console JDBC)
│   ├── Database1.java       # Insert with duplicate check
│   ├── Database2.java       # Direct insert
│   ├── Database3.java       # Delete by regno
│   └── Database4.java       # Update by regno
├── level4/                  # Package: level4 (Java Swing GUI)
│   ├── LoginForm.java       # Swing authentication screen
│   └── SimpleGui.java       # Swing student CRUD dashboard
├── .gitignore               # Excludes Eclipse metadata (.metadata), binaries (*.class, *.jar)
└── README.md                # Project documentation
```

---

## 🛠️ Requirements
- **IDE:** Eclipse IDE for Java Developers (2023 / 2024 / 2025+)
- **JDK:** Java SE Development Kit 8 or higher
- **Database:** MySQL Server 8.0+ running on `localhost:3306`
- **Library:** MySQL Connector/J (`mysql-connector-j-8.3.0.jar`)