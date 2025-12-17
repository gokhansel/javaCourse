public class MutableStrings {
    public static void main(String[] args) {
        // Создаем объект с начальной строкой
        StringBuilder sb = new StringBuilder("Hello");

        System.out.println("Старт: " + sb);

        // 1. append(String s) — добавляет строку в конец текущей последовательности
        sb.append(" World");
        System.out.println("1. append: " + sb); // "Hello World"

        // 2. insert(int offset, String s) — вставляет строку в указанную позицию
        sb.insert(6, "Java ");
        System.out.println("2. insert: " + sb); // "Hello Java World"

        // 3. delete(int start, int end) — удаляет символы в диапазоне (end не включается)
        sb.delete(0, 6);
        System.out.println("3. delete: " + sb); // "Java World"

        // 4. reverse() — переворачивает последовательность символов задом наперед
        sb.reverse();
        System.out.println("4. reverse: " + sb); // "dlroW avaJ"

        // 5. reverse() (вернем обратно для читаемости)
        sb.reverse(); 

        // 6. replace(int start, int end, String str) — заменяет часть строки на другую
        sb.replace(5, 10, "Code");
        System.out.println("6. replace: " + sb); // "Java Code"

        // 7. setCharAt(int index, char ch) — заменяет один символ по индексу
        sb.setCharAt(0, 'L');
        System.out.println("7. setCharAt: " + sb); // "Lava Code"

        // 8. capacity() — возвращает текущую вместимость буфера (сколько памяти выделено)
        // Обычно это длина строки + 16 символов запаса (если не задано иное)
        System.out.println("8. capacity: " + sb.capacity());

        // 9. setLength(int newLength) — изменяет длину строки.
        // Если меньше текущей — обрезает, если больше — заполняет null-символами (\u0000)
        sb.setLength(4);
        System.out.println("9. setLength: " + sb); // "Lava"

        // 10. charAt(int index) — возвращает символ по индексу (как в String)
        char ch = sb.charAt(1);
        System.out.println("10. charAt(1): " + ch); // 'a'
    }
}