public class ExceptionExample {
    public static void main(String[] args) {
        
        try {
            System.out.println("Attempted division by zero...");
            int result = 10 / 0; // Генерирует ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Exception successfully caught: Division by zero is not allowed!");
        }

        System.out.println("The program continues to run after interception...");
        String str = null;
        System.out.println(str.length()); // Генерирует NullPointerException
        
        // Этот код уже не выполнится
        System.out.println("This line will never be printed.");
    }
}