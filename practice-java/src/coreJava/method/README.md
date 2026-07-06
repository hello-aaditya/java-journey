# Question 1

# ProductHub Engineering Team

**Project:** ProductHub Shipping Calculator

**Module:** Order Fulfilment Service

**Sprint:** Sprint 03

**Story ID:** PH-ORD-112

**Priority:** High

**Estimated Time:** 4 Hours

**Assigned To:** Junior Java Backend Developer

---

## 1. Business Background

ProductHub is an e-commerce platform that sells premium men's formal wear across India.

Whenever a customer places an order, the Shipping Service calculates the shipping charges based on various business rules before the order is sent to the logistics partner.

Currently, the Shipping Team performs this calculation manually for internal testing. As the order volume has increased, the company has decided to automate this process.

Your responsibility is to develop **Version 1** of the Shipping Calculator.

This utility will later become part of the Spring Boot Order Service.

---

## 2. Business Objective

Develop a Java console application named:

```
ProductHubShippingCalculator
```

The application shall calculate the shipping charges for **one customer order** and generate a professional shipping invoice.

The application must accept all order details through **command-line arguments**.

---

## 3. Functional Requirements

The application shall capture the following information.

| Field | Required |
|-------|----------|
| Shipment ID | Yes |
| Customer Name | Yes |
| Product Name | Yes |
| Product Weight (kg) | Yes |
| Delivery Distance (km) | Yes |
| Shipping Method | Yes |
| Delivery Zone | Yes |
| Insurance Required | Yes |
| Order Amount | Yes |

---

## 4. Business Rules

### BR-01 — Platform Fee

ProductHub always charges a platform fee.

```
Platform Fee = ₹49
```

### BR-02 — GST Percentage

```
GST = 18%
```

### BR-03 — Shipping Charge Formula

Every shipment has two components.

**Weight Charge**
```
Weight Charge = Product Weight × ₹20
```

**Distance Charge**
```
Distance Charge = Delivery Distance × ₹2
```

**Shipping Charge**
```
Shipping Charge = Weight Charge + Distance Charge
```

### BR-04 — Insurance Charge

```
Insurance Charge = ₹99
```

### BR-05 — GST Calculation

GST is calculated **only on the shipping charge**.

```
GST = Shipping Charge × 18 / 100
```

### BR-06 — Final Shipping Cost

```
Final Shipping Cost = Shipping Charge + Insurance Charge + GST + Platform Fee
```

---

## 5. Supported Shipping Methods

Only the following shipping methods are supported. Implement using an appropriate Java construct.

```
STANDARD
EXPRESS
SAME_DAY
```

---

## 6. Supported Delivery Zones

Only the following delivery zones are supported. Implement using an appropriate Java construct.

```
LOCAL
INTRACITY
INTERCITY
REMOTE
```

---

## 7. Variable Classification

### Static Variables

These values are common across every shipment. Implement these as **static variables**.

```
Company Name    = ProductHub
Currency        = INR
GST Percentage  = 18
Platform Fee    = ₹49
```

### Instance Variables

The following values belong to one shipment. Implement these as **instance variables**.

```
Shipment ID
Customer Name
Product Name
Weight
Distance
Shipping Method
Delivery Zone
Insurance Required
Order Amount
```

### Local Variables

These values exist only while generating the invoice. Implement these as **local variables**.

```
Weight Charge
Distance Charge
Shipping Charge
Insurance Charge
GST
Final Shipping Cost
```

---

## 8. Methods

The implementation **must** contain the following methods. Each method must perform **only one responsibility**. Do **not** place every calculation inside `main()`.

```
calculateWeightCharge()
calculateDistanceCharge()
calculateShippingCharge()
calculateInsuranceCharge()
calculateGST()
calculateFinalShippingCost()
printShippingInvoice()
```

---

## 9. Input Specification

The application shall accept command-line arguments in the following order.

| Position | Field |
|----------|-------|
| 0 | Shipment ID |
| 1 | Customer Name |
| 2 | Product Name |
| 3 | Weight |
| 4 | Distance |
| 5 | Shipping Method |
| 6 | Delivery Zone |
| 7 | Insurance Required |
| 8 | Order Amount |

---

## 10. Output Specification

The console output must resemble an invoice that can be shared with the Logistics Team.

