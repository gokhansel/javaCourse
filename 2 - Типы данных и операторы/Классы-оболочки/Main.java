public class Main {
    public static void main(String[] args) {

   // Практика 1:
        Integer dec = Integer.decode("123");     // Обычное число (Decimal)
        Integer hex = Integer.decode("0xFF");    // Шестнадцатеричное (Hex) -> 255
        Integer oct = Integer.decode("010");     // Восьмеричное (Octal) -> 8
        Integer hashHex = Integer.decode("#FF"); // Другой формат Hex -> 255

        System.out.println("decode('123') -> " + dec);
        System.out.println("decode('0xFF') -> " + hex);
        System.out.println("decode('010') -> " + oct);
        System.out.println("decode('#FF') -> " + hashHex);

   // Практика 2:
        // 1. Через статический метод valueOf
        Boolean b1 = Boolean.valueOf(true);
        Boolean b2 = Boolean.valueOf("true"); // String

        // 2. Автоупаковка (Autoboxing)
        Boolean b3 = true;

        // 3. Использование констант класса
        Boolean b4 = Boolean.TRUE;
        
        // 4. Метод parseBoolean (возвращает примитив, но упаковывается в объект)
        Boolean b5 = Boolean.parseBoolean("True");

        System.out.println("b1: " + b1 + ", b2: " + b2 + ", b3: " + b3);

   // Практика 3:

        Integer nullInteger = null;
        
        try {
            // Попытка автораспаковки (unboxing) null-объекта в примитив int
            // Это вызывает intValue(), но объект null -> ошибка.
            int primitiveInt = nullInteger; 
        } catch (NullPointerException e) {
            System.out.println("Исключение перехвачено: Попытка распаковки null-объекта (Unboxing null).");
        }

   // Практика 4:
        System.out.println("[Тест 1: Число 128 (Вне кэша)]");
        int i1 = 128;
        Integer a1 = i1;
        Integer b1 = i1;
        // Сравнение объектов
        System.out.println("a1==i1 " + (a1 == i1));   // true: unboxing: сравниваются значения
        System.out.println("b1==i1 " + (b1 == i1));   // true: unboxing: сравниваются значения
        System.out.println("a1==b1 " + (a1 == b1));   // false: разные объекты в памяти
        // Сравнение содержимого
        System.out.println("a1.equals(i1) -> " + a1.equals(i1)); // true
        System.out.println("b1.equals(i1) -> " + b1.equals(i1)); // true
        System.out.println("a1.equals(b1) -> " + a1.equals(b1)); // true

        System.out.println("\n[Тест 2: Число 127 (Внутри кэша)]");
        int i2 = 127;
        Integer a2 = i2;
        Integer b2 = i2;
        System.out.println("a2==i2 " + (a2 == i2));
        System.out.println("b2==i2 " + (b2 == i2));
        System.out.println("a2==b2 " + (a2 == b2));
        System.out.println("a2.equals(i2) -> " + a2.equals(i2));
        System.out.println("b2.equals(i2) -> " + b2.equals(i2));
        System.out.println("a2.equals(b2) -> " + a2.equals(b2));

        System.out.println("\n--- ОБЪЯСНЕНИЕ (IntegerCache) ---");
        System.out.println("1. Java кэширует объекты Integer в диапазоне от -128 до 127.");
        System.out.println("2. Для числа 127: метод valueOf возвращает ссылку на уже существующий объект из кэша. Поэтому a2 == b2 -> true.");
        System.out.println("3. Для числа 128: оно не попадает в кэш. Создаются два разных объекта в куче (Heap). Поэтому a1 == b1 -> false.");
    }
}