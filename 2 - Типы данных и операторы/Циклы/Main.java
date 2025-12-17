public class Main {
    public static void main(String[] args) {

        // ПРАКТИКА 1: Бесконечные циклы

        // 1. Бесконечный цикл while
        int countWhile = 0;
        while (true) {
            countWhile++;
            if (countWhile < 3) {
                System.out.println("While iteration: " + countWhile);
            }
            // Добавляем break, чтобы цикл не был действительно бесконечным
            if (countWhile >= 3) {
                break; 
            }
        }
        System.out.println("Цикл while завершен.\n");


        // 2. Бесконечный цикл do-while
        int countDoWhile = 0;
        do {
            countDoWhile++;
            if (countDoWhile < 3) {
                System.out.println("Do-While iteration: " + countDoWhile);
            }
            // Добавляем break, чтобы цикл не был действительно бесконечным
            if (countDoWhile >= 3) {
                break;
            }
        } while (true);
        System.out.println("Цикл do-while завершен.");

        // ПРАКТИКА 2: break и continue

        // Используем цикл for для демонстрации
        for (int i = 1; i <= 10; i++) {
            
            // 1. CONTINUE: Пропускаем итерацию i = 5
            if (i == 5) {
                System.out.print(" (Skip 5) ");
                continue; // Переходит к следующей итерации (i++)
            }

            // 2. BREAK: Прерываем цикл, когда i достигает 8
            if (i == 8) {
                System.out.print(" (Stop at 8) ");
                break; // Немедленно завершает цикл
            }
            
            System.out.print(i + " ");
        }
        System.out.println("\nЦикл завершен оператором break.");
    }
}