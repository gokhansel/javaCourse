public class FormatGeneral {
    public static void main(String[] args) {
        boolean logic = true;
        char symbol = 'Z';
        int number = 100;
        double pi = 3.14159;
        String text = "Java";

        // 1. %b - Логическое значение
        System.out.printf("Логика: %b %n", logic);

        // 2. %c - Символ
        System.out.printf("Символ: %c %n", symbol);

        // 3. %d - Целое число
        System.out.printf("Число: %d %n", number);

        // 4. %f - Число с плавающей точкой (округлим до 2 знаков)
        System.out.printf("Дробь: %.2f %n", pi);

        // 5. %s - Строка
        System.out.printf("Строка: %s %n", text);
        
        // Дополнительно: %% - вывод символа процента
        System.out.printf("Процент: 99%% %n");
    }
}