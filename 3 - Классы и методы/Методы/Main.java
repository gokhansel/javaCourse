//1. Пример Перегрузки (Overloading)
// Методы находятся в одном классе, имеют одно имя, но разные аргументы.

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    // Перегрузка: изменение типа аргументов (double вместо int)
    public double add(double a, double b) {
        return a + b;
    }

    // Перегрузка: изменение количества аргументов (три вместо двух)
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

//2. Пример переопределине (Overriding)
// Подкласс изменяет реализацию метода, полученного от суперкласса.

class Animal {
    public void makeSound() {
        System.out.println("Животное издает звук");
    }
}

class Cat extends Animal {
    // Переопределение метода родителя (используем аннотацию @Override)
    @Override
    public void makeSound() {
        System.out.println("Мяу!");
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Сумма int: " + calc.add(2, 3));
        System.out.println("Сумма double: " + calc.add(2.5, 3.5));
        System.out.println("Сумма трех: " + calc.add(1, 2, 3));

        Animal myCat = new Cat();
        myCat.makeSound();
    }
}