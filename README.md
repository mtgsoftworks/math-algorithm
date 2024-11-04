
# Java Random Number List Merger and Sorter

### Overview
This Java program generates two lists of random integers, merges them into a third list, and performs sorting operations to display the combined list in ascending order.

---

### Features

1. **Random Number Generation**: Generates 30 random integers between 0 and 9 for each of two lists (`list1` and `list2`).
2. **List Merging**: Combines `list1` and `list2` into a new list (`list3`).
3. **Sorting and Reversing**: First reverses `list3`, then sorts it in ascending order.
4. **Output Display**: Prints the sorted merged list to the console.

---

### Code Explanation

- **Random Number Generation**: Using a `for` loop, 30 random integers are added to both `list1` and `list2`.
- **List Merging**: `list3` is initialized to combine `list1` and `list2`.
- **Sorting**: `Collections.reverse()` initially reverses `list3`, and `Collections.sort()` then sorts it in ascending order.
- **Output**: The sorted list `list3` is printed to the console.

### Usage

Compile and run the program:
```bash
javac Main.java
java Main
```

The program will output a sorted list of integers derived from two randomly generated lists.

