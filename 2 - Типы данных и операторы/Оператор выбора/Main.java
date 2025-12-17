public class Main {

    // Практика 1:
    enum Color { RED, GREEN, BLUE }
    public static void main(String[] args) {
        // 1. Пример с Классы-обертки
        char grade = 'A';
        switch (grade) {
            case 'A': System.out.println("Char: Отлично"); break;
            default: System.out.println("Char: Другая оценка");
        }

        // 2. Пример со Строки
        String day = "Monday";
        switch (day) {
            case "Monday": System.out.println("String: Понедельник"); break;
            default: System.out.println("String: Другой день");
        }

        // 3. Пример с Перечисления
        Color color = Color.RED;
        switch (color) {
            case RED: System.out.println("Enum: Красный"); break;
            case GREEN: System.out.println("Enum: Зеленый"); break;
        }

        // 4. Пример с Примитивы
        Integer num = 10;
        switch (num) {
            case 10: System.out.println("Integer: Десять"); break;
        }

        // Практика 2:
       // Если оператор break отсутствует, происходит так называемое "проваливание" (fall-through). Программа выполнит код совпавшего case, а затем продолжит выполнять код следующего case (даже если условие не подходит), пока не встретит break или конец блока switch.

        int value = 2; // Проверяем случай case 2
        int i = 0;

        System.out.println("Исходное value: " + value);

        switch (value) {
            case 1:
                i = 1;
                System.out.println("Выполнен case 1");
                break;
            case 2:
                i = 2;
                System.out.println("Выполнен case 2 (break отсутствует!)");
                // Нет break, идем вниз -> fall-through
            case 3:
                i = 3;
                System.out.println("Выполнен case 3 (случайно попали сюда)");
                break;
            default:
                i = 4;
        }

        System.out.println("Итоговое значение i: " + i);
        System.out.println("Объяснение: Из-за отсутствия break в case 2, программа 'провалилась' в case 3 и перезаписала i.");
    }
}