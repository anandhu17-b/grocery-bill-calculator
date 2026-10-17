# grocery-bill-calculato

A comprehensive Java console application designed to generate professional itemized grocery bills, calculate slab-based discounts, apply standard GST, and validate user input data.

## Features

- **Dynamic Item Entry:** Input custom item names, quantities, and unit prices dynamically.
- **Input Validation:** Built-in safeguards (`while` loops) preventing zero or negative values for quantities and prices.
- **Automated Pricing Calculations:** Computes individual item totals, sub-totals, and scaled discounts based on total purchase value:
  - `< ₹1,000`: 0% discount
  - `₹1,000 – ₹5,000`: 5% discount
  - `₹5,000 – ₹10,000`: 10% discount
  - `≥ ₹10,000`: 15% discount
- **Tax & Final Invoice Generation:** Applies an 18% GST on the discounted total to generate a clean, formatted receipt layout.

## Tech Stack

- **Language:** Java
- **Core Concepts:** Arrays, Control Flow (`for` loops, `while` loops, `if-else` ladder), Scanner Input Handling.

## Project Structure

```text
Module1Assi/
│
└── GroceryBillCalc.java # Main application handling billing logic, validation, and receipt formatting
