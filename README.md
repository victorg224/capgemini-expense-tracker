# Simple Expense Tracker (Java)

This project is a Java console-based expense tracker built for Capgemini’s Junior Java Developer assessment.  
It allows users to enter expenses and view spending summaries, trends, and category-based analysis using in-memory storage.

## Features
- Add expenses with:
  - Category
  - Amount
  - Date
- Calculate:
  - Total expense
  - Total expense by category
  - Expense trend by date
  - Highest and lowest spending category
- Data is stored in memory and resets on each run

## Project Structure
├── Expense.java
Model class representing a single expense entry.
├── ExpenseService.java
Contains logic for calculations such as totals, category grouping, trends, and highest/lowest spending.
└── ExpenseTrackerApp.java
Application entry point. Handles user input via the console and displays results.

## Testing and verify
The application is tested manually through console input.
Functionality verified includes:

Correct total expense calculation

Correct aggregation by category

Accurate expense trend by date

Correct identification of highest and lowest spending categories

## Test Data
Food, 25.00, 12-15-25
Transportation, 40.00, 12-16-25
Entertainment, 60.00, 12-16-25
Food, 30.00, 12-17-25
Utilities, 120.00, 12-18-25

