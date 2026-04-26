# 📊 Assignment 3: Sorting and Searching Algorithm Analysis System

**Name:** Serikbay Nurali  
**Group:** SE-2511  

---

# 📌 Project Overview

This project demonstrates and compares the performance of fundamental sorting and searching algorithms using Java. The goal is to analyze how different algorithms behave in terms of execution time and efficiency using different input sizes.

### Selected Algorithms:
- **Basic Sorting:** Bubble Sort  
- **Advanced Sorting:** Quick Sort  
- **Searching Algorithm:** Binary Search  

The program measures execution time using `System.nanoTime()` and compares results across different dataset sizes.

---

# 🧠 Algorithm Descriptions

## 🫧 Bubble Sort
Bubble Sort repeatedly compares adjacent elements and swaps them if they are in the wrong order.

- **Time Complexity:**
  - Best: O(n)
  - Average: O(n²)
  - Worst: O(n²)

- **Idea:**
  Larger elements "bubble" to the end of the array step by step.

---

## ⚡ Quick Sort
Quick Sort is a divide-and-conquer algorithm that selects a pivot and partitions the array into smaller subarrays.

- **Time Complexity:**
  - Best: O(n log n)
  - Average: O(n log n)
  - Worst: O(n²)

- **Idea:**
  Elements smaller than pivot go left, larger go right, then recursively sorted.

---

## 🔍 Binary Search
Binary Search finds an element in a sorted array by repeatedly dividing the search space in half.

- **Time Complexity:**
  - O(log n)

- **Important:**
  The array MUST be sorted before searching.

---

# 🧪 Experimental Design

The program tests algorithms using:

### 📏 Array Sizes:
- 10 elements (small)
- 100 elements (medium)
- 1000 elements (large)

### 🎲 Input Type:
- Randomly generated arrays

### ⏱️ Measurement:
- Execution time measured using `System.nanoTime()`

---

# 📊 Experimental Results

## Example Output:

| Size | Bubble Sort (ns) | Quick Sort (ns) | Binary Search (ns) |
|------|------------------|------------------|---------------------|
| 10   | ...              | ...              | ...                 |
| 100  | ...              | ...              | ...                 |
| 1000 | ...              | ...              | ...                 |

---

# 📸 Screenshots
<img width="1918" height="1078" alt="as1" src="https://github.com/user-attachments/assets/e8d942c7-9b14-4c70-8ecd-05dd490bc85c" />
<img width="1913" height="1078" alt="as2" src="https://github.com/user-attachments/assets/ecc1c3c9-da25-4fa6-aaec-61196c25f5ae" />

<img width="1915" height="1063" alt="as3" src="https://github.com/user-attachments/assets/eebcd08d-f703-43a6-a83d-cbafa6ce3f7a" />



Screenshots of program output are included in:
