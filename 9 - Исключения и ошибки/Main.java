class Ex1 extends Exception {}
class Ex2 extends Ex1 {}
class Ex3 extends Ex2 {}

public class Main {
    public static void main(String[] args) {
        
        // Ситуация 1: Иерархия исключений
        try {
            throw new Ex3();
        } 
        // Сначала ловим самого младшего потомка
        catch (Ex3 e) {
            System.out.println("Перехвачен Ex3 (самый специфичный)");
        } 
        // Затем его родителя
        catch (Ex2 e) {
            System.out.println("Перехвачен Ex2");
        } 
        // В конце самого общего предка
        catch (Ex1 e) {
            System.out.println("Перехвачен Ex1 (базовый)");
        }


        // Ситуация 2: Идентичная обработка (Multi-catch)
        try {
            // Генерируем случайное исключение для теста
            if (System.currentTimeMillis() % 2 == 0) {
                throw new ArithmeticException();
            } else {
                throw new NullPointerException();
            }
        } 
        // Объединяем разные исключения, если действия одинаковы
        // Эти классы НЕ должны иметь родственную связь (наследование)
        catch (ArithmeticException | NullPointerException e) {
            System.out.println("Произошла стандартная ошибка выполнения: " + e);
        }
    }
}