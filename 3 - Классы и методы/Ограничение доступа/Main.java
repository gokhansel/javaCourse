class AccessExamples {
    // 1. PUBLIC: Доступен везде (любой пакет, любой класс)
    public String publicVar = "Public: Доступен всем.";

    // 2. PROTECTED: Доступен внутри пакета + наследникам в других пакетах
    protected String protectedVar = "Protected: Доступен в пакете и подклассам.";

    // 3. DEFAULT (без модификатора): Доступен ТОЛЬКО внутри своего пакета
    String defaultVar = "Default: Доступен только в текущем пакете.";

    // 4. PRIVATE: Доступен ТОЛЬКО внутри этого класса (AccessExamples)
    private String privateVar = "Private: Скрыт от всех, кроме своего класса.";

    // Публичный метод, чтобы получить доступ к приватному полю
    public String getPrivateVar() {
        return this.privateVar;
    }
}

public class Main {
    public static void main(String[] args) {
        AccessExamples obj = new AccessExamples();

        // --- Доступные поля ---
        
        System.out.println("1. " + obj.publicVar);           // Public доступен всегда
        System.out.println("2. " + obj.protectedVar);     // Protected доступен, так как Main и AccessExamples в одном файле
        System.out.println("3. " + obj.defaultVar);         // Default доступен, так как Main и AccessExamples в одном файле

        // --- Недоступные поля ---
        // System.out.println(obj.privateVar); // <-- Если раскомментировать, программа не запустится

        System.out.println("4. Прямой доступ к 'private' полю невозможен.");
        System.out.println("   Но мы можем получить его через метод: " + obj.getPrivateVar());
    }
}