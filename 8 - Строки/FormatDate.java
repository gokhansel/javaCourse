import java.util.Date;

public class FormatDate {
    public static void main(String[] args) {
        Date now = new Date(); // Текущая дата и время

        System.out.println("Текущее время и дата:");

        // Используем 5 спецификаторов:
        // 1. %tH - Час (00-23)
        // 2. %tM - Минуты
        // 3. %tS - Секунды
        // 4. %tA - День недели
        // 5. %tY - Год
        
        // Вариант 1: Передаем 'now' для каждого спецификатора
        System.out.printf("Точное время: %tH:%tM:%tS %n", now, now, now);
        
        // Вариант 2: Используем индекс '1$', чтобы ссылаться на первый аргумент (now)
        System.out.printf("Сегодня: %1$tA, год: %1$tY %n", now);
        
        // Полный пример в одной строке
        System.out.printf("Полная дата: %1$tA, %1$tB %1$td, %1$tY года.%n", now);
    }
}