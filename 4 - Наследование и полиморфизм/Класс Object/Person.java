import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        // 1. Рефлексивность: проверяем, ссылается ли объект сам на себя
        if (this == o) return true;
        
        // 2. Проверка на null и сравнение классов
        if (o == null || getClass() != o.getClass()) return false;
        
        // 3. Приведение типа (кастинг)
        Person person = (Person) o;
        
        // 4. Сравнение значимых полей (используем Objects.equals для защиты от null в полях)
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}