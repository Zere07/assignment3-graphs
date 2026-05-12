# Assignment 4: Graph Traversal and Representation System

## A. Project Overview
[cite_start]This project implements a graph data structure using an **Adjacency List**[cite: 35, 90]. [cite_start]The system supports adding vertices and edges, printing the graph structure [cite: 37-39][cite_start], and performing two types of traversals: **Breadth-First Search (BFS)** and **Depth-First Search (DFS)**[cite: 13, 14, 41, 42]. [cite_start]The objective is to analyze algorithm behavior and performance across different graph sizes [cite: 5-7].

## B. Class Descriptions
- [cite_start]**Vertex**: Represents a node with a unique identifier (`id`) [cite: 16-19].
- [cite_start]**Edge**: Represents a connection between a source and a destination vertex [cite: 24-28].
- [cite_start]**Graph**: Manages the adjacency list and implements traversal logic[cite: 33, 40].
- [cite_start]**Experiment**: Handles performance testing and measures execution time using `System.nanoTime()` [cite: 43-48, 67].

## C. Algorithm Descriptions
### [cite_start]Breadth-First Search (BFS) [cite: 93]
- [cite_start]**Mechanism**: Explores neighbors level-by-level using a **Queue**[cite: 96].
- [cite_start]**Use Case**: Finding the shortest path in unweighted graphs[cite: 97].
- [cite_start]**Time Complexity**: **O(V + E)**[cite: 98].

### [cite_start]Depth-First Search (DFS) [cite: 94]
- [cite_start]**Mechanism**: Explores as far as possible along a branch before backtracking using **Recursion**[cite: 96].
- [cite_start]**Use Case**: Pathfinding and cycle detection[cite: 97].
- [cite_start]**Time Complexity**: **O(V + E)**[cite: 98].

## [cite_start]D. Experimental Results [cite: 99]
Based on the execution results from the console:

| Graph Size | BFS Time (ns) | DFS Time (ns) |
|------------|---------------|---------------|
| 10 nodes   | 1,061,800     | 258,600       |
| 30 nodes   | 522,300       | 458,600       |
| 100 nodes  | 1,927,500     | 2,105,400     |

### [cite_start]Observations[cite: 105]:
- [cite_start]As the number of vertices increases from 10 to 100, the execution time generally increases[cite: 77].
- [cite_start]The results roughly follow the **O(V + E)** complexity, though small sizes may show variance due to JVM overhead[cite: 79].

## [cite_start]E. Screenshots [cite: 106]
[cite_start]All supporting screenshots are located in `docs/screenshots/`[cite: 126]:
- [cite_start]**Graph Structure**: Connectivity of the 10-node graph[cite: 107].
- [cite_start]**Traversal Output**: Correct BFS and DFS visit orders[cite: 108, 109].
- [cite_start]**Performance**: Execution times for all tested sizes[cite: 110].

## [cite_start]F. Reflection [cite: 111]
[cite_start]In this assignment, I learned how to represent complex relationships using an **Adjacency List**, which is more memory-efficient than a matrix[cite: 113]. [cite_start]Implementing both BFS and DFS helped me understand the practical difference between iterative (Queue-based) and recursive (Stack-based) approaches[cite: 114].

[cite_start]One challenge was correctly managing the `visited` set to prevent infinite loops during traversal[cite: 115]. [cite_start]Additionally, learning to use `System.nanoTime()` taught me how to perform basic performance benchmarking in Java[cite: 115].