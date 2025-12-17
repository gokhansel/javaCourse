interface MyInterface {
    class NestedHelper {
        public void printMessage() {
            System.out.println("Привет из вложенного класса интерфейса!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyInterface.NestedHelper nestedObj = new MyInterface.NestedHelper();
        nestedObj.printMessage();
    }
}