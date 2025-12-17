public class MixedTypes {
    public static void main(String[] args) {
        byte b = 10;
        int i = 20;
        double d = 5.5;

        // Пример 1: byte + int -> результат int
        // byte расширяется до int
        int result1 = b + i; 
        System.out.println("int: " + result1);

        // Пример 2: int + double -> результат double
        // int расширяется до double
        double result2 = i + d; 
        System.out.println("double: " + result2); // 25.5
        
        // Пример 3: byte + byte -> результат int (!)
        // В арифметических операциях byte и short всегда сначала приводятся к int
        byte b2 = 2;
        // byte result3 = b + b2; // ОШИБКА КОМПИЛЯЦИИ: результат типа int нельзя положить в byte
        int result3 = b + b2; // Правильно
    }
}