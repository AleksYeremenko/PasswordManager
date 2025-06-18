# PasswordManager

**PasswordManager** is a desktop application built with Java Swing, designed to securely store and manage user passwords locally. It features a graphical user interface with multiple forms and a built-in password generator.

---

## 🧩 Features

- 🔐 Local password storage using a user-selected file
- 🔑 Login form to authorize access to the password vault
- 🔁 Password generator with customizable rules (length, symbols, etc.)
- 📋 Interface for viewing, adding, and managing saved credentials
- 🎨 UI built with IntelliJ IDEA's GUI Designer

---

## 📂 Project Structure

- `Main.java` — main entry point; prompts the user to select a storage file
- `LoginForm.java` — login/authentication window
- `FormMain.java` — main interface for password management
- `GeneratePasswordForm.java` — form for generating strong passwords
- `.form` files — visual UI definitions (designed in IntelliJ IDEA)

---

## 🛠️ Technologies Used

- Java 17+
- Swing (UI Framework)
- IntelliJ IDEA (GUI Designer)
- File I/O (serialization and local storage)

---

## 🚀 How to Run

1. Open the project in IntelliJ IDEA
2. Run `Main.java`
3. Select or create a password vault file when prompted
4. Enter the access password to proceed

---

## 📌 Note

This project was initially created as a university assignment.  
Additional functionality and UI logic were implemented to extend the core requirements.
