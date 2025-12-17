public class VarargsOverload {

    // 1. Перегрузка для целых чисел
    public static void doSomething(int... numbers) {
        System.out.print("Метод с int...: ");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // 2. Перегрузка для строк
    public static void doSomething(String... strings) {
        System.out.print("Метод с String...: ");
        for (String s : strings) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        doSomething(1, 2, 3, 4, 5);
        doSomething("Java", "Varargs", "Example");
    }
}