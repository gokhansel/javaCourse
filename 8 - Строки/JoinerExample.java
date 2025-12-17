import java.util.StringJoiner;

public class JoinerExample {
    public static void main(String[] args) {
        
        // Пример 1: Просто разделитель (например, для CSV)
        StringJoiner joiner1 = new StringJoiner(", ");
        joiner1.add("Яблоко");
        joiner1.add("Банан");
        joiner1.add("Апельсин");
        
        System.out.println("Список фруктов: " + joiner1.toString());
        // Вывод: Яблоко, Банан, Апельсин


        // Пример 2: Разделитель + Префикс + Суффикс (например, для массива)
        // Разделитель: ", " | Префикс: "[" | Суффикс: "]"
        StringJoiner joiner2 = new StringJoiner(", ", "[", "]");
        joiner2.add("Red");
        joiner2.add("Green");
        joiner2.add("Blue");

        System.out.println("Цвета: " + joiner2.toString());
        // Вывод: [Red, Green, Blue]
    }
}
