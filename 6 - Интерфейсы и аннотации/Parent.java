// Пример1:

class Parent {
    public void display() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    // Если мы случайно напишем с ошибкой: displa(),
    // компилятор выдаст ошибку, так как такого метода нет в Parent.
    @Override
    public void display() {
        System.out.println("Child");
    }
}

// Пример2:

public class OldService {
    
    // Старый метод, который лучше не использовать
    @Deprecated
    public void oldMethod() {
        System.out.println("Старый функционал");
    }

    // Новый метод, который следует использовать вместо старого
    public void newMethod() {
        System.out.println("Новый функционал");
    }
}

// Пример3:

public class SuppressExample {
    
    // Мы знаем, что oldMethod устарел, но нам ОЧЕНЬ нужно его вызвать.
    // Аннотация уберет желтое предупреждение компилятора.
    @SuppressWarnings("deprecation")
    public void runLegacyCode() {
        OldService service = new OldService();
        service.oldMethod(); 
    }

    // Пример подавления предупреждений о "сырых" типах
    @SuppressWarnings("unchecked")
    public void listExample() {
        java.util.ArrayList list = new java.util.ArrayList(); // Сырой тип
        list.add("Test"); // Компилятор молчит
    }
}


