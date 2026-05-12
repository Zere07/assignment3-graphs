public class Experiment {

    public void runTraversals(Graph g, int startNode) {
        long startBfs = System.nanoTime(); [cite: 68]
        g.bfs(startNode);
        long endBfs = System.nanoTime(); [cite: 69]
        System.out.println("BFS Execution Time: " + (endBfs - startBfs) + " ns"); [cite: 72]

        long startDfs = System.nanoTime();
        g.dfs(startNode);
        long endDfs = System.nanoTime();
        System.out.println("DFS Execution Time: " + (endDfs - startDfs) + " ns");
    }

    public void printResults() {
        System.out.println("\nExperiment completed successfully."); [cite: 48]
    }
}