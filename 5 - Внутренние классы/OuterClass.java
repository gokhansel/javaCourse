class OuterClass {
    public String publicField = "Public";
    private String privateField = "Private";
    static String staticField = "Static";

    class InnerClass {
        public void accessOuter() {
            // Прямой доступ ко всем полям, включая private и static
            System.out.println("Вижу: " + publicField);
            System.out.println("Вижу: " + privateField); // Доступ есть!
            System.out.println("Вижу: " + staticField);
            
            // Если имена совпадают, используется ссылка OuterClass.this
            // System.out.println(OuterClass.this.privateField);
        }
    }
}