```
========================================================================
                    PRODUCTHUB SHIPPING INVOICE
========================================================================

COMPANY INFORMATION
------------------------------------------------------------------------
Company Name               : ProductHub
Currency                   : INR
GST Percentage             : 18%
Platform Fee               : ₹49

SHIPMENT INFORMATION
------------------------------------------------------------------------
Shipment ID                : SHP-20260705-0001
Customer Name              : Aaditya Kumar
Product Name               : Premium Oxford Shirt

Shipping Method            : EXPRESS
Delivery Zone              : INTERCITY

Product Weight             : 2.5 Kg
Delivery Distance          : 850 Km

Insurance Required         : YES

Order Amount               : ₹3499.00

CHARGE BREAKDOWN
------------------------------------------------------------------------
Weight Charge              : ₹50.00
Distance Charge            : ₹1700.00

Shipping Charge            : ₹1750.00
Insurance Charge           : ₹99.00
GST (18%)                  : ₹315.00
Platform Fee               : ₹49.00

------------------------------------------------------------------------
TOTAL SHIPPING COST        : ₹2213.00
------------------------------------------------------------------------

========================================================================
          GENERATED BY PRODUCTHUB SHIPPING SERVICE v1.0
========================================================================
```

---

## 11. Formatting Standards

The report shall:

- Use section headers
- Align labels
- Display currency using **₹**
- Display weight using **Kg**
- Display distance using **Km**
- Display percentages with `%`
- Use uppercase section headings
- Leave one blank line between sections

---

## 12. Technical Constraints

The application shall use **only** the following Java concepts:

- Printing statements
- Variables
- Enums
- Operators
- Methods
- Command-line arguments
- One object
- Static variables
- Instance variables
- Local variables

The application shall **not** use:

- Scanner
- Arrays (except `args`)
- Loops
- if / else
- switch
- Collections
- Constructors
- Exception Handling
- File Handling
- JDBC
- Spring Boot

---

## 13. Acceptance Criteria

The feature will be accepted only if:

- The application compiles successfully using `javac`
- The application runs successfully using `java`
- All calculations follow the specified formulas
- Every required field is printed
- The invoice format matches the specification
- Business rules are implemented correctly
- Shipping Method and Delivery Zone are implemented using enums
- Static, instance, and local variables are used appropriately
- Business logic is divided into methods rather than being written entirely inside `main()`

---

## 14. Solution

