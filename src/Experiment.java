import java.util.*;

public class Experiment {

    public void runTraversals(Graph g, int startNode) {
        long startBfs = System.nanoTime();
        g.bfs(startNode);
        long endBfs = System.nanoTime();
        System.out.println("BFS Time: " + (endBfs - startBfs) + " ns");

        long startDfs = System.nanoTime();
        g.dfs(startNode);
        long endDfs = System.nanoTime();
        System.out.println("DFS Time: " + (endDfs - startDfs) + " ns");

        long startDijkstra = System.nanoTime();
        g.dijkstra(startNode);
        long endDijkstra = System.nanoTime();
        System.out.println("Dijkstra Time: " + (endDijkstra - startDijkstra) + " ns");
    }

    public void runMultipleTests() {
        int[] sizes = {10, 30, 100};

        for (int size : sizes) {
            System.out.println("\n--- Testing Graph Size: " + size + " nodes ---");

            Graph g = new Graph();

            for (int i = 0; i < size; i++) {
                g.addVertex(new Vertex(i));
            }

            for (int i = 0; i < size; i++) {
                int edgesCount = (int) (Math.random() * 3) + 1; // от 1 до 3 связей у каждого узла
                for (int j = 0; j < edgesCount; j++) {
                    int destination = (int) (Math.random() * size);
                    if (i != destination) {
                        int randomWeight = (int) (Math.random() * 9) + 1; // Генерируем вес от 1 до 10
                        g.addEdge(i, destination, randomWeight); // Передаем вес в граф
                    }
                }
            }

            runTraversals(g, 0);
        }
    }
}