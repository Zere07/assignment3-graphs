public class Experiment {

    public void runTraversals(Graph g, int startNode) {
        // Замеряем BFS
        long startBfs = System.nanoTime();
        g.bfs(startNode);
        long endBfs = System.nanoTime();
        System.out.println("BFS Execution Time: " + (endBfs - startBfs) + " ns");

        // Замеряем DFS
        long startDfs = System.nanoTime();
        g.dfs(startNode);
        long endDfs = System.nanoTime();
        System.out.println("DFS Execution Time: " + (endDfs - startDfs) + " ns");
    }

    public void printResults() {
        System.out.println("\nExperiment completed successfully.");
    }
}