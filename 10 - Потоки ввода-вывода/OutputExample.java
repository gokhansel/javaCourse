import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.IOException;

public class OutputExample {
    public static void main(String[] args) {
        // Используем try-with-resources для автоматического закрытия
        try (OutputStream output = new FileOutputStream("output.txt")) {
            // Записываем код символа 'A' (65)
            output.write(65);
            
            // Записываем код символа 'B' (66)
            output.write(66);
            
            System.out.println("Данные записаны в файл output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}