public class Conversions {
    public static void main(String[] args) {
        String str = "Базовая строка";

        // 1. String -> StringBuilder / StringBuffer
        // Используем конструктор
        StringBuilder sbBuilder = new StringBuilder(str);
        StringBuffer sbBuffer = new StringBuffer(str);

        System.out.println("String -> Builder: " + sbBuilder);
        System.out.println("String -> Buffer:  " + sbBuffer);

        // 2. StringBuilder / StringBuffer -> String
        // Используем метод toString()
        String fromBuilder = sbBuilder.toString();
        String fromBuffer = sbBuffer.toString();
        
        // Или String.valueOf()
        String valOf = String.valueOf(sbBuilder);

        System.out.println("Builder -> String: " + fromBuilder);

        // 3. StringBuilder <-> StringBuffer
        // Напрямую нельзя. Нужно пройти через String (toString -> Конструктор)
        
        // StringBuilder -> StringBuffer
        StringBuffer newBuffer = new StringBuffer(sbBuilder.toString());
        
        // StringBuffer -> StringBuilder
        StringBuilder newBuilder = new StringBuilder(sbBuffer.toString());
        
        System.out.println("Builder <-> Buffer conversion success");
    }
}