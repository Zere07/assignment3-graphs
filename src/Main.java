import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Experiment experiment = new Experiment();
        Random random = new Random();
        int[] sizes = {10, 30, 100}; // Размеры графов по заданию [cite: 59-62]

        for (int size : sizes) {
            System.out.println("\n=== TESTING GRAPH WITH " + size + " VERTICES ===");
            Graph g = new Graph();

            for (int i = 0; i < size; i++) {
                g.addVertex(new Vertex(i));
            }

            for (int i = 0; i < size * 1.5; i++) {
                g.addEdge(random.nextInt(size), random.nextInt(size));
            }

            if (size == 10) {
                System.out.println("Graph Structure:");
                g.printGraph();
            }

            experiment.runTraversals(g, 0);
        }
    }
}