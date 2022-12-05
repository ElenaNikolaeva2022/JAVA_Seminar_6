/**
 * Создаете одно из множеств: Hash5et, Tree5et, LinkedHashSet (<Integer>)
 * Замеряете время заполнения каждого из них 250_888 числами.
 */

// import java.util.HashSet;
// import java.util.LinkedHashSet;
// import java.util.TreeSet;

// public class task1 {
// // ВАРИАНТ 1. Развёрнутый.
//     public static void main(String[] args) {
//         long amount = 1_000_000;

//         HashSet<Integer> hashSet = new HashSet<>();
//         long time = System.currentTimeMillis();
//         for (int i = 0; i < amount; i++) {
//             hashSet.add(i);
//         }

//         System.out.println("HashSet -> " + (System.currentTimeMillis() - time));

//         TreeSet<Integer> treeset = new TreeSet<>();
//         time = System.currentTimeMillis();
//         for (int i = 0; i < amount; i++) {
//             treeset.add(i);
//         }
//         System.out.println("TreeSet -> " + (System.currentTimeMillis() - time));

//         LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
//         time = System.currentTimeMillis();
//         for (int i = 0; i < amount; i++) {
//             linkedHashSet.add(i);
//         }
//         System.out.println("LinkedHashSet -> " + (System.currentTimeMillis() - time));
//     }
// }

// /**
//  * в Терминале получится (после каждого запуска числа будут разные):
//  * HashSet -> 197 
//  * TreeSet -> 381 
//  * LinkedHashSet -> 77
//  */

// ВАРИАНТ 2. Упрощённый.

import java.util.*;

public class task1 {
    public static void main(String[] args) {
        speedMeasurement(new HashSet<>());
        speedMeasurement(new TreeSet<>());
        speedMeasurement(new LinkedHashSet<>());
    }

    public static void speedMeasurement(Set<Integer> set) {

        long sumTime = 0;        
        for (int j = 0; j < 100; j++) {
            long time = System.currentTimeMillis();
            for (int i = 0; i < 250_000; i++) {
                set.add(i);
            }
            sumTime += System.currentTimeMillis() - time;
            set.clear();
        }
        System.out.println(sumTime / 100);

    }
}

// /**
//  * в Терминале получится (после каждого запуска числа будут разные):
//  * 11
//  * 33
//  * 7
//  */
