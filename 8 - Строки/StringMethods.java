import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str = "  Java Programming Language  ";
        System.out.println("Исходная строка: [" + str + "]");

        // 1. length() - Возвращает длину строки (количество символов)
        System.out.println("1. length: " + str.length());

        // 2. trim() - Удаляет пробелы в начале и в конце строки
        String trimmed = str.trim();
        System.out.println("2. trim: [" + trimmed + "]");

        // 3. toUpperCase() - Преобразует все символы в верхний регистр
        System.out.println("3. toUpperCase: " + trimmed.toUpperCase());

        // 4. toLowerCase() - Преобразует все символы в нижний регистр
        System.out.println("4. toLowerCase: " + trimmed.toLowerCase());

        // 5. charAt(int index) - Возвращает символ по указанному индексу (начинается с 0)
        System.out.println("5. charAt(0): " + trimmed.charAt(0)); // 'J'

        // 6. substring(int beginIndex) - Вырезает подстроку начиная с индекса
        System.out.println("6. substring(5): " + trimmed.substring(5)); // "Programming Language"

        // 7. contains(CharSequence s) - Проверяет, содержит ли строка подстроку
        System.out.println("7. contains 'Java': " + trimmed.contains("Java")); // true

        // 8. replace(target, replacement) - Заменяет символы или подстроки
        System.out.println("8. replace: " + trimmed.replace("Java", "Python"));

        // 9. startsWith(String prefix) - Проверяет, начинается ли строка с указанного префикса
        System.out.println("9. startsWith 'Java': " + trimmed.startsWith("Java"));

        // 10. split(String regex) - Разделяет строку на массив строк по разделителю (например, пробелу)
        String[] words = trimmed.split(" ");
        System.out.println("10. split (первое слово): " + words[0]); // "Java"
    }
}