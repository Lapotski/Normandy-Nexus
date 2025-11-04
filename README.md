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
Methods such as `getCategory()` can be overridden by subclasses to provide specialized behavior.
This allows different types of products (e.g., games, consoles) to be handled through a common interface.

### 🧱 Abstraction
Complex operations like backend queries or file handling are hidden behind simple method calls (`getAllProducts(), createProduct()`, etc.), making the code easier to understand and maintain.

## 🖥️ GUI Example

