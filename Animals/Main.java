package Animals;
/**
* 1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. 
* Поместите в него некоторое количество объектов. 
* 2. Создайте 2 или более котов с одинаковыми параметрами в полях.
* Поместите их во множество. Убедитесь, что все они сохранились во множество. 
* 3. Создайте метод public boolean equals(Object a)
* Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. 
* То есть, метод должен возвращать true, только если значения 
* во всех полях сравниваемых объектов равны.
* 4. Создайте метод public int hashCode()
* который будет возвращать hash, вычисленный на основе полей класса Cat. 
* (Можно использовать Objects.hosh(…)) 
* 5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.
 */

import java.util.*;
// import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        Owner Igor = new Owner("8 800 555", "улица Космонавтов, дом 5");

        Cat cat = new Cat("Гав", 2, Igor);
        Cat cat2 = new Cat("Гав", 3, Igor);
        Dog dog = new Dog("Белка", 3, Igor);

        cat.doVoice();
        dog.doVoice();

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(cat.getOwnerNumber());

        System.out.println(cat.equals(dog));
        System.out.println(cat.equals(cat2));
    
        Set<Cat> cats = new HashSet<>();
        cats.add(cat);
        cats.add(cat2);

        System.out.println(cats);
    }
}


/**
 * в Терминале будет после запуска Run:
 * Гав do meow
 * Белка do bark
 * [Гав] {2}
 * [Белка] {3}
 * 8 800 555
 * false
 * true
 * [[Гав] {2}]
 */