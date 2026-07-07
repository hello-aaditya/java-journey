# HR-101: Employee ID Card Generator

## Background

The HR department of **TechNova Solutions Pvt. Ltd.** currently creates employee ID cards manually for newly joined employees. This has resulted in inconsistent formatting across departments and occasional mistakes in employee information.

As part of the internal HR automation initiative, your task is to build a small console application that generates a professional employee ID card for newly onboarded employees.

This is the first version (v1). There is **no database**, **no file storage**, and **no user input from Scanner**. HR will execute the program using **command-line arguments** whenever a new employee joins.

---

# Business Requirements

Develop a Java console application that:

* Accepts employee details through **command-line arguments**.
* Creates an `Employee` object using a constructor.
* Displays a well-formatted employee ID card.
* Shows company information.
* Shows employee information.
* Shows employment information.
* Shows system-generated information.

---

## Required Employee Information

The program should capture:

* Employee ID
* Full Name
* Email Address
* Phone Number
* Department
* Designation
* Joining Year

---

## Company Information

These values should remain fixed throughout the application.

* Company Name
* Company Address
* HR Email

Choose appropriate Java constructs so these values cannot accidentally change.

---

## Employment Type

Create an enum named:

```
EmployeeType
```

Possible values:

```
FULL_TIME
PART_TIME
INTERN
CONTRACT
```

The employee type must be supplied through the command line.

---

## Department

Create another enum:

```
Department
```

Example values:

```
ENGINEERING
HR
FINANCE
SALES
MARKETING
DEVOPS
```

The department must also come from the command line.

---

## Employee Code

The application must generate a company employee code.

Format:

```
TN-2026-1001
```

where

* TN = Company Prefix
* 2026 = Joining Year
* 1001 = Running employee number

The running employee number should **not** be hardcoded inside every object.

---

## Output

Generate a clean console report similar to this (layout is only indicative; you may improve formatting):

```text
==========================================================
               TECHNOVA SOLUTIONS PVT. LTD.
==========================================================

Employee ID        : EMP1054
Employee Code      : TN-2026-1001

Name               : Aaditya Kumar
Employee Type      : FULL_TIME

Department         : ENGINEERING
Designation        : Software Engineer

Email              : aaditya@technova.com
Phone              : +91-9876543210

Joining Year       : 2026

----------------------------------------------------------

Company Address    : Bengaluru, Karnataka
HR Contact         : hr@technova.com

==========================================================
```

---

# Technical Constraints

You have already learned enough Java to complete this without introducing new language features.

Your implementation **must** include:

* At least one class representing an employee.
* One class containing the `main()` method.
* A constructor.
* Instance variables.
* Static variables.
* At least two methods besides `main()`.
* At least one method that returns a value.
* At least one `StringBuilder`.
* Two enums.
* Meaningful variable names.
* Proper package structure.

---

# Things to Think About

A senior developer would expect you to consider the following:

* Company information should not be duplicated for every employee.
* Avoid printing directly from everywhere—keep responsibilities organized.
* The employee code generation should be reusable.
* If another employee joins, creating another object should require minimal code changes.
* The console output should be easy to read.

---

# What **not** to use

Do **not** use:

* `Scanner`
* Arrays
* Collections
* Inheritance
* Interfaces
* Exception handling
* File handling

Those topics come later.

---

# Suggested Package Structure

```
coreJava
└── miniProjects
    └── employeeIdCardGenerator
        ├── ...
        └── ...
```

---

# Concepts Practiced

| Concept                | Used |
| ---------------------- | ---- |
| Classes & Objects      | ✅    |
| Constructors           | ✅    |
| Instance Variables     | ✅    |
| Static Variables       | ✅    |
| `final`                | ✅    |
| Methods                | ✅    |
| `return`               | ✅    |
| Command-Line Arguments | ✅    |
| Enums                  | ✅    |
| StringBuilder          | ✅    |
| Access Modifiers       | ✅    |

**Difficulty:** 🟢 Easy
