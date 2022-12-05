package CAT;

// import java.util.*;
// import java.util.concurrent.ThreadLocalRandom;

/**
* 1. Продумайте структуру класса Кот. 
* Какие поля и методы будут актуальны для приложения, которое является 
* a) информационной системой ветеринарной клиники 
* б) архивом выставки котов
* Можно записать в текстовом виде, не обязательно реализовывать в java.
*/

public class Main {
    public static void main(String[] args) {
        // Реляционные базы данных 

        Owner Igor = new Owner("8 800 555", " улица Космонавтов, дом 5");

        Cat cat = new Cat("Гав", 2, Igor);
        cat.doVoice();

        System.out.println(cat);
        System.out.println(cat.getOwnerNumber());

    }
}

/**
 * в Терминале будет:
 * Гав do meow  // кошка делает мяу
 * [Гав] {2}    // его отображения.
 * 8 800 555    // номер телефона
 */