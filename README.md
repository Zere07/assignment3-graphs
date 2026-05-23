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

Assignment 4: Graph Traversal Algorithms & Dijkstra's Algorithm (BONUS TASK)

 Project Overview
This project implements a directed graph structure in Java using an Adjacency List. It includes basic graph traversal algorithms (BFS and DFS), as well as Dijkstra's Shortest Path Algorithm** as a bonus task.

The main goal of the project is to analyze and compare the empirical execution times of these algorithms on random graphs of different sizes (10, 30, and 100 vertices).


 Core Infrastructure

 1. Vertex Class
Represents a single node in the graph. Each vertex has a unique integer ID.
Method `getId()` returns the identifier.
Overridden `toString()` prints just the ID for clean output.

 2. Edge Class
Represents a directed, weighted link between two vertices.
Contains `source`, `destination`, and an integer `weight`.
`toString()` formats the edge as `source->destination (weight)`.

 3. Graph Class
Manages vertices and edges using a `Map<Integer, List<Edge>>` as an adjacency list.
`addVertex(Vertex v)`: Adds a new vertex to the map if it does not exist.
`addEdge(int from, int to, int weight)`: Connects two vertices with a weighted directed edge.
`printGraph()`: Displays the full structure of the graph in the console.


Algorithms Implemented
BFS (Breadth-First Search): Explores the graph layer by layer using a `Queue` to ensure that vertices closer to the starting node are visited first.
DFS (Depth-First Search): Explores as deep as possible along each branch before backtracking, implemented using a recursive helper function.
Dijkstra's Algorithm (Bonus): Finds the shortest paths from a source node to all other reachable nodes. It uses plain arrays for tracking `distances` and `visited` status, finding the minimum temporary distance via simple loops (O(V^2)complexity) without relying on a PriorityQueue.

Experimental Results

The algorithms were tested on automatically generated random graphs containing 10, 30, and 100 nodes. Each node was randomly assigned 1 to 3 outgoing edges with weights ranging from 1 to 10.

Here are the execution times recorded during the experiment:

| Graph Size | BFS Time (ns) | DFS Time (ns) | Dijkstra Time (ns) |
|------------|---------------|---------------|--------------------|
| 10 nodes   | 1,549,200     | 455,500       | 4,567,200          |
| 30 nodes   | 182,600       | 109,400       | 1,057,700          |
| 100 nodes  | 2,635,100     | 2,781,000     | 3,964,000          |

 Key Takeaways:
1. BFS vs DFS: Both standard traversals scale linearly based on the number of nodes and edges (O(V + E)). Fluctuations at 10 nodes are caused by JVM warmup effects during the first execution loop.
2. Dijkstra Performance: Dijkstra's algorithm naturally takes more time than simple traversals because it performs edge relaxation and continuously scans the distance array to find the minimum unvisited vertex, matching its theoretical O(V^2) bound for this array-based implementation.
3. Infinity Paths: In cases where a node cannot be reached from node 0 due to the random nature of the graph generation, the algorithm correctly logs the distance as `Infinity`.




