# 🧩 LeetCode Solutions in Java

This repository contains my **LeetCode problem solutions in Java**.  
Each file includes the problem solution and a brief explanation of how I solved it.



# 🧩First and Last Position of Element in Sorted Array

Find First and Last Position of Element in Sorted Array | [Link](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/).

# 3Sum Solution 🧩

This is my solution for the **LeetCode 3Sum problem** in Java.  
The program finds all **unique triplets** in an array that sum up to 0 using **HashSet** to avoid duplicates.

---

## Problem Link
[3Sum - LeetCode](https://leetcode.com/problems/3sum/)

---

## How I Solved
- Sorted the array first.  
- Iterated through the array and used a **HashSet** to track seen numbers for each element.  
- Added unique triplets to a **HashSet of lists** to avoid duplicates.  
- Returned the result as a list of lists.  

`ThreeSumSolution.java`

