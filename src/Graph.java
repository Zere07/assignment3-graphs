import java.util.*;

public class Graph {
    private Map<Integer, List<Integer>> adjList;

    public Graph() {
        this.adjList = new HashMap<>();
    }
    public void addVertex(Vertex v) {
        adjList.putIfAbsent(v.getId(), new ArrayList<>());
    }

    public void addEdge(int from, int to) {
        adjList.get(from).add(to);
    }

    public void printGraph() {
        for (var entry : adjList.entrySet()) {
            System.out.println("Vertex " + entry.getKey() + " is connected to: " + entry.getValue());
        }
    }
}