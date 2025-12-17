public class VarExample {
    public static void main(String[] args) {
        var message = "Hello, Java"; // Компилятор видит строку -> тип String
        var number = 100;            // Компилятор видит целое число -> тип int
        var price = 19.99;           // Компилятор видит дробное -> тип double

        // number = "text"; // ОШИБКА! Переменная number уже определена как int.
        
        System.out.println(message.getClass()); // class java.lang.String
    }
}