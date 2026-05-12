public class Edge {
    private Vertex source;      // Начальная вершина [cite: 27]
    private Vertex destination; // Конечная вершина [cite: 28]

    public Edge(Vertex source, Vertex destination) { // Конструктор [cite: 30]
        this.source = source;
        this.destination = destination;
    }

    // Геттеры [cite: 31]
    public Vertex getSource() { return source; }
    public Vertex getDestination() { return destination; }

    @Override
    public String toString() { // Метод для вывода ребра [cite: 32]
        return source.getId() + " -> " + destination.getId();
    }
}