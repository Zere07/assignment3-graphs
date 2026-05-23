import java.util.*;

public class Graph {
    private Map<Integer, List<Edge>> adj = new HashMap<>();

    public void addVertex(Vertex v) {
        adj.putIfAbsent(v.getId(), new ArrayList<>());
    }

    public void addEdge(int from, int to, int weight) {
        adj.putIfAbsent(from, new ArrayList<>());
        adj.putIfAbsent(to, new ArrayList<>());
        adj.get(from).add(new Edge(from, to, weight));
    }

    public void printGraph() {
        for (var entry : adj.entrySet()) {
            System.out.println("Vertex " + entry.getKey() + " connects to: " + entry.getValue());
        }
    }

    public void bfs(int start) {
        System.out.print("BFS Traversal starting from node " + start + ": ");
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            System.out.print(curr + " ");

            List<Edge> edges = adj.get(curr);
            if (edges != null) {
                for (Edge edge : edges) {
                    int neighbor = edge.getDestination();
                    if (!visited.contains(neighbor)) {
                        visited.add(neighbor);
                        queue.add(neighbor);
                    }
                }
            }
        }
        System.out.println();
    }

    public void dfs(int start) {
        System.out.print("DFS Traversal starting from node " + start + ": ");
        Set<Integer> visited = new HashSet<>();
        dfsHelper(start, visited);
        System.out.println();
    }

    private void dfsHelper(int curr, Set<Integer> visited) {
        visited.add(curr);
        System.out.print(curr + " ");

        List<Edge> edges = adj.get(curr);
        if (edges != null) {
            for (Edge edge : edges) {
                int neighbor = edge.getDestination();
                if (!visited.contains(neighbor)) {
                    dfsHelper(neighbor, visited);
                }
            }
        }
    }

    public void dijkstra(int start) {
        if (adj.isEmpty()) return;

        int maxId = 0;
        for (int vertex : adj.keySet()) {
            if (vertex > maxId) maxId = vertex;
        }
        int n = maxId + 1;

        int[] dist = new int[n];
        boolean[] visited = new boolean[n];

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;

        for (int i = 0; i < n; i++) {
            int u = -1;
            int minDist = Integer.MAX_VALUE;

            for (int v = 0; v < n; v++) {
                if (adj.containsKey(v) && !visited[v] && dist[v] < minDist) {
                    minDist = dist[v];
                    u = v;
                }
            }

            if (u == -1) break;
            visited[u] = true;

            List<Edge> edges = adj.get(u);
            if (edges != null) {
                for (Edge edge : edges) {
                    int v = edge.getDestination();
                    int weight = edge.getWeight();

                    if (!visited[v] && dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                        dist[v] = dist[u] + weight;
                    }
                }
            }
        }

        System.out.println("Dijkstra Shortest Paths from node " + start + ":");
        for (int v = 0; v < n; v++) {
            if (adj.containsKey(v)) {
                String distanceStr = (dist[v] == Integer.MAX_VALUE) ? "Infinity" : String.valueOf(dist[v]);
                System.out.println("  To node " + v + " -> Minimum Distance = " + distanceStr);
            }
        }
    }
}