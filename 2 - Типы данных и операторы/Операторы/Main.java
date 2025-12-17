// Практика 1:

public class Main {
    public static void main(String[] args) {
        System.out.println("Практика 1: Примеры операторов:");
        int a = 10;
        int b = 3;
        boolean bool1 = true;
        boolean bool2 = false;

        // 1. Арифметические операторы: ( *, /, %, +, -)
        System.out.println("10 * 3 = " + (a * b)); // Умножение 
        System.out.println("10 / 3 = " + (a / b)); // Деление 
        System.out.println("10 % 3 = " + (a % b)); // Остаток (mod)

        // 2. Операторы сдвига: (<<, >>, >>>)
        int val = 8; // 0000...1000
        System.out.println("8 << 1 = " + (val << 1)); // 16 (Сдвиг влево)
        System.out.println("8 >> 1 = " + (val >> 1)); // 4 (Сдвиг вправо)

        // 3. Операторы сравнения: (<, <=, >, >=, ==, !=)
        System.out.println("10 > 3: " + (a > b));
        System.out.println("10 == 3: " + (a == b));

        // 4. Побитовые и Логические операторы: (&, ^, |, &&, ||)
        System.out.println("true && false: " + (bool1 && bool2)); // Логическое И
        System.out.println("true  false: " + (bool1  bool2)); // Логическое ИЛИ
        System.out.println("5 & 3: " + (5 & 3)); // Побитовое И (0101 & 0011 = 0001)

        // 5. Тернарный оператор:
        String status = (a > b) ? "a больше" : "b больше";
        System.out.println("Тернарный: " + status);

        // 6. Присваивание: (=, +=, -=, *=, ...)
        int c = 5;
        c += 10; // c = c + 10
        System.out.println("c += 10 result: " + c);

        // 7. Работа со строками: (+ и += для String)
        String str1 = "Hello";
        String str2 = "World";
        String resStr = str1 + ", " + str2 + "!"; // Конкатенация
        System.out.println("String (+): " + resStr);
        
        str1 += " Java"; // То же самое, что str1 = str1 + " Java"
        System.out.println("String (+=): " + str1);

        // 8. Инкремент и Декремент: (++, --)
        int x = 5;
        // Постфиксная:
        System.out.println("Постфикс (x++): " + (x++)); // Выведет 5
        System.out.println("После x++ x равен: " + x);    // Выведет 6
       
        int y = 5;
        // Префиксная:
        System.out.println("Префикс (++y): " + (++y));   // Выведет 6
        System.out.println("После ++y y равен: " + y);    // Выведет 6

// Практика 2:

        System.out.println("\nПрактика 2: Оператор instanceof");
        String text = "Java Test";
        Integer number = 123;

        // Проверка принадлежности к классу:
        boolean isString = text instanceof String;
        System.out.println("'text' is String? : " + isString); // true

        boolean isObject = text instanceof Object;
        System.out.println("'text' is Object? : " + isObject); // true

        // Проверка с null-объектом:
        String nullString = null;
        boolean nullCheck = nullString instanceof String;
        
        // Важно: instanceof с null всегда возвращает false
        System.out.println("null is String? : " + nullCheck); // false
    }
}