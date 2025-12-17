class OuterContainer {
    
    // Внутренний класс
    class InnerItem {
        private String secret = "Secret  Inner Class";
        public int number = 100;
    }

    public void accessInnerMembers() {
        // Чтобы получить доступ, нужно сначала создать объект
        InnerItem item = new InnerItem();

        // Доступ к public полю
        System.out.println("Public: " + item.number);

        // Доступ к private полю (!)
        // Внешний класс имеет право читать приватные поля своего внутреннего класса
        System.out.println("Private: " + item.secret); 
    }
}

public class Main {
    public static void main(String[] args) {
        new OuterContainer().accessInnerMembers();
    }
}