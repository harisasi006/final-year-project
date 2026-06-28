import java.util.Scanner;

public class DSAQuestions {

    static String[][] questions = {
        // {Question, Answer, Explanation}
        {
            "What is the time complexity of Binary Search?",
            "O(log n)",
            "Binary Search divides the array in half each time, so it takes log(n) steps."
        },
        {
            "Which data structure uses LIFO (Last In First Out)?",
            "Stack",
            "A Stack follows LIFO - the last element added is the first one removed. Example: Undo feature."
        },
        {
            "What is the time complexity of Bubble Sort in worst case?",
            "O(n^2)",
            "Bubble Sort compares every element with every other element, giving O(n^2) in worst case."
        },
        {
            "Which data structure is used for BFS (Breadth First Search)?",
            "Queue",
            "BFS uses a Queue (FIFO) to visit nodes level by level."
        },
        {
            "What is the best sorting algorithm for large datasets?",
            "Merge Sort or Quick Sort",
            "Both have O(n log n) average time complexity, making them efficient for large data."
        },
        {
            "What is a Linked List?",
            "A linear data structure where each element points to the next",
            "Unlike arrays, linked list elements are not stored at contiguous memory locations."
        },
        {
            "What is the time complexity of accessing an element in an Array?",
            "O(1)",
            "Arrays allow direct access using index, so access time is constant O(1)."
        },
        {
            "What does DFS stand for?",
            "Depth First Search",
            "DFS explores as far as possible along a branch before backtracking. Uses Stack or Recursion."
        },
        {
            "What is a Binary Tree?",
            "A tree where each node has at most 2 children",
            "Binary Tree nodes have a left child and right child. Used in BST, heaps, etc."
        },
        {
            "What is Dynamic Programming?",
            "Solving problems by breaking them into overlapping subproblems",
            "DP stores results of subproblems to avoid redundant computation. Example: Fibonacci, Knapsack."
        }
    };

    public static void start(Scanner sc) {
        System.out.println("\n==========================================");
        System.out.println("         DSA PRACTICE QUESTIONS           ");
        System.out.println("==========================================");
        System.out.println("1. View All Questions & Answers");
        System.out.println("2. Back to Main Menu");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();
        if (choice == 1) {
            showAll();
        }
    }

    public static void showAll() {
        System.out.println("\n📘 TOP 10 DSA QUESTIONS FOR PLACEMENTS\n");
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Q" + (i + 1) + ": " + questions[i][0]);
            System.out.println("   ✅ Answer     : " + questions[i][1]);
            System.out.println("   💡 Explanation: " + questions[i][2]);
            System.out.println("------------------------------------------");
        }
    }
}
