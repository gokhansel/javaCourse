import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {10, 5, 20, 15};
        int[] arr2 = {10, 5, 20, 15};

        // 1. String toString(...) — возвращает строковое представление массива
        System.out.println("toString: " + Arrays.toString(arr1));

        // 2. void sort(...) — сортирует массив в порядке возрастания
        Arrays.sort(arr1);
        System.out.println("После sort: " + Arrays.toString(arr1));

        // 3. int binarySearch(...) — ищет элемент в массиве
        // Возвращает индекс элемента. Если не найден — возвращает отрицательное число.
        int index = Arrays.binarySearch(arr1, 20);
        System.out.println("binarySearch (число 20): индекс " + index);

        // 4. boolean equals(...) — сравнивает два массива на равенство
        // arr1 теперь отсортирован {5, 10, 15, 20}, а arr2 нет. Результат: false
        boolean areEqual = Arrays.equals(arr1, arr2);
        System.out.println("equals: " + areEqual);

        // 5. int compare(...) — лексикографическое сравнение массивов (Java 9+)
        // Возвращает 0, если массивы равны; значение <0 или >0, если они отличаются.
        // (Примечание: метод возвращает int, а не boolean)
        int comparison = Arrays.compare(arr1, arr2);
        System.out.println("compare: " + comparison);
    }
}