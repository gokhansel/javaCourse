public class Main {
    public static void main(String[] args) {
        Wrapper<String> wStr = new Wrapper<>();

        // Не работает: Illegal generic type for instanceof
        // if (wStr instanceof Wrapper<String>) { ... }

        // проверка только класса
        if (wStr instanceof Wrapper) {
            System.out.println("Это объект класса Wrapper");
        }

        // использование wildcard
        if (wStr instanceof Wrapper<?>) {
            System.out.println("Это тоже корректная запись");
        }
    }
}