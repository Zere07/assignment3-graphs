public class Vertex {
    private int id; // Уникальный идентификатор [cite: 19]

    public Vertex(int id) { // Конструктор [cite: 21]
        this.id = id;
    }

    public int getId() { // Геттер [cite: 22]
        return id;
    }

    @Override
    public String toString() { // Для вывода [cite: 23]
        return "Vertex{" + "id=" + id + '}';
    }
}