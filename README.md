# 🛒 Normandy Nexus

A desktop-based **Product Management System** built in **Java** using **Object-Oriented Programming (OOP)** principles.  
The system allows users to manage product records — including adding, updating, deleting, and viewing products — all displayed neatly in a Swing table interface.

---

## 🚀 Features
- Basic **Point of Sale (POS)** system for managing products  
- Add, edit, and delete product records  
- Display product data in a table (`JTable`)  
- Automatically refresh the product list after operations  
- Organized using classes and objects for scalability and reusability  
- GUI built using **Java Swing**

---

## 🧠 Object-Oriented Programming Concepts Used

### 🏗️ Encapsulation
All data fields in classes (like `Product`) are declared **private**, and accessed through **public getters and setters**.  
This ensures that product data can’t be modified directly — only through controlled methods.

### 🔁 Inheritance
Common functionalities (like `data handling` or `management`) are grouped into parent classes, allowing other classes to inherit and reuse logic.

### 🧩 Polymorphism
The abstract class `Product` defines common behaviors, and methods like `getCategory()` and `getExtraInfo()` are overridden by subclasses (`Game`, `Console`, `Accessory`) to provide specialized behavior. Additionally, all products implement the Sellable interface, so they can be handled uniformly through a common interface (`Sellable`) for operations like price and stock management.

### 🧱 Abstraction
The `Product` class and `Sellable` interface hide complex details of each product type and inventory management. Methods like `getAllProducts()`, `addProduct()`, or `setPrice()` provide simple, high-level operations without exposing internal storage or validation logic, making the code easier to understand and maintain.

---

## 🖥️ GUI Example
<img src="Screenshots/ManagerTab.png" width="540">

---

## ⚙️ Technologies Used
- Java 21
- Swing GUI
- JTable / DefaultTableModel
- OOP Principles

---

## 📦 How to Run
1. Clone the repository
```
git clone https://github.com/yourusername/product-management-system.git
cd product-management-system
```
2. Open the project in your IDE (IntelliJ, NetBeans, or Eclipse).
3. Compile and run Main.java

---

## 👨‍💻 Author
- Ky Dequito
- 2nd year Computer Science Student
- 📧 kd.dequito@gmail.com
