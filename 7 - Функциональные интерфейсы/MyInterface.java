interface MyInterface {
    // 1. Неабстрактный метод (default)
    default void defaultMethod() {
        System.out.println("Вызван default метод");
    }

    // 2. Статический метод (static)
    static void staticMethod() {
        System.out.println("Вызван static метод интерфейса");
    }
}

class MyClass implements MyInterface {
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.defaultMethod();
        MyInterface.staticMethod();
    }
}