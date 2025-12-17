class MyResource implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("Ресурс закрыт автоматически!");
    }

    public void doWork() {
        System.out.println("Работа с ресурсом...");
    }
}

public class Main {
    public static void main(String[] args) {
        try (MyResource resource = new MyResource()) {
            resource.doWork();
        } 
        // Здесь не нужен блок finally для вызова close()
    }
}