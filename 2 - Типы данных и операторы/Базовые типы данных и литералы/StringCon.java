public class StringCon {
    public static void main(String[] args) {
        String str = "Result: ";
        int number = 10;
        double pi = 3.14;
        
        // 1. String + int
        String res1 = str + number; // "Result: 10"
        
        // 2. String + double + int (выполнение слева направо)
        String res2 = str + pi + number; // "Result: 3.1410"
        
        // 3. String + (арифметическое выражение)
        String res3 = str + (number + 5); // "Result: 15"
        
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}