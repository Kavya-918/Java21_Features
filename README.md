
---

# ☕ Java21_Features

This repository contains examples of **new features introduced in Java 21 (LTS)**.
Each file demonstrates a specific enhancement with **before Java 21** and **Java 21** examples for easy understanding.

---

## 🚀 Features Covered

### 1. **Unnamed Classes & Instance Main Methods**

* No need to write a public class or static main method.
* Makes it beginner-friendly for small programs.
* **Preview feature in JDK 21**, became **standard in JDK 25**.

---

### 2. **Pattern Matching for Switch**

* Simplifies switch statements with direct type checking and casting.
* Eliminates manual type casting inside conditions.
* Supports `null` handling in switch cases.

---

### 3. **Record Patterns (JEP 440)**

* Allows **deconstruction** of record objects directly in `instanceof` or `switch`.
* Extracts (unpacks) record fields easily.

---

### 4. **Sequenced Collections (JEP 431)**

* Introduces new methods like `addFirst()`, `addLast()`, `getFirst()`, `getLast()`.
* Simplifies working with collections in insertion order.

---

### 5. **String Templates (JEP 430)** – *Preview Feature*

* Enables easy variable interpolation using `STR`, `FMT`, and `RAW` templates.
* Makes string construction cleaner and more readable.

---

### 6. **Virtual Threads (JEP 444)**

* Lightweight threads for high concurrency and scalability.
* Makes thread creation and management more efficient than traditional threads.

---

## 🧰 How to Run Preview Features

For features like **Unnamed Classes** or **String Templates**, enable preview mode while compiling and running:

```bash
javac --enable-preview --release 21 Demo.java
java --enable-preview Demo
```

---

## 💡 Purpose

This repository helps developers understand and practice the **latest Java 21 features** with **simple and clear examples** — perfect for learning and interview preparation.

---
