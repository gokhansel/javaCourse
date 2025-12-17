public class Main {
    public static void main(String[] args) {

        // 1. ArithmeticException
        // Возникает при недопустимых арифметических операциях (например, деление на ноль)
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("1. Поймано: " + e);
        }

        // 2. ArrayIndexOutOfBoundsException
        // Возникает при обращении к несуществующему индексу массива
        try {
            int[] array = new int[2];
            int x = array[10]; // Индекса 10 не существует
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("2. Поймано: " + e);
        }

        // 3. IllegalArgumentException
        // Генерируется явно, когда метод получает некорректный аргумент
        try {
            setAge(-5); // Передаем недопустимый возраст
        } catch (IllegalArgumentException e) {
            System.out.println("3. Поймано: " + e);
        }

        // 4. ClassCastException
        // Возникает при попытке привести объект к классу, наследником которого он не является
        try {
            Object obj = "Строка";
            Integer num = (Integer) obj; // Нельзя превратить String в Integer
        } catch (ClassCastException e) {
            System.out.println("4. Поймано: " + e);
        }

        // 5. NullPointerException
        // Возникает при попытке вызвать метод или поле у объекта, который равен null
        try {
            String str = null;
            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("5. Поймано: " + e);
        }
    }

    // Вспомогательный метод для примера IllegalArgumentException
    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным!");
        }
    }
}