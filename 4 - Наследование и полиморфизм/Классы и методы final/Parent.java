class Parent {
    public final void printMessage() {
        System.out.println("Этот метод нельзя изменить.");
    }
}

class Child extends Parent {
    /* * Ошибка произошел!
     * 'printMessage()' cannot override 'printMessage()' in 'Parent'; overridden method is final.
     * Попытка раскомментировать следующий код приведет к ошибке:
     */
    
    // @Override
    // public void printMessage() {
    //     System.out.println("Попытка переопределения.");
    // }
}


final class SecureClass {
    public void info() {
        System.out.println("Безопасный класс.");
    }
}

/* * Ошибка произошел!
 * Cannot inherit from final 'SecureClass'
 * Попытка наследования приведет к ошибке:
 */

// class HackerClass extends SecureClass {
//     
// }