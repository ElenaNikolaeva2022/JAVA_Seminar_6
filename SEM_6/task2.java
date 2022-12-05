
/**
* 1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от до 24.
* 2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите
* процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.  
* Для вычисления процента используйте формулу: 
* процент уникальных чисел = количество уникальных чисел 100 / общее количество чисел в массиве.
*/

// // Вариант 1.

// import java.util.*;

// public class task2 {
//     public static void main(String[] args) {
//         int[] array = new int[1000];
//         Random random = new Random();
//         for (int i = 0; i < 1000; i++) {
//             array[i] = random.nextInt(25);
//         }
//         percent(array);
//     }

//     private static void percent(int[] array) {
//         Set<Integer> set = new TreeSet<>();
//         for (int i = 0; i < array.length; i++) {
//             set.add(array[i]);
//         }
//             Iterator<Integer> iterator = set.iterator();

//         while (iterator.hasNext()) {
//             int iter = iterator.next();
//             int counter = 0;
//             for (Integer number : array) {
//                 if (iter == number) {
//                     counter++;
//                     if (counter == 2) {
//                         iterator.remove();
//                         break;
//                     }
//                 }
//             }
//         }
//         float result = set.size() * 100 / 1000;
//         // float result = set.size() * 100 / array.length;
//         System.out.println(result);
//     }
// }

// Вариант 2.

import java.util.*;

public class task2 {
    public static void main(String[] args) {
        Set<Integer> unique = new HashSet<>();
        int[] array = new int[1000];
        // 1 2 3 4 1 5 7
        f: for (int i = 0; i < array.length; i++) {
            int a = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int b = array[j];
                if (a == b) {
                    continue f;
                }
            }
            unique.add(a);
        }
    }
}