[ProductHubShippingCalculator.java](https://github.com/hello-aaditya/java-journey/blob/main/src/coreJava/method/ProductHubShippingCalculator.java)

---

<br>

---

# Question 2

# ProductHub Engineering Team

## Engineering Assignment

**Project:** Hospital Billing System

**Module:** Patient Billing Service

**Department:** Healthcare Management Platform

**Sprint:** Sprint 05

**Story ID:** HMS-BILL-315

**Priority:** High

**Estimated Development Time:** 5–6 Hours

**Assigned To:** Junior Java Backend Developer

---

## 1. Business Background

MediCare Hospitals is developing an internal Hospital Management System (HMS) to digitize patient admissions, billing, pharmacy management, and insurance processing.

Currently, after a patient is discharged, the billing department manually calculates the hospital invoice by combining room charges, doctor consultation fees, medicine charges, and laboratory charges.

This manual process increases billing errors and delays patient discharge.

To automate invoice generation, the Backend Engineering Team has decided to build the first version of the **Patient Billing Service**.

Your responsibility is to implement Version 1 of this utility.

---

## 2. Business Objective

Develop a Java console application named

```
HospitalBillingSystem
```

The application shall generate the complete hospital bill for **one patient**.

All patient details shall be accepted using **command-line arguments**.

The program shall calculate all bill components and generate a professional hospital invoice.

---

## 3. Functional Requirements

The application shall capture the following information.

| Field | Required |
|-------|----------|
| Patient ID | Yes |
| Patient Name | Yes |
| Doctor Name | Yes |
| Room Type | Yes |
| Admission Type | Yes |
| Insurance Provider | Yes |
| Number of Hospital Days | Yes |
| Doctor Consultation Fee | Yes |
| Medicine Charges | Yes |
| Laboratory Charges | Yes |

---

## 4. Business Rules

### BR-01 — Hospital Name

Hospital Name is fixed.

```
MediCare Super Speciality Hospital
```

### BR-02 — Currency

```
INR
```

### BR-03 — GST Percentage

```
18%
```

### BR-04 — Room Charges

Room charges shall be calculated using the following rates.

| Room Type | Charge Per Day |
|-----------|---------------|
| GENERAL | ₹1200 |
| SEMI_PRIVATE | ₹2500 |
| PRIVATE | ₹4500 |
| ICU | ₹8000 |

### BR-05 — Room Charge Formula

```
Room Charge = Charge Per Day × Number of Hospital Days
```

### BR-06 — Hospital Service Charge

The hospital charges a fixed service charge.

```
₹500
```

### BR-07 — GST Calculation

GST shall be calculated on:

```
Room Charges + Doctor Consultation Fee + Medicine Charges + Laboratory Charges + Hospital Service Charge
```

Formula:

```
GST = Subtotal × 18 / 100
```

### BR-08 — Final Bill

```
Final Bill = Subtotal + GST
```

### BR-09 — Version 1 Assumption

Insurance details are collected only for reporting purposes. Do **not** calculate insurance deductions. Insurance claim processing will be implemented in Version 2.

---

## 5. Supported Room Types

Implement using an enum.

```
GENERAL
SEMI_PRIVATE
PRIVATE
ICU
```

---

## 6. Supported Admission Types

Implement using an enum.

```
EMERGENCY
PLANNED
DAY_CARE
```

---

## 7. Supported Insurance Providers

Implement using an enum.

```
NONE
STAR_HEALTH
HDFC_ERGO
ICICI_LOMBARD
NIVA_BUPA
```

---

## 8. Variable Classification

### Static Variables

The following values are common across every patient. Implement these as **static variables**.

```
Hospital Name
Currency
GST Percentage
Hospital Service Charge
```

### Instance Variables

These values belong to one patient. Implement these as **instance variables**.

```
Patient ID
Patient Name
Doctor Name
Room Type
Admission Type
Insurance Provider
Hospital Days
Doctor Consultation Fee
Medicine Charges
Laboratory Charges
```

### Local Variables

The following values exist only while generating the invoice. Implement these as **local variables**.

```
Room Charge
Subtotal
GST
Final Bill
```

---

## 9. Required Methods

The application **must** contain the following methods. Each method shall have only **one responsibility**. Do not place business calculations directly inside `main()`.

```
calculateRoomCharge()
calculateSubtotal()
calculateGST()
calculateFinalBill()
printHospitalInvoice()
```

---

## 10. Input Specification

The application shall accept command-line arguments in the following order.

| Position | Field |
|----------|-------|
| 0 | Patient ID |
| 1 | Patient Name |
| 2 | Doctor Name |
| 3 | Room Type |
| 4 | Admission Type |
| 5 | Insurance Provider |
| 6 | Hospital Days |
| 7 | Doctor Consultation Fee |
| 8 | Medicine Charges |
| 9 | Laboratory Charges |

---

## 11. Expected Console Output

```
========================================================================
                  MEDICARE HOSPITAL BILLING REPORT
========================================================================

HOSPITAL INFORMATION
------------------------------------------------------------------------
Hospital Name            : MediCare Super Speciality Hospital
Currency                 : INR
GST Percentage           : 18%
Hospital Service Charge  : ₹500

PATIENT INFORMATION
------------------------------------------------------------------------
Patient ID               : PAT-20260705-0012
Patient Name             : Aaditya Kumar
Doctor Name              : Dr. Meera Sharma

Admission Type           : EMERGENCY
Room Type                : PRIVATE
Insurance Provider       : STAR_HEALTH

Hospital Days            : 4

BILL BREAKDOWN
------------------------------------------------------------------------
Room Charges             : ₹18000.00
Doctor Consultation Fee  : ₹2500.00
Medicine Charges         : ₹4250.00
Laboratory Charges       : ₹1800.00
Hospital Service Charge  : ₹500.00

------------------------------------------------------------------------
Subtotal                 : ₹27050.00
GST (18%)                : ₹4869.00

------------------------------------------------------------------------
TOTAL BILL               : ₹31919.00
------------------------------------------------------------------------

========================================================================
      GENERATED BY MEDICARE HOSPITAL BILLING SYSTEM v1.0
========================================================================
```

---

## 12. Technical Constraints

Use **only** the following Java concepts:

- Printing statements
- Variables
- Operators
- Methods
- Enums
- Command-line arguments
- One object
- Static variables
- Instance variables
- Local variables

Do **not** use:

- Scanner
- Arrays (except `args`)
- Loops
- `if` / `else`
- `switch`
- Collections
- Constructors
- Exception handling
- File handling
- JDBC
- Spring Boot

---

## 13. Solution

[HospitalBillingSystem.java](https://github.com/hello-aaditya/java-journey/blob/main/src/coreJava/method/HospitalBillingSystem.java)

---

<br>

---

<!-- Q3 -->
