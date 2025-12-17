import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class InputExample {
    public static void main(String[] args) {
        byte[] data = { 72, 101, 108, 108, 111 }; // ASCII коды для "Hello"
        
        try (InputStream input = new ByteArrayInputStream(data)) {
            int i;
            // Читаем по одному байту, пока read() не вернет -1
            while ((i = input.read()) != -1) {
                // Приводим байт к символу для вывода
                System.out.print((char) i); 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}