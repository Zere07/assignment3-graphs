 Assignment 4: Graph Traversal and Representation System

A. Project Overview
This project implements a graph data structure using an Adjacency List The system supports adding vertices and edges, printing the graph structure , and performing two types of traversals: Breadth-First Search (BFS) and Depth-First Search (DFS) The objective is to analyze algorithm behavior and performance across different graph sizes.

 B. Class Descriptions
Vertex: Represents a node with a unique identifier (`id`) .
Edge: Represents a connection between a source and a destination vertex .
Graph: Manages the adjacency list and implements traversal logic.
Experiment: Handles performance testing and measures execution time using `System.nanoTime()`.

C. Algorithm Descriptions
Breadth-First Search (BFS) 
Mechanism: Explores neighbors level-by-level using a Queue.
Use Case: Finding the shortest path in unweighted graphs.
Time Complexity**:O(V + E).

Depth-First Search (DFS) 
Mechanism: Explores as far as possible along a branch before backtracking using Recursion.
Use Case: Pathfinding and cycle detection.
Time Complexity: O(V + E).

D. Experimental Results 
Based on the execution results from the console:

| Graph Size | BFS Time (ns) | DFS Time (ns) |
|------------|---------------|---------------|
| 10 nodes   | 1,061,800     | 258,600       |
| 30 nodes   | 522,300       | 458,600       |
| 100 nodes  | 1,927,500     | 2,105,400     |

Observations:
As the number of vertices increases from 10 to 100, the execution time generally increases.
The results roughly follow the O(V + E) complexity, though small sizes may show variance due to JVM overhead.

E. Screenshots
All supporting screenshots are located in `docs/screenshots/`:
Graph Structure: Connectivity of the 10-node graph.
Traversal Output: Correct BFS and DFS visit orders.
Performance: Execution times for all tested sizes.

F. Reflection 
In this assignment, I learned how to represent complex relationships using an Adjacency List, which is more memory-efficient than a matrix.Implementing both BFS and DFS helped me understand the practical difference between iterative (Queue-based) and recursive (Stack-based) approaches.

One challenge was correctly managing the `visited` set to prevent infinite loops during traversal.Additionally, learning to use `System.nanoTime()` taught me how to perform basic performance benchmarking in Java.

DIJKSTRA'S ALGORITHM ADDITION

Implemented Dijkstra's algorithm to find the shortest path from a starting vertex to all other vertices in the graph.

Changes Made

Edge Class: Added the weight field, updated the constructor and added a getWeight() getter.
Graph Class:
Switched the adjacency list to Map<Integer, List> to store weighted edges directly.
Updated bfs and dfs to work with the new Edge-based structure.
Implemented dijkstra(int start) using arrays for distances and visited nodes, simple loops, no priority queue.
Experiment Class: Updated buildGraph()` to assign varying edge weights and added Dijkstra timing to the results table.
Output

Sample Output:
```text
Dijkstra from 0:

To node 0 -> Distance: 0
To node 1 -> Distance: 1
To node 2 -> Distance: 1
To node 3 -> Distance: 3
To node 4 -> Distance: 4
To node 5 -> Distance: 7
To node 6 -> Distance: 8
To node 7 -> Distance: 10
To node 8 -> Distance: 13
To node 9 -> Distance: 11

How Dijkstra Works

Dijkstra finds the shortest path from a start node to every other node. All distances start as infinity except the start node which is 0. Each step picks the unvisited node with the smallest known distance, then checks its neighbors — if going through the current node gives a shorter path, it updates the distance. Repeats until all reachable nodes are settled.

Unlike BFS which treats all edges as equal, Dijkstra accounts for weights so it can't assume the first path found is the shortest — it keeps updating until certain. The implementation uses a simple array scan instead of a priority queue, which is O(V²) rather than O(V log V), but keeps the code simple.



